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
@XmlRootElement(name = "PullRequestList")
public class GQLPullRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public GQLPullRequest() {}
	
	private ArrayList<User> _assignees;
	
	private int _additions;
	// The number of additions in this pull request.

	private Actor _author;
	// The actor who authored the comment.

	private CommentAuthorAssociation _authorAssociation;
	// Author's association with the subject of the comment.

	private Ref _baseRef;
	// Identifies the base Ref associated with the pull request.

	private String _baseRefName;
	// Identifies the name of the base Ref associated with the pull request, even if the ref has been deleted.

	private String _body;
	// Identifies the body of the pull request.

	private HTML _bodyHTML;
	// Identifies the body of the pull request rendered to HTML.

	private String _bodyText;
	// Identifies the body of the pull request rendered to text.
    
	private int _changedFiles;
	// The number of changed files in this pull request.

	private Boolean _closed;
	// true if the pull request is closed

	private Date _closedAt;
	// Identifies the date and time when the object was closed.

	private Date _createdAt;
	// Identifies the date and time when the object was created.

	private Boolean _createdViaEmail;
	// Check if this comment was created via an email reply.
	
	private int _databaseId;
	// Identifies the primary key from the database.

	private int _deletions;
	// The number of deletions in this pull request.

	private Actor _editor;
	// The actor who edited this pull request's body.

	private Ref _headRef;
	// Identifies the head Ref associated with the pull request.

	private String _headRefName;
	// Identifies the name of the head Ref associated with the pull request, even if the ref has been deleted.

	private Repository _headRepository;
	// The repository associated with this pull request's head Ref.

	private RepositoryOwner _headRepositoryOwner;
	// The owner of the repository associated with this pull request's head Ref.

	private ID _id;
	
	private Boolean _isCrossRepository;
	// The head and base repositories are different.

	private Date _lastEditedAt;
	// The moment the editor made the last edit

	private Boolean _locked;
	// true if the pull request is locked

	private Commit _mergeCommit;
	// The commit that was created when this pull request was merged.

	private MergeableState _mergeable;
	// Whether or not the pull request can be merged based on the existence of merge conflicts.

	private Boolean _merged;
	// Whether or not the pull request was merged.

	private Date _mergedAt;
	// The date and time that the pull request was merged.

	private Milestone _milestone;
	// Identifies the milestone associated with the pull request.

	private int _number;
	// Identifies the pull request number.

	private Commit _potentialMergeCommit;
	// The commit that GitHub automatically generated to test if this pull request could be merged. This field will not return a value if the pull request is merged, or if the test merge commit is still being generated. See the mergeable field for more details on the mergeability of the pull request.

	private Date _publishedAt;
	// Identifies when the comment was published at.

	private ArrayList<ReactionGroup> _reactionGroups;
	// A list of reactions grouped by content left on the subject.

	private Repository _repository;
	// The repository associated with this node.

	private URI _resourcePath;
	// The HTTP path for this pull request.

	private URI _revertResourcePath;
	// The HTTP path for reverting this pull request.

	private URI _revertUrl;
	// The HTTP URL for reverting this pull request.

	private PullRequestState _state;
	// Identifies the state of the pull request.

	private ArrayList<SuggestedReviewer> _suggestedReviewers;
	// A list of reviewer suggestions based on commit history and past review comments.

	private String _title;
	// Identifies the pull request title.
	
	private Date _updatedAt;
	// Identifies the date and time when the object was last updated.

	private URI _url;
	// The HTTP URL for this pull request.

	private Boolean _viewerCanReact;
	// Can user react to this subject

	private Boolean _viewerCanSubscribe;
	// Check if the viewer is able to change their subscription status for the repository.

	private Boolean _viewerCanUpdate;
	// Check if the current viewer can update this object.

	private ArrayList<CommentCannotUpdateReason> _viewerCannotUpdateReasons;
	// Reasons why the current viewer can not update this comment.

	private Boolean _viewerDidAuthor;
	// Did the viewer author this comment.

	private SubscriptionState _viewerSubscription;
	// Identifies if the viewer is watching, not watching, or ignoring the subscribable entity.

	/*
	 * Getters/Setters for all fields
	 */
	//@XmlElementWrapper(name = "assignees")
	//@XmlElement(name = "assignee")
	
	public ArrayList<User> getAssignees() {
		return _assignees;
	}

	public void setAssignees(ArrayList<User> assignees) {
		_assignees = assignees;
	}
	
	// The number of additions in this pull request.
	public int getAdditions() {
		return _additions;
	}

	public void setAdditions(int additions) {
		_additions = additions;
	}

	// The actor who authored the comment.
	public Actor getAuthor() {
		return _author;
	}

	public void setAuthor(Actor author) {
		_author = author;
	}
	
	// Author's association with the subject of the comment.
	public CommentAuthorAssociation getAuthorAssociation() {
		return _authorAssociation;
	}

	public void setAuthorAssociation(CommentAuthorAssociation authorAssociation) {
		_authorAssociation = authorAssociation;
	}

	// Identifies the base Ref associated with the pull request.
	public Ref getBaseRef() {
		return _baseRef;
	}

	public void setBaseRef(Ref baseRef) {
		_baseRef = baseRef;
	}

	// Identifies the name of the base Ref associated with the pull request, even if the ref has been deleted.
	public String getBaseRefName() {
		return _baseRefName;
	}

	public void setBaseRefName(String baseRefName) {
		_baseRefName = baseRefName;
	}

	// Identifies the body of the pull request.
	public String getBody() {
		return _body;
	}

	public void setBody(String body) {
		_body = body;
	}

	// Identifies the body of the pull request rendered to HTML.
	public HTML getBodyHTML() {
		return _bodyHTML;
	}

	public void setBodyHTML(HTML bodyHTML) {
		_bodyHTML = bodyHTML;
	}

	// Identifies the body of the pull request rendered to text.
	public String getBodyText() {
		return _bodyText;
	}

	public void setBodyText(String bodyText) {
		_bodyText = bodyText;
	}

	// The number of changed files in this pull request.
	public int getChangedFiles() {
		return _changedFiles;
	}

	public void setChangedFiles(int changedFiles) {
		_changedFiles = changedFiles;
	}

	// true if the pull request is closed
	public Boolean getClosed() {
		return _closed;
	}

	public void setClosed(Boolean closed) {
		_closed = closed;
	}

	// Identifies the date and time when the object was closed.
	public Date getClosedAt() {
		return _closedAt;
	}

	public void setClosedAt(Date closedAt) {
		_closedAt = closedAt;
	}

	// Identifies the date and time when the object was created.
	public Date getCreatedAt() {
		return _createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		_createdAt = createdAt;
	}
	
	// Check if this comment was created via an email reply.
	public Boolean getCreatedViaEmail() {
		return _createdViaEmail;
	}

	public void setCreatedViaEmail(Boolean createdViaEmail) {
		_createdViaEmail = createdViaEmail;
	}

	// Identifies the primary key from the database.
	public int getDatabaseId() {
		return _databaseId;
	}

	public void setDatabaseId(int databaseId) {
		_databaseId = databaseId;
	}

	// The number of deletions in this pull request.
	public int getDeletions() {
		return _deletions;
	}

	public void setDeletions(int deletions) {
		_deletions = deletions;
	}

	// The actor who edited this pull request's body.
	public Actor getEditor() {
		return _editor;
	}

	public void setEditor(Actor editor) {
		_editor = editor;
	}

	// Identifies the head Ref associated with the pull request.
	public Ref getHeadRef() {
		return _headRef;
	}

	public void setHeadRef(Ref headRef) {
		_headRef = headRef;
	}

	// Identifies the name of the head Ref associated with the pull request, even if the ref has been deleted.
	public String getHeadRefName() {
		return _headRefName;
	}

	public void setHeadRefName(String headRefName) {
		_headRefName = headRefName;
	}

	// The repository associated with this pull request's head Ref.
	public Repository getHeadRepository() {
		return _headRepository;
	}

	public void setHeadRepository(Repository headRepository) {
		_headRepository = headRepository;
	}

	// The owner of the repository associated with this pull request's head Ref.
	public RepositoryOwner getHeadRepositoryOwner() {
		return _headRepositoryOwner;
	}

	public void setHeadRepositoryOwner(RepositoryOwner headRepositoryOwner) {
		_headRepositoryOwner = headRepositoryOwner;
	}
	
	// Pull Request ID
	public ID getId() {
		return _id;
	}

	public void setId(ID id) {
		_id = id;
	}

	// The head and base repositories are different.
	public Boolean getIsCrossRepository() {
		return _isCrossRepository;
	}

	public void setIsCrossRepository(Boolean isCrossRepository) {
		_isCrossRepository = isCrossRepository;
	}

	// The moment the editor made the last edit
	public Date getLastEditedAt() {
		return _lastEditedAt;
	}

	public void setLastEditedAt(Date lastEditedAt) {
		_lastEditedAt = lastEditedAt;
	}

	// true if the pull request is locked
	public Boolean getLocked() {
		return _locked;
	}

	public void setLocked(Boolean locked) {
		_locked = locked;
	}

	// The commit that was created when this pull request was merged.
	public Commit getMergeCommit() {
		return _mergeCommit;
	}

	public void setMergeCommit(Commit mergeCommit) {
		_mergeCommit = mergeCommit;
	}

	// Whether or not the pull request can be merged based on the existence of merge conflicts.
	public MergeableState getMergeable() {
		return _mergeable;
	}

	public void setMergeable(MergeableState mergeable) {
		_mergeable = mergeable;
	}

	// Whether or not the pull request was merged.
	public Boolean getMerged() {
		return _merged;
	}

	public void setMerged(Boolean merged) {
		_merged = merged;
	}

	// The date and time that the pull request was merged.
	public Date getMergedAt() {
		return _mergedAt;
	}

	public void setMergedAt(Date mergedAt) {
		_mergedAt = mergedAt;
	}

	// Identifies the milestone associated with the pull request.
	public Milestone getMilestone() {
		return _milestone;
	}

	public void setMilestone(Milestone milestone) {
		_milestone = milestone;
	}

	// Identifies the pull request number.
	public int getNumber() {
		return _number;
	}

	public void setNumber(int number) {
		_number = number;
	}

	// The commit that GitHub automatically generated to test if this pull request could be merged. 
	public Commit getPotentialMergeCommit() {
		return _potentialMergeCommit;
	}

	public void setPotentialMergeCommit(Commit potentialMergeCommit) {
		_potentialMergeCommit = potentialMergeCommit;
	}

    // This field will not return a value if the pull request is merged, or if the test merge commit 
    // is still being generated. See the mergeable field for more details on the mergeability of the pull request.
	// Identifies when the comment was published at.
	public Date getPublishedAt() {
		return _publishedAt;
	}

	public void setPublishedAt(Date publishedAt) {
		_publishedAt = publishedAt;
	}

	// A list of reactions grouped by content left on the subject.
	public ArrayList<ReactionGroup> getReactionGroups() {
		return _reactionGroups;
	}

	public void setReactionGroups(ArrayList<ReactionGroup> reactionGroups) {
		_reactionGroups = reactionGroups;
	}

	// The repository associated with this node.
	public Repository getRepository() {
		return _repository;
	}

	public void setRepository(Repository repository) {
		_repository = repository;
	}

	// The HTTP path for this pull request.
	public URI getResourcePath() {
		return _resourcePath;
	}

	public void setResourcePath(URI resourcePath) {
		_resourcePath = resourcePath;
	}
	
	// The HTTP path for reverting this pull request.
	public URI getRevertResourcePath() {
		return _revertResourcePath;
	}

	public void setRevertResourcePath(URI revertResourcePath) {
		_revertResourcePath = revertResourcePath;
	}

	// The HTTP URL for reverting this pull request.
	public URI getRevertUrl() {
		return _revertUrl;
	}

	public void setRevertUrl(URI revertUrl) {
		_revertUrl = revertUrl;
	}

	// Identifies the state of the pull request.
	public PullRequestState getState() {
		return _state;
	}

	public void setState(PullRequestState state) {
		_state = state;
	}

	// A list of reviewer suggestions based on commit history and past review comments.
	public ArrayList<SuggestedReviewer> getSuggestedReviewers() {
		return _suggestedReviewers;
	}

	public void setSuggestedReviewers(ArrayList<SuggestedReviewer> suggestedReviewers) {
		_suggestedReviewers = suggestedReviewers;
	}

	// Identifies the pull request title.
	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	// Identifies the date and time when the object was last updated.
	public Date getUpdatedAt() {
		return _updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		_updatedAt = updatedAt;
	}

	// The HTTP URL for this pull request.
	public URI getUrl() {
		return _url;
	}

	public void setUrl(URI url) {
		_url = url;
	}

	// Can user react to this subject
	public Boolean getViewerCanReact() {
		return _viewerCanReact;
	}

	public void setViewerCanReact(Boolean viewerCanReact) {
		_viewerCanReact = viewerCanReact;
	}

	// Check if the viewer is able to change their subscription status for the repository.
	public Boolean getViewerCanSubscribe() {
		return _viewerCanSubscribe;
	}

	public void setViewerCanSubscribe(Boolean viewerCanSubscribe) {
		_viewerCanSubscribe = viewerCanSubscribe;
	}

	// Check if the current viewer can update this object.
	public Boolean getViewerCanUpdate() {
		return _viewerCanUpdate;
	}

	public void setViewerCanUpdate(Boolean viewerCanUpdate) {
		_viewerCanUpdate = viewerCanUpdate;
	}

	// Reasons why the current viewer can not update this comment.
	public ArrayList<CommentCannotUpdateReason> getViewerCannotUpdateReasons() {
		return _viewerCannotUpdateReasons;
	}

	public void setViewerCannotUpdateReasons(ArrayList<CommentCannotUpdateReason> viewerCannotUpdateReasons) {
		_viewerCannotUpdateReasons = viewerCannotUpdateReasons;
	}

	// Did the viewer author this comment.
	public Boolean getViewerDidAuthor() {
		return _viewerDidAuthor;
	}

	public void setViewerDidAuthor(Boolean viewerDidAuthor) {
		_viewerDidAuthor = viewerDidAuthor;
	}

	// Identifies if the viewer is watching, not watching, or ignoring the subscribable entity.
	public SubscriptionState getViewerSubscription() {
		return _viewerSubscription;
	}

	public void setViewerSubscription(SubscriptionState viewerSubscription) {
		_viewerSubscription = viewerSubscription;
	}
	
}

