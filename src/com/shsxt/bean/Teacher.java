package com.shsxt.bean;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * Application Lifecycle Listener implementation class Teacher
 *
 */
public class Teacher implements HttpSessionActivationListener,Serializable{

    /**
     * Default constructor. 
     */
    public Teacher() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionActivationListener#sessionDidActivate(HttpSessionEvent)
     */
    public void sessionDidActivate(HttpSessionEvent se)  { 
    	System.out.println("我所在的session被活化了");
    }

	/**
     * @see HttpSessionActivationListener#sessionWillPassivate(HttpSessionEvent)
     */
    public void sessionWillPassivate(HttpSessionEvent se)  { 
    	System.out.println("我所在的session被钝化了");
    }
	
}
