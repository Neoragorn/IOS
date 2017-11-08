package FileServer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import filenaked.FileRequestHandler;
import toolnaked.ServletFileI;

public class Activator implements BundleActivator {

	@SuppressWarnings("rawtypes")
	private ServiceRegistration sAck;
	
    public void start(BundleContext context) throws Exception {
    	ServletFileI rh = new FileRequestHandler();
    	sAck = context.registerService(ServletFileI.class.getName(), rh, null);
    }

    public void stop(BundleContext context) throws Exception {
        // TODO add deactivation code here
    	sAck.unregister();
    }

}
