package com.edureka.java_jee_module7;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionValidateServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		String name = request.getParameter("user");
		String pass = request.getParameter("pass");

		if (pass.equals("1234")) {
			// creating a session
			HttpSession session = request.getSession();
			session.setAttribute("user", name);
			response.sendRedirect("Welcome");
		}
	}
}