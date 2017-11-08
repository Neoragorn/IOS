package displaymessageserverlog;

import org.osgi.service.log.LogService;

import itf.DisplayService;

public class LogServer implements DisplayService{

	private LogService log;
	
	public LogServer(LogService log)
	{
		this.log = log;
	}
	
	public void display(String message) {
		log.log(LogService.LOG_INFO, message);
	}

}
