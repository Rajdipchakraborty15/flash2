package com.pilu;

import java.io.PrintWriter;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.pilu.Testbean;
import com.pilu.person;

public class Servletconnect extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String id = request.getParameter("id");
		String description = request.getParameter("description");
		String likes = request.getParameter("likes");
		String url = request.getParameter("url");
		String by = request.getParameter("by");

		out.println("<h1>Your youtube data<h1>");
		out.println("ID->    " + id + "<br>");
		out.println("DESCRIPTION->   " + description + "<br>");
		out.println("LIKES->   " + likes + "<br>");
		out.println("URL->   " + url + "<br>");
		out.println("BY->   " + by);

		person p = new person();
		p.setId(id);
		p.setDescription(description);
		p.setLikes(likes);
		p.setUrl(url);
		p.setBy(by);
		Testbean t = new Testbean(p);
		t.write();

	}

}
