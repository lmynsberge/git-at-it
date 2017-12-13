package ljm.gitatit.services;

import java.io.Serializable;
import java.util.ArrayList;

import ljm.gitatit.data.PullRequest;

/**
 * Defines required implementation for API services of repositories
 * @author lmynsberge
 *
 */
public interface IRepoService extends ILoggable {

	ArrayList<PullRequest> GetResponse();
	
	void MakeRequest(Serializable requestObject);
	
}
