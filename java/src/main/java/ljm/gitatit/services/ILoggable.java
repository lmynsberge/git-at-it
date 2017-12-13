package ljm.gitatit.services;

public interface ILoggable {

	void setLogger(ILogger logger);
	
	ILogger getLogger();
}
