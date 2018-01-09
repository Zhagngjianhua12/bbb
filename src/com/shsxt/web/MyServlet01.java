package com.shsxt.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shsxt.bean.Student;

/**
 * 创建一个监听器专门监听 Context对象的生命周期  （出生， 死亡）
 */
public class MyServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("stu", new Student());
		
		/*System.out.println("MyServlet01.service()");
		ServletContext context = this.getServletContext();
		context.setAttribute("aa","AAA");
		context.setAttribute("aa", "XXX");
		context.removeAttribute("aa");
		HttpSession session = request.getSession();
		session.setAttribute("aa", "AAA");
		session.setAttribute("aa", "aaaa");
		session.removeAttribute("aa");
		//session.invalidate();
		session.setMaxInactiveInterval(30);*/
	}

}
