package org.ymini.arthika.controllerServlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ymini.arthika.modelClasses.Students;
import org.ymini.arthika.modelClasses.SearchStudents;


@WebServlet(name = "MyServlet", urlPatterns = {"/MyServletarthika"})
public class MyServlet extends HttpServlet { 
    
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String sname;
        String grade;
        
        sname=request.getParameter("studentname");
        grade=request.getParameter("grade");
        
        myValidate c=new myValidate();
        boolean result=c.checkIsempty(sname, grade);         
        
        
        
        if(result){
		
            SearchStudents ss=new SearchStudents(); 
            Students ob=ss.findStudent(sname,grade);
                if(ob!=null){
                        request.setAttribute("ob",ob);
                        RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
                        dispatcher.forward(request,response);
                }
                else{
                        response.sendRedirect("errormsg.jsp");

                }
            
        }
        else{
            response.sendRedirect("failure.jsp");
           
        }
        
    }
    
   @Override
    public String getServletInfo() {
        return "Short description";
    }
}
