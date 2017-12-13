package ljm.gitatit.services;

import java.io.Serializable;
import java.util.ArrayList;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

import ljm.gitatit.external.github.PullRequest;
import ljm.gitatit.external.github.State;

/**
 * The main Github REST Service for pull requests
 * @author lmynsberge
 *
 */
public class GithubRESTService implements IRepoService {

	private static String s_GithubAPIBase = "https://api.github.com/";
	private static String s_Username = "lmynsberge";
	private static String s_Password = "";
	private ArrayList<ljm.gitatit.data.PullRequest> _pullRequestResults;
	private String _organization;
	private String _repository;
	private ILogger _logger;
	private State _repoState;
	private int _count;
	
	public GithubRESTService() {
		this._pullRequestResults = new ArrayList<ljm.gitatit.data.PullRequest>();
	}
	
	@Override
	/**
	 * Cast the result set from Github to the internal data format. That's all we'll do for now
	 */
	public ArrayList<ljm.gitatit.data.PullRequest> GetResponse() {
		return this._pullRequestResults;
	}

	@Override
	/**
	 * Make the request from a request object, which in this case is just URI
	 */
	public void MakeRequest(Serializable requestObject) {
		
		// Make the inital call to get the data
		MakeDataCall(GetRepoURI());
		
	}
	
	/**
	 * Makes continuous calls until all data has been retrieved
	 * @param path The URI string to make a request to
	 */
	private void MakeDataCall(String path) {
		// Create web client and add the path sent
		Client client = ClientBuilder.newClient();
		if(!s_Password.isEmpty()) {
			HttpAuthenticationFeature feature = HttpAuthenticationFeature.basic(s_Username, s_Password);
			 
			client.register(feature);
		}
		
		
		WebTarget wt = client.target(path);
		if(getRepoState() != State.open) {
			wt = wt.queryParam("state", getRepoState().toString());
		}
		
		// Make the request and check the response
		Response response = wt.request(MediaType.APPLICATION_JSON_TYPE).get();
		
		if(response.getStatus() != 200) {
			this.getLogger().LogError(response.readEntity(String.class));
			return;
		}
		
		PullRequest[] pullRequests = null;
		// Catch any cast errors with changes to the data model, but unlikely since it's transitioning to GraphQL.
		try {
				pullRequests = response.readEntity(PullRequest[].class);
		}
		catch (Exception e) {
			this.getLogger().LogError(e.getStackTrace().toString());
			return;
		}
		
		// Add this to our current list
		if(pullRequests != null ) {
			for(int index = 0; index < pullRequests.length; index++) {
				this._pullRequestResults.add(new ljm.gitatit.data.PullRequest(pullRequests[index]));
			}
		}
		
		// Look for the link headers and determine if we need to go again
		Link nextLink = response.getLink("next");
		
		// If next is null, then we're at the last one
		if(nextLink == null) { return; }
		
		// Otherwise get the next link and see if we're done if it's the same as the last
		String next = nextLink.getUri().toString();
		
		if(next == path) { return; }
		
		// Recursion is general safe here as 30 results per call shouldn't bloat the stack too much
		MakeDataCall(next);
	}
	
	/**
	 * Grabs the initial pull request repository for a Github repo
	 * @return A URI string for where to fetch data
	 */
	private String GetRepoURI() {
		return GithubRESTService.s_GithubAPIBase + "repos/" + getOrganization() + "/" + getRepository() + "/pulls" + "?state=" 
				+ getRepoState().toString() + "&per_page=100";
	}

	/*
	 * Getters and Setters for relevant fields
	 */
	/**
	 * The organization associated with the pull request
	 * @return Organization name as string
	 */
	public String getOrganization() {
		return _organization;
	}

	public void setOrganization(String organization) {
		_organization = organization;
	}

	/**
	 *  The repository at the organization for pull requests
	 * @return Repository name as string
	 */
	public String getRepository() {
		return _repository;
	}

	public void setRepository(String repository) {
		_repository = repository;
	}

	@Override
	public void setLogger(ILogger logger) {
		this._logger = logger;
	}

	@Override
	public ILogger getLogger() {
		return this._logger;
	}

	public State getRepoState() {
		return _repoState;
	}

	public void setRepoState(State repoState) {
		_repoState = repoState;
	}
}
