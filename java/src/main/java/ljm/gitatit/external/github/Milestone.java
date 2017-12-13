package ljm.gitatit.external.github;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author lmynsberge
 *
 */
public class Milestone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Milestone() {}
	
	private URI _url;
	private URI _htmlUrl;
	private URI _labelsUrl;
	private String _id;
	private int _number;
	private State _state;
	private String _title;
	private String _description;
	private User _creator;
	private int _openIssues;
	private int _closedIssues;
	private Date _createdAt;
	private Date _updatedAt;
	private Date _closedAt;
	private Date _dueOn;

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
	@XmlElement(name = "labels_url")
	public URI getLabelsUrl() {
		return _labelsUrl;
	}
	public void setLabelsUrl(URI labelsUrl) {
		_labelsUrl = labelsUrl;
	}
	@XmlElement(name = "id")
	public String getId() {
		return _id;
	}
	public void setId(String id) {
		_id = id;
	}
	@XmlElement(name = "number")
	public int getNumber() {
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
	@XmlElement(name = "title")
	public String getTitle() {
		return _title;
	}
	public void setTitle(String title) {
		_title = title;
	}
	@XmlElement(name = "description")
	public String getDescription() {
		return _description;
	}
	public void setDescription(String description) {
		_description = description;
	}
	@XmlElement(name = "creator")
	public User getCreator() {
		return _creator;
	}
	public void setCreator(User creator) {
		_creator = creator;
	}
	@XmlElement(name = "open_issues")
	public int getOpenIssues() {
		return _openIssues;
	}
	public void setOpenIssues(int openIssues) {
		_openIssues = openIssues;
	}
	@XmlElement(name = "closed_issues")
	public int getClosedIssues() {
		return _closedIssues;
	}
	public void setClosedIssues(int closedIssues) {
		_closedIssues = closedIssues;
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
	@XmlElement(name = "due_on")
	public Date getDueOn() {
		return _dueOn;
	}
	public void setDueOn(Date dueOn) {
		_dueOn = dueOn;
	}
	


}
