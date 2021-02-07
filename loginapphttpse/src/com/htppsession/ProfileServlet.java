package com.htppsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ProfileServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        request.getRequestDispatcher("link.html").include(request, response);  
	          
	        HttpSession session=request.getSession(false);  
	        if(session!=null){  
	        String name=(String)session.getAttribute("name");  
	          
	        out.print("Hello, "+name+" Welcome to Profile");  
	        }  
	        else{  
	            out.print("Please login first");  
	            request.getRequestDispatcher("login.html").include(request, response);  
	        }  
	        out.close();  
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
