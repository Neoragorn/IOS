package Server;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

import naked.WebServer;

public class Activator implements BundleActivator {
	@SuppressWarnings("rawtypes")
	private ServiceRegistration sAck;
	
	private ServiceTracker serviceTracker;
	
	private WebServer s;
	
    public void start(BundleContext context) throws Exception {
    	 this.s = new WebServer();
    	ServiceTrackerCustomizer handler = new FileServletTracker(s, context);
    	serviceTracker = new ServiceTracker(context, "toolnaked.ServletFileI", handler);
    	serviceTracker.open();
    	sAck = context.registerService(WebServer.class.getName(), s, null);
    	s.run();
    }

    public void stop(BundleContext context) throws Exception {
        // TODO add deactivation code here    	
    	sAck.unregister();  
    	serviceTracker.close();
    	s.stop();
    }

}
