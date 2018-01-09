package com.shsxt.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * Application Lifecycle Listener implementation class MyContextAttrListener
 *
 */
public class MyContextAttrListener implements ServletContextAttributeListener {

    /**
     * Default constructor. 
     */
    public MyContextAttrListener() {
    	System.out.println("MyContextAttrListener.MyContextAttrListener()");
    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent scae)  { 
    	System.out.println("MyContextAttrListener.attributeAdded()");
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent scae)  { 
    	System.out.println("MyContextAttrListener.attributeRemoved()");
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent scae)  { 
    	System.out.println("MyContextAttrListener.attributeReplaced()");
    }
	
}
