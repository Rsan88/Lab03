/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Raj
 */
public class AgeCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
         return;
    }

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("ageGiven");
        if(age == null || age.equals("")){
        
               String message = "You must give your current age";
        request.setAttribute("message", message);
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
        
        }
        try{
             int i=Integer.parseInt(age);
               i++;
                       String s =String.valueOf(i);  
        String ageMsg = "Your age next birthday is "+s;
         request.setAttribute("ageNext",ageMsg);
         

        
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
            return;
        }catch(NumberFormatException  e){
             String message = "You must enter a number";
        request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
        }

  
            
    }

   
    }
