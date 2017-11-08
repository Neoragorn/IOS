package displaymessage_client;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

import client.Client;
import itf.DisplayService;

public class DisplayServiceHandler implements ServiceTrackerCustomizer {
	private Client client;
	private BundleContext context;

	public DisplayServiceHandler(Client cl, BundleContext context) {
		client = cl;
		this.context = context;
	}

	public Object addingService(ServiceReference reference) {
		DisplayService disp = (DisplayService) context.getService(reference);
		client.setService(disp);
		System.out.println("Service added : " + disp.getClass().getName());
		return disp;
	}

	public void modifiedService(ServiceReference reference, Object service) {
		if (service instanceof DisplayService)
		{
			client.setService((DisplayService) service);
			System.out.println("Service modified : " + service.getClass().getName());
		}

	}

	public void removedService(ServiceReference reference, Object service) {
		client.setService(null);
		System.out.println("Service removed : " + service.getClass().getName());
	}
}
