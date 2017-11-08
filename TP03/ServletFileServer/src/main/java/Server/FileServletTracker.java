package Server;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

import filenaked.FileRequestHandler;
import naked.WebServer;
import servletnaked.ServletRequestHandler;
import toolnaked.ServletFileI;

public class FileServletTracker implements ServiceTrackerCustomizer{

	private WebServer s;
	private BundleContext c;
	
	
	public FileServletTracker(WebServer s, BundleContext c) {
		super();
		this.s = s;
		this.c = c;
	}

	public Object addingService(ServiceReference reference) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		ServletFileI serv = (ServletFileI) this.c.getService(reference);
		s.getRh().setRs((ServletFileI) serv);
		System.out.println("passed by service added !" + serv.getClass().getName());
		return serv;
	}

	public void modifiedService(ServiceReference reference, Object service) {
		System.out.println("passed by service modfied !" + service.getClass().getName());
		
		if (service instanceof FileRequestHandler)
		{
			s.getRh().setRs((FileRequestHandler) service);
			System.out.println("Mode changed ! Passed to file mode !");
		}
		else if (service instanceof ServletRequestHandler)
		{
			s.getRh().setRs((ServletRequestHandler) service);
			System.out.println("Mode changed ! Passed to servlet mode !");
		}		
		
	}

	public void removedService(ServiceReference reference, Object service) {
		System.out.println("passed by service removal !");
		// TODO Auto-generated method stub
		
	}

}
