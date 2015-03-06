/**
 * Init.java
 */

package com.sdc.rest.init;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * A java class that implements the
 * ServletContextListener interface. This class must implement two method
 * contextInitialized method which is called when the web application is first
 * created and contextDestroyed which will get called when it is destroyed. The
 * resource that you want to be initialized would be instantiated in the
 * contextInitialized method and the resource freed up in the contextDestroyed
 * class. The application must be configured to call this class when it is
 * deployed which is done in the web.xml descriptor file
 * 
 * @author Simone 28/feb/2015
 */
public class InitGeneric implements ServletContextListener {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void contextInitialized(ServletContextEvent sce) {
	    System.out.println("##### START "+getClass().getName()+" #################");
	    try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {}
        System.out.println("##### END "+getClass().getName()+" #################");
		
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	}

}
