/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.clases.Pedido;
import com.clases.Producto;
import com.clases.Venta;
import com.google.gson.Gson;
import com.webservices.DulceReal_Service;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
public class ServletPedido extends HttpServlet {
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
        String[] prodSelect= request.getParameterValues("product");
        String usuario = (String) ses.getAttribute("usuario");
        String fecha = new SimpleDateFormat("dd-MM-yyyy  HH:mm:ss").format(new Date());
        System.out.println(fecha);
        Venta venta;
        List<Producto> productos = (List<Producto>) ses.getAttribute("productos");
        List<Venta> ventas = new ArrayList<>();
        int i=0;
        if(prodSelect!=null){
        for (i=0; i<prodSelect.length; i++){
            String valor = prodSelect[i];
            int cant=0;
            System.out.println(valor);
            for(Producto p: productos){
                if(p.nombreProducto.equalsIgnoreCase(valor)){
                    cant = Integer.parseInt(request.getParameter("cantidad "+p.idProducto));
                    venta = new Venta(cant, p);
                    ventas.add(venta);
                }
            }
            System.out.println(cant);
        }
        
        Pedido pedido = new Pedido(usuario, ventas, fecha);
        String json = new Gson().toJson(pedido);
        String msj = cargarALaCola(json);
        System.out.println(msj);
        if(msj != null){
            ses.setAttribute("rpta", "El pedido se ha realizado con éxito.");
        }else{
            ses.setAttribute("rpta", "Ocurrió un problema; volver a hacer pedido.");
        }
        RequestDispatcher rd = request.getRequestDispatcher("respuesta.jsp");
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

    private String cargarALaCola(java.lang.String pedido) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.webservices.DulceReal port = service.getDulceRealPort();
        return port.cargarALaCola(pedido);
    }

}
