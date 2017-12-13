package ljm.gitatit.data;

/**
 * For now, just use the Github object since that's all we have.
 * Realistically, we'd want to create an internal model that we could store.
 * @author lmynsberge
 *
 */
public class PullRequest {

	private ljm.gitatit.external.github.PullRequest _internalPullRequest;
	
	public PullRequest() {
		this._internalPullRequest = new ljm.gitatit.external.github.PullRequest();
	}
	
	public PullRequest(ljm.gitatit.external.github.PullRequest request) {
		this.setInternalPullRequest(request);
	}

	public ljm.gitatit.external.github.PullRequest getInternalPullRequest() {
		return _internalPullRequest;
	}

	public void setInternalPullRequest(ljm.gitatit.external.github.PullRequest internalPullRequest) {
		_internalPullRequest = internalPullRequest;
	}
	
}
