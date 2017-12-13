package ljm.gitatit.external.github;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author lmynsberge
 *
 */
public class Ref implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _label;
	private String _ref;
	private String _sha;
	private User _user;
	private Repository _repo;

	public Ref() {}

	@XmlElement(name = "label")
	public String getLabel() {
		return _label;
	}

	public void setLabel(String label) {
		_label = label;
	}

	@XmlElement(name = "ref")
	public String getRef() {
		return _ref;
	}

	public void setRef(String ref) {
		_ref = ref;
	}

	@XmlElement(name = "sha")
	public String getSha() {
		return _sha;
	}

	public void setSha(String sha) {
		_sha = sha;
	}

	@XmlElement(name = "user")
	public User getUser() {
		return _user;
	}

	public void setUser(User user) {
		_user = user;
	}

	@XmlElement(name = "repo")
	public Repository getRepo() {
		return _repo;
	}

	public void setRepo(Repository repo) {
		_repo = repo;
	}
	

}
