package org.demo.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.LogoUser;
import com.demo.dao.DaoFunction;
import com.demo.dao.DaoFunctionImpl;

/**
 * Servlet implementation class Demo
 */
@WebServlet("/SignUp")
public class SignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ControllerService service = new ControllerServiceImpl();
    static String responseFromPost;
    /**
     * @see HttpServlet#HttpServlet()
     */
	

    public SignUpController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
	
	
	
		RequestDispatcher dispatcher = request.getRequestDispatcher("SignUp.jsp");
		dispatcher.forward(request, response);
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	

	//String password  = request.getParameter("password");  
	
	


		
		// TODO Auto-generated method stub
		//Get the user Detailes
		String userName = request.getParameter("name");
		String password = request.getParameter("password");
		
	
		
		//nullchecks will be implemented !!
		
		//Create the user
		LogoUser user = new LogoUser(userName,password);
		//Create the dao function
		DaoFunction function = new DaoFunctionImpl();
		//Now get the function
	
		//get list of user
		
		try {
			
			
		
	
			

		
		if(service.isPresent(userName, password)) {
			

				responseFromPost = "Please Login you're already a user";
		
			}
		else if((userName == "" || password == "")) {
			responseFromPost = "Please give the values for username and password";
		}
		else {
			responseFromPost = "";
		function.insertUserofLogo(user);
		}
			
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.getWriter().write(responseFromPost);
		
	
	}


}
