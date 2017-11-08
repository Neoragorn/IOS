/*package displaymessageserverlog;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

import itf.DisplayService;

public class Activator implements BundleActivator {

	private ServiceTracker serviceTracker;
	
	public void start(BundleContext context) throws Exception {
		DisplayService s = (DisplayService) context
				.getService(context.getServiceReference(DisplayService.class.getName()));
		ServiceReference ref = context.getServiceReference(LogService.class.getName());
		LogService log = (LogService) context.getService(ref);
		
		LogServer handler = new LogServer(log);
		serviceTracker = new ServiceTracker(context, ref, handler);
		//serviceTracker.open();
	}

	public void stop(BundleContext context) throws Exception {

	}

}*/

package displaymessageserverlog;


import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.log.LogService;

import itf.DisplayService;



public class Activator implements BundleActivator {

	private ServiceRegistration<?> sAck;
    private ServiceReference<LogService> rf;
    private LogService ls;
	public void start(BundleContext context) throws Exception {
     
        rf = context.getServiceReference(LogService.class);
        ls = context.getService(rf);
        DisplayService s = new LogServer(ls);
        sAck = context.registerService(DisplayService.class.getName(), s, null);
        System.out.println("Bundle starts...");
    }

    public void stop(BundleContext context) throws Exception {
        sAck.unregister();
        System.out.println("Bundle stops...");
    }
    
}