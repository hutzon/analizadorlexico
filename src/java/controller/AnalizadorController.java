/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AnalizadorDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Descripcion;

/**
 *
 * @author OTTONIEL CAMPOS
 */
public class AnalizadorController extends HttpServlet {



  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String cadena = request.getParameter("cadena");
         AnalizadorDao analizadorDao = new AnalizadorDao();
         
        
         String result = analizadorDao.analizarCadena(cadena);
        System.out.println(result);
        RequestDispatcher rd;

        request.setAttribute("message",result );
        rd = request.getRequestDispatcher("/mensaje.jsp");
        rd.forward(request, response);
    }

 
    
    
    

}
