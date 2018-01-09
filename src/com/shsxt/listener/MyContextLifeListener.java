package com.shsxt.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class MyContextLifeListener
 *
 */
public class MyContextLifeListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MyContextLifeListener() {
    	System.out.println("MyContextLifeListener.MyContextLifeListener()");
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("看到这个方法， 代表Context被销毁了");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("看到这个方法， 代表Context被创建了");
    }
	
}
