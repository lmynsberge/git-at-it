package ljm.gitatit.data;

import java.util.ArrayList;

/**
 * A pull request "repository" (not to be confused with Github repository)
 *  for access to the data. Could be a JDBC connection, text file, in memory
 * @author lmynsberge
 *
 */
public interface IPullRequestRepository {

	PullRequest save(PullRequest pullRequest);
	
	void save(ArrayList<PullRequest> pullRequests);
	
	PullRequest pop();
  
	// Other examples of what could be done:
	// PullRequest findByUser(User user);
	// PullRequest findByDate(Date date);

}
