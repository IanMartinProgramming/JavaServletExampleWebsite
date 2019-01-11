package servletClasses;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/ServletHtml")
public class ServletGeneratesHtml extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>\n <html>\n" +
				"<head><title>Servlet Generating HTML" +
				"</title></head>\n <body bgcolor=\"#fdf5e6\">\n" +
				"<h1>Test of a Servlet Generating HTML</h1>\n" +
				"<p>This is an HTML page!</p>\n" +
				"</body></html>");
	}
}
