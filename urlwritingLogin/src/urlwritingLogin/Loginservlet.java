package urlwritingLogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public Loginservlet() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		 
		
		String name= request.getParameter("userName");
		String password= request.getParameter("userPass");
		
		 if(password.equals("admin123")){  
		      out.print("<h1><strong>HAI</strong></h1>" + name); 
		      out.print(" <a href='SecondServlet?uname="+ name +" '>Profile</a> ");
		 }
		 else{  
	            out.print("Sorry, username or password error!");  
	             
	        }  
	        out.close();
		
	}

}
