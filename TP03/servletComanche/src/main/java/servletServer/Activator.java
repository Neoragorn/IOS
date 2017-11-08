package servletServer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import servletnaked.ServletRequestHandler;
import toolnaked.ServletFileI;

public class Activator implements BundleActivator {


	@SuppressWarnings("rawtypes")
	private ServiceRegistration sAck;

	public void start(BundleContext context) throws Exception {
		ServletFileI rh = new ServletRequestHandler();
		sAck = context.registerService(ServletFileI.class.getName(), rh, null);
	}

	public void stop(BundleContext context) throws Exception {
		// TODO add deactivation code here
		sAck.unregister();
	}
}