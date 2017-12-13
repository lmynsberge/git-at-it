package ljm.gitatit.services;

import java.util.ArrayList;

public interface ILogger {

	ArrayList<String> GetLoggedErrors();
	
	void LogError(String value);
	
	void SaveLoggedErrors();
}
