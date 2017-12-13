package ljm.gitatit.services;

import ljm.gitatit.data.MemPullRequestRepository;

public class RequestRunner {
	public static void main(String[] args) throws Exception {
		
		// Create the Github service (this way, the factory can choose between REST or GraphQL)
		IRepoService ghService = RepositoryServicesFactory.CreatePullRequest(RepositoryType.Github);
		
		// Make the request to get the data
		MemoryLogger memoryLogger = new MemoryLogger();
		RepositoryServicesFactory.MakePullRequest(ghService, "ramda", "ramda", memoryLogger);
		
		// Exit early if there were errors
		if(!memoryLogger.GetLoggedErrors().isEmpty()) {
			for(String error : memoryLogger.GetLoggedErrors()) {
				System.out.println(error);
			}
			return;
		}
		
		// Create our in memory repository and load the data
		MemPullRequestRepository inMemoryPulls = new MemPullRequestRepository();
		RepositoryServicesFactory.GetPullRequestData(inMemoryPulls, ghService);
		
		// Perform any mutations/analyses below
	}
}
