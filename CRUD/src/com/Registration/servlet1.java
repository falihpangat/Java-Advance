package com.Registration;

    import java.io.IOException;  
    import java.io.PrintWriter;  
      
    import javax.servlet.ServletException;  
    import javax.servlet.annotation.WebServlet;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
    @WebServlet("/servlet1")  
    public class servlet1 extends HttpServlet {  
        protected void doPost(HttpServletRequest request, HttpServletResponse response)   
             throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
              
            String fname=request.getParameter("fname");  
            String sname=request.getParameter("sname");  
            String password=request.getParameter("password");  
            String email=request.getParameter("email");  
              
            Emp e=new Emp();  
            e.setFname(fname);  
            e.setSname(sname);  
            e.setPassword(password);  
            e.setEmail(email);  
              
            int status=EmpDao.save(e);  
            if(status>0){  
                out.print("<p>Record saved successfully!</p>");  
                request.getRequestDispatcher("registration.html").include(request, response);  
            }else{  
                out.println("Sorry! unable to save record");  
            }  
              
            out.close();  
        }  
      
    }  