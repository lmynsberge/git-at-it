package ljm.gitatit.external.github;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement; 

/**
 * @author lmynsberge
 *
 */
@XmlRootElement(name = "PullRequests")
public class PullRequests implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<PullRequest> _pullrequests;

	public PullRequests() {}
	
	
	public ArrayList<PullRequest> getPullrequests() {
		return _pullrequests;
	}

	public void setPullrequests(ArrayList<PullRequest> pullrequests) {
		_pullrequests = pullrequests;
	}

	
}