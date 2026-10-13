package com.sena.api;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servicio Web para Autenticación de Usuarios (Login)
 * Evidencia: GA7-220501096-AA5-EV01
 * Aprendiz: Miguel Andrés Arroyo Oviedo
 */
@WebServlet("/api/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * Método POST que procesa las credenciales del servicio web
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Configurar la respuesta como JSON o Texto plano estructurado
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // Capturar los parámetros enviados al servicio web
        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");

        // Credenciales simuladas de validación (Caso de estudio)
        String usuarioValido = "admin";
        String claveValida = "12345";

        // Validación de autenticación
        if (usuarioValido.equals(usuario) && claveValida.equals(clave)) {
            response.setStatus(HttpServletResponse.SC_OK);
            out.print("{\"estado\": \"exito\", \"mensaje\": \"Autenticación satisfactoria. Bienvenido, " + usuario + "!\"}");
        } else {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            out.print("{\"estado\": \"error\", \"mensaje\": \"Error en la autenticación: usuario o contraseña incorrectos.\"}");
        }
        
        out.flush();
    }
}
