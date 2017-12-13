package ljm.gitatit.external.github;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient; 

/**
 * @author lmynsberge
 *
 */
@XmlRootElement(name = "PullRequest")
public class PullRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private URI _url;
	private String _id;
	private URI _htmlUrl;
	private URI _diffUrl;
	private URI _patchUrl;
	private URI _issueUrl;
	private int _number;
	private State _state;
	private Boolean _locked;
	private String _title;
	private User _user;
	private String _body;
	private Date _createdAt;
	private Date _updatedAt;
	private Date _closedAt;
	private Date _mergedAt;
	private String _mergeCommitSHA;
	private User _assignee;
	private ArrayList<User> _assignees;
	private ArrayList<User> _requestedReviewers;
	private Milestone _milestone;
	private URI _commitsUrl;
	private URI _reviewCommentsUrl;
	private URI _reivewCommentUrl;
	private URI _commentsUrl;
	private URI _statusesUrl;
	private Ref _head;
	private Ref _base;
	private String _authorAssociation;
	private Object _links;
	
	public PullRequest() {}

	@XmlElement(name = "url")
	public URI getUrl() {
		return _url;
	}

	public void setUrl(URI url) {
		_url = url;
	}

	@XmlElement(name = "id")
	public String getId() {
		return _id;
	}

	public void setId(String id) {
		_id = id;
	}

	@XmlElement(name = "html_url")
	public URI getHtmlUrl() {
		return _htmlUrl;
	}

	public void setHtmlUrl(URI htmlUrl) {
		_htmlUrl = htmlUrl;
	}

	@XmlElement(name = "diff_url")
	public URI getDiffUrl() {
		return _diffUrl;
	}

	public void setDiffUrl(URI diffUrl) {
		_diffUrl = diffUrl;
	}

	@XmlElement(name = "patch_url")
	public URI getPatchUrl() {
		return _patchUrl;
	}

	public void setPatchUrl(URI patchUrl) {
		_patchUrl = patchUrl;
	}

	@XmlElement(name = "issue_url")
	public URI getIssueUrl() {
		return _issueUrl;
	}

	public void setIssueUrl(URI issueUrl) {
		_issueUrl = issueUrl;
	}

	@XmlElement(name = "number")
	public float getNumber() {
		return _number;
	}

	public void setNumber(int number) {
		_number = number;
	}

	@XmlElement(name = "state")
	public State getState() {
		return _state;
	}

	public void setState(State state) {
		_state = state;
	}

	@XmlElement(name = "locked")
	public Boolean getLocked() {
		return _locked;
	}

	public void setLocked(Boolean locked) {
		_locked = locked;
	}

	@XmlElement(name = "title")
	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	@XmlElement(name = "user")
	public User getUser() {
		return _user;
	}

	public void setUser(User user) {
		_user = user;
	}

	@XmlElement(name = "body")
	public String getBody() {
		return _body;
	}

	public void setBody(String body) {
		_body = body;
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

	@XmlElement(name = "closed_at")
	public Date getClosedAt() {
		return _closedAt;
	}

	public void setClosedAt(Date closedAt) {
		_closedAt = closedAt;
	}

	@XmlElement(name = "merged_at")
	public Date getMergedAt() {
		return _mergedAt;
	}

	public void setMergedAt(Date mergedAt) {
		_mergedAt = mergedAt;
	}

	@XmlElement(name = "merge_commit_sha")
	public String getMergeCommitSHA() {
		return _mergeCommitSHA;
	}

	public void setMergeCommitSHA(String mergeCommitSHA) {
		_mergeCommitSHA = mergeCommitSHA;
	}

	@XmlElement(name = "assignee")
	public User getAssignee() {
		return _assignee;
	}

	public void setAssignee(User assignee) {
		_assignee = assignee;
	}

	@XmlElement(name = "assignees")
	public ArrayList<User> getAssignees() {
		return _assignees;
	}

	public void setAssignees(ArrayList<User> assignees) {
		_assignees = assignees;
	}

	@XmlElement(name = "requested_reviewers")
	public ArrayList<User> getRequestedReviewers() {
		return _requestedReviewers;
	}

	public void setRequestedReviewers(ArrayList<User> requestedReviewers) {
		_requestedReviewers = requestedReviewers;
	}

	@XmlElement(name = "milestone")
	public Milestone getMilestone() {
		return _milestone;
	}

	public void setMilestone(Milestone milestone) {
		_milestone = milestone;
	}

	@XmlElement(name = "commits_url")
	public URI getCommitsUrl() {
		return _commitsUrl;
	}

	public void setCommitsUrl(URI commitsUrl) {
		_commitsUrl = commitsUrl;
	}

	@XmlElement(name = "review_comments_url")
	public URI getReviewCommentsUrl() {
		return _reviewCommentsUrl;
	}

	public void setReviewCommentsUrl(URI reviewCommentsUrl) {
		_reviewCommentsUrl = reviewCommentsUrl;
	}

	@XmlElement(name = "review_comment_url")
	public URI getReivewCommentUrl() {
		return _reivewCommentUrl;
	}

	public void setReivewCommentUrl(URI reivewCommentUrl) {
		_reivewCommentUrl = reivewCommentUrl;
	}

	@XmlElement(name = "comments_url")
	public URI getCommentsUrl() {
		return _commentsUrl;
	}

	public void setCommentsUrl(URI commentsUrl) {
		_commentsUrl = commentsUrl;
	}

	@XmlElement(name = "statuses_url")
	public URI getStatusesUrl() {
		return _statusesUrl;
	}

	public void setStatusesUrl(URI statusesUrl) {
		_statusesUrl = statusesUrl;
	}

	@XmlElement(name = "head")
	public Ref getHead() {
		return _head;
	}

	public void setHead(Ref head) {
		_head = head;
	}

	@XmlElement(name = "base")
	public Ref getBase() {
		return _base;
	}

	public void setBase(Ref base) {
		_base = base;
	}
	
	@XmlElement(name = "_links")
	public Object getLinks() {
		return _links;
	}
	
	public void setLinks(Object links) {
		_links = links;
	}
	
	@XmlElement(name = "author_association")
	public String getAuthorAssociation() {
		return _authorAssociation;
	}

	public void setAuthorAssociation(String authorAssociation) {
		_authorAssociation = authorAssociation;
	}
	
	
}

