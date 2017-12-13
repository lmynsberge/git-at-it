package ljm.gitatit.services;

import ljm.gitatit.data.IPullRequestRepository;
import ljm.gitatit.external.github.State;

/**
 * 
 * @author lmynsberge
 * Contains factory methods for making requests and gathering responses
 */
public class RepositoryServicesFactory {
	
	/**
	 * Creates the service object for the repo
	 * @param type - The repository to make the pull request to
	 * @throws Exception 
	 */
	public static IRepoService CreatePullRequest(RepositoryType type) throws Exception {
		
		if (type == RepositoryType.Github) {
			GithubRESTService service = new GithubRESTService();
			return service;
		}
		// Could add GraphQL for Github or Bitbucket here
		else {
			throw new Exception("No RepositoryType was passed.");
		}
	}
	
	/**
	 * Makes the actual request to the repository
	 * @param service The service object
	 * @param organization The organization to request or
	 * @param repository The repository to request for
	 */
public static void MakePullRequest(IRepoService service, String organization, String repository, ILogger logger) {
		
		MakePullRequest(service, organization, repository, logger, State.open);
	}
	public static void MakePullRequest(IRepoService service, String organization, String repository, ILogger logger, State state) {
		
		if (service.getClass() == GithubRESTService.class) {
			GithubRESTService githubService = (GithubRESTService)service;
			githubService.setLogger(logger);
			githubService.setOrganization(organization);
			githubService.setRepository(repository);
			githubService.setRepoState(state);
			githubService.MakeRequest(null);
			return;
		}
	}
	
	/**
	 * Populates request data into a pull request repository of the caller's choosing
	 * @param service The service object
	 * @return A PullRequestList object
	 */
	public static void GetPullRequestData(IPullRequestRepository pullRequestRepo, IRepoService service) {
		
		if (service.getClass() == GithubRESTService.class) {
			GithubRESTService githubService = (GithubRESTService)service;
			pullRequestRepo.save(githubService.GetResponse());
		}
		
		return;
	}
	
	/*
	 * Future repo requests should go here
	 */
}
