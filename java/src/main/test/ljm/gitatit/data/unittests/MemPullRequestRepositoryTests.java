package ljm.gitatit.data.unittests;

import org.junit.Assert;
import org.junit.Test;

import ljm.gitatit.data.MemPullRequestRepository;
import ljm.gitatit.data.PullRequest;

public class MemPullRequestRepositoryTests {

	@Test
	public void Save_Single_Success() {
		
		// Setup
		PullRequest request = new PullRequest();
		request.getInternalPullRequest().setId("123");
		MemPullRequestRepository repo = new MemPullRequestRepository();
		
		// Test
		repo.save(request);
		
		// Assert
		Assert.assertEquals(repo.pop().getInternalPullRequest().getId(), "123");
	}
	
	@Test
	public void Pop_GetsLast_Success() {
		
		// Setup
		PullRequest request1 = new PullRequest();
		request1.getInternalPullRequest().setId("123");
		PullRequest request2 = new PullRequest();
		request2.getInternalPullRequest().setId("456");
		MemPullRequestRepository repo = new MemPullRequestRepository();
		
		// Test
		repo.save(request1);
		repo.save(request2);
		
		// Assert
		Assert.assertEquals(repo.pop().getInternalPullRequest().getId(), "456");
	}
	
	@Test
	public void Pop_TooMany_NullReturned() {
		
		// Setup
		PullRequest request1 = new PullRequest();
		request1.getInternalPullRequest().setId("123");
		MemPullRequestRepository repo = new MemPullRequestRepository();
		
		// Test
		repo.save(request1);
		repo.pop();
		
		// Assert
		Assert.assertEquals(repo.pop(), null);
	}

}
