package ljm.gitatit.data;

import java.util.ArrayList;

/**
 * An in memory storage of pull requests
 * @author lmynsberge
 *
 */
public class MemPullRequestRepository implements IPullRequestRepository {

	private ArrayList<PullRequest> _pullRequests;
	
	public MemPullRequestRepository() {
		this._pullRequests = new ArrayList<PullRequest>();
	}
	
	@Override
	public PullRequest save(PullRequest pullRequest) {
		this._pullRequests.add(pullRequest);
		return pullRequest;
	}

	@Override
	public PullRequest pop() {
		if(!this._pullRequests.isEmpty()) {
			int last = this._pullRequests.size()-1;
			PullRequest lastRequest = this._pullRequests.get(last);
			this._pullRequests.remove(last);
			return lastRequest;
		}
		return null;
	}

	@Override
	public void save(ArrayList<PullRequest> pullRequests) {
		this._pullRequests.addAll(pullRequests);
		return;
	}

}
