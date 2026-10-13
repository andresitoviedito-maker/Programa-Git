package com.sena.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet encargado de procesar solicitudes GET y POST
 * Evidencia: GA7-220501096-AA2-EV02
 * Aprendiz: Miguel Andrés Arroyo Oviedo
 */
@WebServlet("/UsuarioServlet")
public class UsuarioServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public UsuarioServlet() {
        super();
    }

    /**
     * Procesamiento de solicitudes GET (Consultas de información)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String action = request.getParameter("action");
        String id = request.getParameter("id");
        
        String respuesta = "Consulta realizada con éxito vía GET. Acción: " + action + ", ID: " + id;
        
        // Asignación del resultado a la solicitud para renderizar en JSP
        request.setAttribute("mensaje", respuesta);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    /**
     * Procesamiento de solicitudes POST (Envío y captura de formularios)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Captura de parámetros del formulario HTML
        String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");

        String respuesta = "Usuario " + nombre + " (" + email + ") registrado exitosamente vía POST.";

        // Asignación del resultado para renderizar en JSP
        request.setAttribute("mensaje", respuesta);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
