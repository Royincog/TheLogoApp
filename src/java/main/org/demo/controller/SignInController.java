package org.demo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignInController
 */
@WebServlet("/SignIn")
public class SignInController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ControllerService service = new ControllerServiceImpl();   
    /**
     * @see HttpServlet#HttpServlet()
     */
	static String responseFromServlet;
    public SignInController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("name");
		String password = request.getParameter("password");

		System.out.println(userName);
		System.out.println(password);
		

		try {
			
			if(service.isPresent(userName, password)) {
				responseFromServlet = "success";
				System.out.println(responseFromServlet);
			}
			
			else {
				responseFromServlet = "You're not user.. Plz Sign Up";
				System.out.println(responseFromServlet);
			}
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(responseFromServlet);
		request.setAttribute("error", responseFromServlet);
	
		RequestDispatcher dispatcher = request.getRequestDispatcher("SignIn.jsp");
		dispatcher.forward(request, response);
		
		responseFromServlet = "";
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
