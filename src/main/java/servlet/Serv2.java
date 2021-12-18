package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Serv2
 */
@WebServlet("/Serv2")
public class Serv2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession hs = request.getSession();
		String name = (String) request.getAttribute("nm");
		String email = (String) hs.getAttribute("em");
		
		response.setContentType("text/html"); // to activate html script
		PrintWriter pw = response.getWriter();
		
		pw.println("Welcome " + name);
		pw.println("email is " + email);
		pw.println("<a href = 'Serv3'>Next Page</a>"); //mention response.setContentType("text/html"); before
	}

	
	

}
