/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Alexis Pérez
 * Matrícula: 2942889
 * 
 */
@WebServlet(name = "mostrarOperaciones", urlPatterns = {"/mostrarOperaciones"})
public class mostrarOperaciones extends HttpServlet {

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){

            String B = request.getParameter("B");
            String H = request.getParameter("H");
            model.Triangulo t = new model.Triangulo(B,H);
            t.Area();
            t.Perimeter();
            double resultado = t.getResult();
            

            request.setAttribute("Operaciones", t);
            request.getRequestDispatcher("/mostrarResultado.jsp").forward(request, response);
                
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
    
    
    
}

    

