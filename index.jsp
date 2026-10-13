<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Módulo Java Web - Servlets & JSP</title>
    <!-- Importación de Bootstrap para estilos y diseño responsivo -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-8">
                
                <!-- Encabezado de la Evidencia -->
                <div class="card shadow-sm mb-4">
                    <div class="card-header bg-primary text-white text-center">
                        <h3 class="mb-0">Evidencia GA7-220501096-AA2-EV02</h3>
                        <small>Módulo de Software Codificado con Servlets y JSP</small>
                    </div>
                    <div class="card-body">
                        
                        <!-- Formulario procesado con Método POST hacia el Servlet -->
                        <h5 class="card-title mb-3">Registro de Usuario (Método POST)</h5>
                        <form action="UsuarioServlet" method="POST" class="mb-4">
                            <div class="mb-3">
                                <label for="nombre" class="form-label">Nombre Completo:</label>
                                <input type="text" class="form-control" id="nombre" name="nombre" required placeholder="Ingrese nombre">
                            </div>
                            <div class="mb-3">
                                <label for="email" class="form-label">Correo Electrónico:</label>
                                <input type="email" class="form-control" id="email" name="email" required placeholder="Ingrese correo">
                            </div>
                            <button type="submit" class="btn btn-success w-100">Registrar Vía POST</button>
                        </form>

                        <hr>

                        <!-- Enlace de Consulta procesado con Método GET hacia el Servlet -->
                        <h5 class="card-title mb-3">Consulta de Estado (Método GET)</h5>
                        <a href="UsuarioServlet?action=consultar&id=101" class="btn btn-outline-info w-100">
                            Consultar Usuario ID 101 Vía GET
                        </a>

                    </div>
                </div>

                <!-- Mensaje de confirmación o respuesta usando elementos JSP -->
                <%
                    String mensaje = (String) request.getAttribute("mensaje");
                    if (mensaje != null) {
                %>
                    <div class="alert alert-success text-center shadow-sm" role="alert">
                        <strong>Resultado del Servlet:</strong> <%= mensaje %>
                    </div>
                <%
                    }
                %>

            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
