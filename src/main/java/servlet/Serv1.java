package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Serv1
 */
@WebServlet("/Serv1")
public class Serv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * Create data in Serv1
     * Send it to Serv2
     * From Serv2 go to Serv3
     * 
     * Serv3 will nto be able to fetch the data from Serv1
     * 
     * this is type of request scope
     * 
     * request scope
     * data can be sent from one page to another, there that product ends and cannot be fetched again
     * as it destroys itself. We can only use data in two pages, the sender and the receiver
     * 
     * session scope
     * When we use the session scope, the data is stored in the browser. data is not sent to one page or other
     * Hence that data can be fetched between different pages as the data will be stored in the session
     */
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = "Anees";
		
		request.setAttribute("nm", name); // set data
		HttpSession hs = request.getSession();
		hs.setAttribute("em", "email");
		
		RequestDispatcher rd = request.getRequestDispatcher("Serv2"); // dispatch to Serv2
		rd.forward(request, response); //forward the dispatch
		
		
		
	}

	

}
