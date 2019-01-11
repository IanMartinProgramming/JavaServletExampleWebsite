package servletClasses;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//import helperClassPackage.RandomUtilities;

@WebServlet("/Bullet_list")
public class BulletList extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String list = "";
		for(int i = 0; i < 10; i++) {
			list += "<li>" + helperClasses.RandomUtilities.randomInt(10) + "</li>";
		}
		out.println(
				"<!DOCTYPE html> <html>" +
				"<head><title>A Bullet List</title></head>" +
				"<body bgcolor=\"#fdf5e6\"> " +
				"<h1>A Bullet List</h1><br>" +
				"<p>A random number generator</p>" +
				"<ul>" + list + "</ul>" + 
				"</body>" + 
				"</html>");
	}
}
