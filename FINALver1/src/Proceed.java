

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Proceed
 */
@WebServlet("/Proceed")
public class Proceed extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.print("<head>");
		out.print("<title></title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<form method = 'post' action = 'thrift'>");
		out.print("<h1> WELCOME TO </h1>");
		out.print("img src = '/FINALver1/WebContent/WEB-INF/FT.jpg'");
		out.print("First Name: <input type = 'text' name = 'fname'");
		out.print("Last Name: <input type = 'text' name = 'lname'");
		out.print("<input type='submit' value='thrift'");
	}

}
