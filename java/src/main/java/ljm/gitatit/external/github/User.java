package ljm.gitatit.external.github;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author lmynsberge
 *
 */
@XmlRootElement
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _login;
	private String _id;
	private URI _avatarUrl;
	private String _gravatarId;
	private URI _url;
	private URI _htmlUrl;
	private URI _followersUrl;
	private URI _followingUrl;
	private URI _gistsUrl;
	private URI _starredUrl;
	private URI _subscriptionsUrl;
	private URI _organizationsUrl;
	private URI _reposUrl;
	private URI _eventsUrl;
	private URI _receivedEventsUrl;
	private String _type;
	private Boolean _siteAdmin;

	public User() {}

	@XmlElement(name = "login")
	public String getLogin() {
		return _login;
	}

	public void setLogin(String login) {
		_login = login;
	}

	@XmlElement(name = "id")
	public String getId() {
		return _id;
	}

	public void setId(String id) {
		_id = id;
	}

	@XmlElement(name = "avatar_url")
	public URI getAvatarUrl() {
		return _avatarUrl;
	}

	public void setAvatarUrl(URI avatarUrl) {
		_avatarUrl = avatarUrl;
	}

	@XmlElement(name = "gravatar_id", nillable = true)
	public String getGravatarId() {
		return _gravatarId;
	}

	public void setGravatarId(String gravatarId) {
		_gravatarId = gravatarId;
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

	@XmlElement(name = "followers_url")
	public URI getFollowersUrl() {
		return _followersUrl;
	}

	public void setFollowersUrl(URI followersUrl) {
		_followersUrl = followersUrl;
	}

	@XmlElement(name = "following_url")
	public URI getFollowingUrl() {
		return _followingUrl;
	}

	public void setFollowingUrl(URI followingUrl) {
		_followingUrl = followingUrl;
	}

	@XmlElement(name = "gists_url")
	public URI getGistsUrl() {
		return _gistsUrl;
	}

	public void setGistsUrl(URI gistsUrl) {
		_gistsUrl = gistsUrl;
	}

	@XmlElement(name = "starred_url")
	public URI getStarredUrl() {
		return _starredUrl;
	}

	public void setStarredUrl(URI starredUrl) {
		_starredUrl = starredUrl;
	}

	@XmlElement(name = "subscriptions_url")
	public URI getSubscriptionsUrl() {
		return _subscriptionsUrl;
	}

	public void setSubscriptionsUrl(URI subscriptionsUrl) {
		_subscriptionsUrl = subscriptionsUrl;
	}

	@XmlElement(name = "organizations_url")
	public URI getOrganizationsUrl() {
		return _organizationsUrl;
	}

	public void setOrganizationsUrl(URI organizationsUrl) {
		_organizationsUrl = organizationsUrl;
	}

	@XmlElement(name = "repos_url")
	public URI getReposUrl() {
		return _reposUrl;
	}

	public void setReposUrl(URI reposUrl) {
		_reposUrl = reposUrl;
	}

	@XmlElement(name = "events_url")
	public URI getEventsUrl() {
		return _eventsUrl;
	}

	public void setEventsUrl(URI eventsUrl) {
		_eventsUrl = eventsUrl;
	}

	@XmlElement(name = "received_events_url")
	public URI getReceivedEventsUrl() {
		return _receivedEventsUrl;
	}

	public void setReceivedEventsUrl(URI receivedEventsUrl) {
		_receivedEventsUrl = receivedEventsUrl;
	}

	@XmlElement(name = "type")
	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	@XmlElement(name = "site_admin")
	public Boolean getSiteAdmin() {
		return _siteAdmin;
	}

	public void setSiteAdmin(Boolean siteAdmin) {
		_siteAdmin = siteAdmin;
	}
	
	

}
