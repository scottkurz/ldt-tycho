package skurz.tycho.logger;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import java.util.logging.Logger;


public class Activator implements BundleActivator {
	
	Logger logger = Logger.getAnonymousLogger();

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		String msg = "SKSK:  starting logger bundle";
		System.out.println(msg);
		logger.severe(msg);
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		String msg = "SKSK:  stopping logger bundle";
		System.out.println(msg);
		logger.severe(msg);
	}


}
