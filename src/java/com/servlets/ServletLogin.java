/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.clases.Producto;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;
import com.webservices.DulceReal_Service;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author EQ
 */
public class ServletLogin extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/TrabajoIntegradorWS/dulceReal.wsdl")
    private DulceReal_Service service;

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
        HttpSession ses = request.getSession(true);
        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");
        if(loguearCliente(usuario, clave)==true){
            ses.setAttribute("usuario", usuario);
            String listaProd = conseguirProds();
            Gson gson = new Gson();
            List<Producto> productos = gson.fromJson(listaProd, new TypeToken<List<Producto>>(){}.getType());
            
            //Type listProds = new TypeToken<ArrayList<Producto>>>();
            //TODO: convertir la lista del JSON a una lista de Productos; es con gson.fromJSON(productos, algo.class);
            for(Producto p: productos){
                System.out.println(p.idProducto + " - " + p.nombreProducto + " - " + p.precioProducto);
            }
            ses.setAttribute("productos", productos);
            System.out.println("se seteó el atributo Productos");
            RequestDispatcher rd = request.getRequestDispatcher("tablaPedido.jsp");
            rd.forward(request, response);
        }
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
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private boolean loguearCliente(java.lang.String usuario, java.lang.String clave) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.webservices.DulceReal port = service.getDulceRealPort();
        return port.loguearCliente(usuario, clave);
    }

    private String conseguirProds() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.webservices.DulceReal port = service.getDulceRealPort();
        return port.conseguirProds();
    }

    
}
