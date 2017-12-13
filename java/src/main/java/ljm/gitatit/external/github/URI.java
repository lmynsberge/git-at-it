package ljm.gitatit.external.github;

import java.io.Serializable;

/**
 * @author lmynsberge
 *
 */
public class URI implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _url;

	public URI() {}
	
	public URI(String input) {
		this.setUrl(input);
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String url) {
		_url = url;
	}

}
