package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	private static final long serialVersionUID = 1L; //this just quiets a warning that comes up. Not needed.
	
	//We are overriding the doGet method, so the service method of our HelloServlet will delegate here if it receives a GET request
	//Note the method signature of the doGet method will be the same for ANY of the "do" methods (doGet, doPost, etc etc)
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//A print writer created from the response will write to that response object
		//we can use this to write HTML directly
		PrintWriter pw = res.getWriter(); 
		pw.print("<h1>Hello from your doGet method</h1>");
		res.setStatus(200); //sets status code to success. Optional.
		//now we have a servlet!
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter(); 
		pw.print("<h1>Hello from your doPost method</h1>");
		res.setStatus(200);
	}
	
}
