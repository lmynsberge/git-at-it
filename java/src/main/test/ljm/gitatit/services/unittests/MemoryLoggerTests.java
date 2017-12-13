package ljm.gitatit.services.unittests;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import ljm.gitatit.services.MemoryLogger;

public class MemoryLoggerTests {
	
	/**
	 * Test method for no logged errors returning an empty array instead of null.
	 */
	@Test
	public void GetLoggedErrors_NoErrors_GetsEmptyArray() {
		
		// Setup
		MemoryLogger logger = new MemoryLogger();
		
		// Make test
		ArrayList<String> result = logger.GetLoggedErrors();
		
		Assert.assertTrue(result != null);
	}
	
	/**
	 * Test method for logged errors return an array
	 */
	@Test
	public void GetLoggedErrors_Errors_GetsMatchingArray() {
		
		// Setup
		MemoryLogger logger = new MemoryLogger();
		logger.LogError("error 1");
		logger.LogError("error 2");
		
		// Make test
		ArrayList<String> result = logger.GetLoggedErrors();
		
		Assert.assertTrue(result.size() == 2);
	}

}
