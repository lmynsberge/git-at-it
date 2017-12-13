package ljm.gitatit.external.github;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RequestedReviewers extends ArrayList<User> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<User> _requestedReviewers;

	public ArrayList<User> getRequestedReviewers() {
		return _requestedReviewers;
	}

	public void setRequestedReviewers(ArrayList<User> requestedReviewers) {
		_requestedReviewers = requestedReviewers;
	}
}
