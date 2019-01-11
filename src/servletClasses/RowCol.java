package servletClasses;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/RowCol_table")
public class RowCol extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String table = "";
		for(int i = 1; i <= 10; i++) {
			table += "<tr>\n";
			for(int j = 1; j <= 10; j++) {
				table += "<td>" + i + ", " + j + "</td>\n";
			}
			table += "</tr>\n";
		}
		out.println("<!DOCTYPE html> <html>" +
				"<head><title>A Table (Row-Column)</title>" + 
				"<style>table, td{border:1px solid black;}</style></head>" +
				"<body bgcolor=\"#fdf5e6\"> " +
				"<h1>A Table (Row-Column)</h1><br>" +
				"<table>" + table + "</table>" + 
				"</body>" + 
				"</html>");
	}
}
