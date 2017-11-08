package autorun;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Activator implements BundleActivator {

    public void start(BundleContext context) throws Exception {
    	ServiceReference[] ref = context.getServiceReferences(Runnable.class.getName(), null);
    	for (ServiceReference s : ref)
    	{
    		MyThread th = new MyThread((Runnable) context.getService(s));
    		th.start();
    	}
    }

    public void stop(BundleContext context) throws Exception {
        // TODO add deactivation code here
    }

}
