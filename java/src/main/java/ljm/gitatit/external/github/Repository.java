package ljm.gitatit.external.github;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author lmynsberge
 *
 */
public class Repository implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _id;
	private String _name;
	private String _fullName;
	private User _owner;
	private Boolean _private;
	private URI _htmlUrl;
	private String _description;
	private Boolean _isFork;
	private URI _url;
	private URI _forksUrl;
	private URI _keysUrl;
	private URI _collaboratorsUrl;
	private URI _teamsUrl;
	private URI _hooksUrl;
	private URI _issueEventsUrl;
	private URI _eventsUrl;
	private URI _assigneesUrl;
	private URI _branchesUrl;
	private URI _tagsUrl;
	private URI _blobsUrl;
	private URI _gitTagsUrl;
	private URI _gitRefsUrl;
	private URI _treesUrl;
	private URI _statusesUrl;
	private URI _languagesUrl;
	private URI _stargazersUrl;
	private URI _contributorsUrl;
	private URI _subscribersUrl;
	private URI _subscriptionUrl;
	private URI _commitsUrl;
	private URI _gitCommitsUrl;
	private URI _commentsUrl;
	private URI _issueCommentUrl;
	private URI _contentsUrl;
	private URI _compareUrl;
	private URI _mergesUrl;
	private URI _archiveUrl;
	private URI _downloadsUrl;
	private URI _issuesUrl;
	private URI _pullsUrl;
	private URI _milestonesUrl;
	private URI _notificationsUrl;
	private URI _labelsUrl;
	private URI _releasesUrl;
	private URI _deploymentsUrl;
	private Date _createdAt;
	private Date _updatedAt;
	private Date _pushedAt;
	private URI _gitUrl;
	private URI _sshUrl;
	private URI _cloneUrl;
	private URI _svnUrl;
	private URI _homepage;
	private int _size;
	private int _stargazersCount;
	private int _watchersCount;
	private String _language;
	private Boolean _hasIssues;
	private Boolean _hasProjects;
	private Boolean _hasDownloads;
	private Boolean _hasWiki;
	private Boolean _hasPages;
	private int _forksCount;
	private URI _mirrorUrl;
	private Boolean _isArchived;
	private int _openIssuesCount;
	private License _license;
	private int _forks;
	private int _openIssues;
	private int _watchers;
	private String _defaultBranch;
	
	public Repository() {}

	@XmlElement(name = "id")
	public String getId() {
		return _id;
	}

	public void setId(String id) {
		_id = id;
	}

	@XmlElement(name = "name")
	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	@XmlElement(name = "full_name")
	public String getFullName() {
		return _fullName;
	}

	public void setFullName(String fullName) {
		_fullName = fullName;
	}

	@XmlElement(name = "owner")
	public User getOwner() {
		return _owner;
	}

	public void setOwner(User owner) {
		_owner = owner;
	}

	@XmlElement(name = "private")
	public Boolean getPrivate() {
		return _private;
	}

	public void setPrivate(Boolean private1) {
		_private = private1;
	}

	@XmlElement(name = "html_url")
	public URI getHtmlUrl() {
		return _htmlUrl;
	}

	public void setHtmlUrl(URI htmlUrl) {
		_htmlUrl = htmlUrl;
	}

	@XmlElement(name = "description")
	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	@XmlElement(name = "fork")
	public Boolean getIsFork() {
		return _isFork;
	}

	public void setIsFork(Boolean isFork) {
		_isFork = isFork;
	}

	@XmlElement(name = "url")
	public URI getUrl() {
		return _url;
	}

	public void setUrl(URI url) {
		_url = url;
	}

	@XmlElement(name = "forks_url")
	public URI getForksUrl() {
		return _forksUrl;
	}

	public void setForksUrl(URI forksUrl) {
		_forksUrl = forksUrl;
	}

	@XmlElement(name = "keys_url")
	public URI getKeysUrl() {
		return _keysUrl;
	}

	public void setKeysUrl(URI keysUrl) {
		_keysUrl = keysUrl;
	}

	@XmlElement(name = "collaborators_url")
	public URI getCollaboratorsUrl() {
		return _collaboratorsUrl;
	}

	public void setCollaboratorsUrl(URI collaboratorsUrl) {
		_collaboratorsUrl = collaboratorsUrl;
	}

	@XmlElement(name = "teams_url")
	public URI getTeamsUrl() {
		return _teamsUrl;
	}

	public void setTeamsUrl(URI teamsUrl) {
		_teamsUrl = teamsUrl;
	}

	@XmlElement(name = "hooks_url")
	public URI getHooksUrl() {
		return _hooksUrl;
	}

	public void setHooksUrl(URI hooksUrl) {
		_hooksUrl = hooksUrl;
	}

	@XmlElement(name = "issue_events_url")
	public URI getIssueEventsUrl() {
		return _issueEventsUrl;
	}

	public void setIssueEventsUrl(URI issueEventsUrl) {
		_issueEventsUrl = issueEventsUrl;
	}

	@XmlElement(name = "events_url")
	public URI getEventsUrl() {
		return _eventsUrl;
	}

	public void setEventsUrl(URI eventsUrl) {
		_eventsUrl = eventsUrl;
	}

	@XmlElement(name = "assignees_url")
	public URI getAssigneesUrl() {
		return _assigneesUrl;
	}

	public void setAssigneesUrl(URI assigneesUrl) {
		_assigneesUrl = assigneesUrl;
	}

	@XmlElement(name = "branches_url")
	public URI getBranchesUrl() {
		return _branchesUrl;
	}

	public void setBranchesUrl(URI branchesUrl) {
		_branchesUrl = branchesUrl;
	}

	@XmlElement(name = "tags_url")
	public URI getTagsUrl() {
		return _tagsUrl;
	}

	public void setTagsUrl(URI tagsUrl) {
		_tagsUrl = tagsUrl;
	}

	@XmlElement(name = "blobs_url")
	public URI getBlobsUrl() {
		return _blobsUrl;
	}

	public void setBlobsUrl(URI blobsUrl) {
		_blobsUrl = blobsUrl;
	}

	@XmlElement(name = "git_tags_url")
	public URI getGitTagsUrl() {
		return _gitTagsUrl;
	}

	public void setGitTagsUrl(URI gitTagsUrl) {
		_gitTagsUrl = gitTagsUrl;
	}

	@XmlElement(name = "git_refs_url")
	public URI getGitRefsUrl() {
		return _gitRefsUrl;
	}

	public void setGitRefsUrl(URI gitRefsUrl) {
		_gitRefsUrl = gitRefsUrl;
	}
	
	@XmlElement(name = "trees_url")
	public URI getTreesUrl() {
		return _treesUrl;
	}

	public void setTreesUrl(URI treesUrl) {
		_treesUrl = treesUrl;
	}

	@XmlElement(name = "statuses_url")
	public URI getStatusesUrl() {
		return _statusesUrl;
	}

	public void setStatusesUrl(URI statusesUrl) {
		_statusesUrl = statusesUrl;
	}

	@XmlElement(name = "languages_url")
	public URI getLanguagesUrl() {
		return _languagesUrl;
	}

	public void setLanguagesUrl(URI languagesUrl) {
		_languagesUrl = languagesUrl;
	}

	@XmlElement(name = "stargazers_url")
	public URI getStargazersUrl() {
		return _stargazersUrl;
	}

	public void setStargazersUrl(URI stargazersUrl) {
		_stargazersUrl = stargazersUrl;
	}

	@XmlElement(name = "contributors_url")
	public URI getContributorsUrl() {
		return _contributorsUrl;
	}

	public void setContributorsUrl(URI contributorsUrl) {
		_contributorsUrl = contributorsUrl;
	}

	@XmlElement(name = "subscribers_url")
	public URI getSubscribersUrl() {
		return _subscribersUrl;
	}

	public void setSubscribersUrl(URI subscribersUrl) {
		_subscribersUrl = subscribersUrl;
	}

	@XmlElement(name = "subscription_url")
	public URI getSubscriptionUrl() {
		return _subscriptionUrl;
	}

	public void setSubscriptionUrl(URI subscriptionUrl) {
		_subscriptionUrl = subscriptionUrl;
	}

	@XmlElement(name = "commits_url")
	public URI getCommitsUrl() {
		return _commitsUrl;
	}

	public void setCommitsUrl(URI commitsUrl) {
		_commitsUrl = commitsUrl;
	}

	@XmlElement(name = "git_commits_url")
	public URI getGitCommitsUrl() {
		return _gitCommitsUrl;
	}

	public void setGitCommitsUrl(URI gitCommitsUrl) {
		_gitCommitsUrl = gitCommitsUrl;
	}

	@XmlElement(name = "comments_url")
	public URI getCommentsUrl() {
		return _commentsUrl;
	}

	public void setCommentsUrl(URI commentsUrl) {
		_commentsUrl = commentsUrl;
	}

	@XmlElement(name = "issue_comment_url")
	public URI getIssueCommentUrl() {
		return _issueCommentUrl;
	}

	public void setIssueCommentUrl(URI issueCommentUrl) {
		_issueCommentUrl = issueCommentUrl;
	}

	@XmlElement(name = "contents_url")
	public URI getContentsUrl() {
		return _contentsUrl;
	}

	public void setContentsUrl(URI contentsUrl) {
		_contentsUrl = contentsUrl;
	}

	@XmlElement(name = "compare_url")
	public URI getCompareUrl() {
		return _compareUrl;
	}

	public void setCompareUrl(URI compareUrl) {
		_compareUrl = compareUrl;
	}

	@XmlElement(name = "merges_url")
	public URI getMergesUrl() {
		return _mergesUrl;
	}

	public void setMergesUrl(URI mergesUrl) {
		_mergesUrl = mergesUrl;
	}

	@XmlElement(name = "archive_url")
	public URI getArchiveUrl() {
		return _archiveUrl;
	}

	public void setArchiveUrl(URI archiveUrl) {
		_archiveUrl = archiveUrl;
	}

	@XmlElement(name = "downloads_url")
	public URI getDownloadsUrl() {
		return _downloadsUrl;
	}

	public void setDownloadsUrl(URI downloadsUrl) {
		_downloadsUrl = downloadsUrl;
	}

	@XmlElement(name = "issues_url")
	public URI getIssuesUrl() {
		return _issuesUrl;
	}

	public void setIssuesUrl(URI issuesUrl) {
		_issuesUrl = issuesUrl;
	}

	@XmlElement(name = "pulls_url")
	public URI getPullsUrl() {
		return _pullsUrl;
	}

	public void setPullsUrl(URI pullsUrl) {
		_pullsUrl = pullsUrl;
	}

	@XmlElement(name = "milestones_url")
	public URI getMilestonesUrl() {
		return _milestonesUrl;
	}

	public void setMilestonesUrl(URI milestonesUrl) {
		_milestonesUrl = milestonesUrl;
	}

	@XmlElement(name = "notifications_url")
	public URI getNotificationsUrl() {
		return _notificationsUrl;
	}

	public void setNotificationsUrl(URI notificationsUrl) {
		_notificationsUrl = notificationsUrl;
	}

	@XmlElement(name = "labels_url")
	public URI getLabelsUrl() {
		return _labelsUrl;
	}

	public void setLabelsUrl(URI labelsUrl) {
		_labelsUrl = labelsUrl;
	}

	@XmlElement(name = "releases_url")
	public URI getReleasesUrl() {
		return _releasesUrl;
	}

	public void setReleasesUrl(URI releasesUrl) {
		_releasesUrl = releasesUrl;
	}

	@XmlElement(name = "deployments_url")
	public URI getDeploymentsUrl() {
		return _deploymentsUrl;
	}

	public void setDeploymentsUrl(URI deploymentsUrl) {
		_deploymentsUrl = deploymentsUrl;
	}

	@XmlElement(name = "created_at")
	public Date getCreatedAt() {
		return _createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		_createdAt = createdAt;
	}

	@XmlElement(name = "updated_at")
	public Date getUpdatedAt() {
		return _updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		_updatedAt = updatedAt;
	}

	@XmlElement(name = "pushed_at")
	public Date getPushedAt() {
		return _pushedAt;
	}

	public void setPushedAt(Date pushedAt) {
		_pushedAt = pushedAt;
	}

	@XmlElement(name = "git_url")
	public URI getGitUrl() {
		return _gitUrl;
	}

	public void setGitUrl(URI gitUrl) {
		_gitUrl = gitUrl;
	}

	@XmlElement(name = "ssh_url")
	public URI getSshUrl() {
		return _sshUrl;
	}

	public void setSshUrl(URI sshUrl) {
		_sshUrl = sshUrl;
	}

	@XmlElement(name = "clone_url")
	public URI getCloneUrl() {
		return _cloneUrl;
	}

	public void setCloneUrl(URI cloneUrl) {
		_cloneUrl = cloneUrl;
	}

	@XmlElement(name = "svn_url")
	public URI getSvnUrl() {
		return _svnUrl;
	}

	public void setSvnUrl(URI svnUrl) {
		_svnUrl = svnUrl;
	}

	@XmlElement(name = "homepage")
	public URI getHomepage() {
		return _homepage;
	}

	public void setHomepage(URI homepage) {
		_homepage = homepage;
	}

	@XmlElement(name = "size")
	public int getSize() {
		return _size;
	}

	public void setSize(int size) {
		_size = size;
	}

	@XmlElement(name = "stargazers_count")
	public int getStargazersCount() {
		return _stargazersCount;
	}

	public void setStargazersCount(int stargazersCount) {
		_stargazersCount = stargazersCount;
	}

	@XmlElement(name = "watchers_count")
	public int getWatchersCount() {
		return _watchersCount;
	}

	public void setWatchersCount(int watchersCount) {
		_watchersCount = watchersCount;
	}

	@XmlElement(name = "language")
	public String getLanguage() {
		return _language;
	}

	public void setLanguage(String language) {
		_language = language;
	}

	@XmlElement(name = "has_issues")
	public Boolean getHasIssues() {
		return _hasIssues;
	}

	public void setHasIssues(Boolean hasIssues) {
		_hasIssues = hasIssues;
	}

	@XmlElement(name = "has_projects")
	public Boolean getHasProjects() {
		return _hasProjects;
	}

	public void setHasProjects(Boolean hasProjects) {
		_hasProjects = hasProjects;
	}

	@XmlElement(name = "has_downloads")
	public Boolean getHasDownloads() {
		return _hasDownloads;
	}

	public void setHasDownloads(Boolean hasDownloads) {
		_hasDownloads = hasDownloads;
	}

	@XmlElement(name = "has_wiki")
	public Boolean getHasWiki() {
		return _hasWiki;
	}

	public void setHasWiki(Boolean hasWiki) {
		_hasWiki = hasWiki;
	}

	@XmlElement(name = "has_pages")
	public Boolean getHasPages() {
		return _hasPages;
	}

	public void setHasPages(Boolean hasPages) {
		_hasPages = hasPages;
	}

	@XmlElement(name = "forks_count")
	public int getForksCount() {
		return _forksCount;
	}

	public void setForksCount(int forksCount) {
		_forksCount = forksCount;
	}

	@XmlElement(name = "mirror_url")
	public URI getMirrorUrl() {
		return _mirrorUrl;
	}

	public void setMirrorUrl(URI mirrorUrl) {
		_mirrorUrl = mirrorUrl;
	}

	@XmlElement(name = "archived")
	public Boolean getIsArchived() {
		return _isArchived;
	}

	public void setIsArchived(Boolean isArchived) {
		_isArchived = isArchived;
	}

	@XmlElement(name = "open_issues_count")
	public int getOpenIssuesCount() {
		return _openIssuesCount;
	}

	public void setOpenIssuesCount(int openIssuesCount) {
		_openIssuesCount = openIssuesCount;
	}

	@XmlElement(name = "license")
	public License getLicense() {
		return _license;
	}

	public void setLicense(License license) {
		_license = license;
	}

	@XmlElement(name = "forks")
	public int getForks() {
		return _forks;
	}

	public void setForks(int forks) {
		_forks = forks;
	}

	@XmlElement(name = "open_issues")
	public int getOpenIssues() {
		return _openIssues;
	}

	public void setOpenIssues(int openIssues) {
		_openIssues = openIssues;
	}

	@XmlElement(name = "watchers")
	public int getWatchers() {
		return _watchers;
	}

	public void setWatchers(int watchers) {
		_watchers = watchers;
	}

	@XmlElement(name = "default_branch")
	public String getDefaultBranch() {
		return _defaultBranch;
	}

	public void setDefaultBranch(String defaultBranch) {
		_defaultBranch = defaultBranch;
	}
	

}
