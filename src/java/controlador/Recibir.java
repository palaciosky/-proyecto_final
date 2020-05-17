/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.personal;


/**
 *
 * @author Mario CD
 */
@WebServlet(name = "Recibir", urlPatterns = {"/recibir.do"})
public class Recibir extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String Dui = request.getParameter("Dui");
        String Nombres = request.getParameter("Nombres");
        String Apellidos = request.getParameter("Apellidos");
        String Telefono = request.getParameter("Telefono");
        String Direccion = request.getParameter("Direccion");
        String email = request.getParameter("email");
        String tipo = request.getParameter("tipo");
        
        personal person = new personal( Dui, Nombres, Apellidos, Telefono,Direccion, email,tipo);
        person.setDui(Dui);
        person.setNombres(Nombres);
        person.setApellidos(Apellidos);
        
        if (person.insertarDatos()){
            request.getRequestDispatcher("exito.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("noexito.jsp").forward(request, response);
        }
        
        
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
