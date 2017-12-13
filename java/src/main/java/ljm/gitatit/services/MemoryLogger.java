package ljm.gitatit.services;

import java.util.ArrayList;

public class MemoryLogger implements ILogger {

	private ArrayList<String> _loggedErrors;
	
	public MemoryLogger() {
		this._loggedErrors = new ArrayList<String>();
	}
	
	@Override
	/**
	 * Get existing errors
	 */
	public ArrayList<String> GetLoggedErrors() {
		return _loggedErrors;
	}

	@Override
	/**
	 * Add a new error to the array
	 */
	public void LogError(String value) {
		if(value.isEmpty()) { return; }
		this._loggedErrors.add(value);
	}

	@Override
	/**
	 * Could save existing errors to a file
	 */
	public void SaveLoggedErrors() {
		
	}

}
