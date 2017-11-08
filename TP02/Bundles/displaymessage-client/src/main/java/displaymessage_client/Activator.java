package displaymessage_client;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

import client.Client;
import itf.DisplayService;

public class Activator implements BundleActivator {

	private ServiceTracker serviceTracker;
	private ServiceRegistration<?> sAck;
	
	public void start(BundleContext context) throws Exception {
		DisplayService s = (DisplayService) context
				.getService(context.getServiceReference(DisplayService.class.getName()));
		Client cl = new Client();
		sAck = context.registerService(Runnable.class.getName(), cl, null);
		cl.setService(s);							
		ServiceTrackerCustomizer handler = new DisplayServiceHandler(cl, context);
		serviceTracker = new ServiceTracker(context, "itf.DisplayService", handler);
		serviceTracker.open();
		context.registerService(Runnable.class.getName(), cl, null);
	}

	public void stop(BundleContext context) throws Exception {
		serviceTracker.close();
		sAck.unregister();
	}
}
