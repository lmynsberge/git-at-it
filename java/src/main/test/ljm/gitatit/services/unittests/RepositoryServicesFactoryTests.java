/**
 * 
 */
package ljm.gitatit.services.unittests;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import ljm.gitatit.data.MemPullRequestRepository;
import ljm.gitatit.services.GithubRESTService;
import ljm.gitatit.services.ILogger;
import ljm.gitatit.services.IRepoService;
import ljm.gitatit.services.RepositoryServicesFactory;
import ljm.gitatit.services.RepositoryType;

/**
 * @author lmynsberge
 *
 */
public class RepositoryServicesFactoryTests {

	/**
	 * Test method for factory method with no type
	 */
	@Test
	public void CreatePullRequest_NoTypePassed_ThrowsException() {
		
		// Setup
		Boolean throwsException = false;
		
		// Make test
		try {
			RepositoryServicesFactory.CreatePullRequest(null);
		}
		catch (Exception e) {
			throwsException = true;
		}
		
		Assert.assertTrue(throwsException);
	}
	
	/**
	 * Test method for factory method with valid type
	 */
	@Test
	public void CreatePullRequest_GithubPassed_ServiceCreated() {
		// Setup
		
		
		// Make test
		IRepoService service = null;
		try {
			service = RepositoryServicesFactory.CreatePullRequest(RepositoryType.Github);
		} catch (Exception e) {
			Assert.fail();
		}
		
		Assert.assertEquals(service.getClass(), GithubRESTService.class);
	}
	
	/**
	 * Test method for factory method with service request
	 */
	@Test
	public void MakePullRequest_GithubService_NoErrorsLogged() {
		
		// Setup
		GithubRESTService mockedService = mock(GithubRESTService.class);
		ILogger logger = mock(ILogger.class);
		mockedService.setLogger(logger);
		
		// Make test
		RepositoryServicesFactory.MakePullRequest(mockedService, "test", "test", logger);
		
		verify(logger, times(0)).LogError(anyString());
	}
	
	/**
	 * Test method for factory method with service request failure
	 */
	@Test
	public void MakePullRequest_GithubService_MakeRequestCalled() {

		// Setup
		GithubRESTService gitService = new GithubRESTService();
		ILogger logger = mock(ILogger.class);
		gitService.setLogger(logger);
		GithubRESTService spy = spy(gitService);
		doThrow(new RuntimeException()).when(spy).MakeRequest(null);
		
		// Make test
		try {
			RepositoryServicesFactory.MakePullRequest(spy, "test", "test", logger);
		}
		catch(Exception e) {
			Assert.assertTrue(e.getClass() == RuntimeException.class);
		}
		
	}
	
	/**
	 * Test method for factory method with service request
	 */
	@Test
	public void GetPullRequestData_GithubService_DataSaved() {
		
		// Setup
		GithubRESTService gitService = new GithubRESTService();
		MemPullRequestRepository mockedRepo = mock(MemPullRequestRepository.class);
		GithubRESTService spy = spy(gitService);
		doThrow(new RuntimeException()).when(spy).GetResponse();
		
		// Make test and assert
		try {
			RepositoryServicesFactory.GetPullRequestData(mockedRepo, spy);
		}
		catch(Exception e) {
			Assert.assertTrue(e.getClass() == RuntimeException.class);
		}
	}
}
