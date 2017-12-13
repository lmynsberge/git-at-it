package ljm.gitatit.external.github;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class License implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _key;
	private String _name;
	private String _spdxId;
	private URI _url;
	private URI _htmlUrl;
	
	public License() {}

	@XmlElement(name = "key")
	public String getKey() {
		return _key;
	}

	public void setKey(String key) {
		_key = key;
	}

	@XmlElement(name = "name")
	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	@XmlElement(name = "spdx_id")
	public String getSpdxId() {
		return _spdxId;
	}

	public void setSpdxId(String spdxId) {
		_spdxId = spdxId;
	}

	@XmlElement(name = "url")
	public URI getUrl() {
		return _url;
	}

	public void setUrl(URI url) {
		_url = url;
	}

	@XmlElement(name = "html_url")
	public URI getHtmlUrl() {
		return _htmlUrl;
	}

	public void setHtmlUrl(URI htmlUrl) {
		_htmlUrl = htmlUrl;
	}
	
}
