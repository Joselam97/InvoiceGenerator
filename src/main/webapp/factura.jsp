<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="layout/header.jsp" />

<div class="container">
    <div class="card mb-4 shadow" style="border: none;">
        <div class="card-header" style="background-color: #457b9d; color: #fff; font-weight: bold; text-align: center; font-size: 1.2em; font-family: 'Poppins', sans-serif;">
            <h5 style="margin: 0;">Factura: ${factura.folio}</h5>
        </div>
        <div class="card-body" style="font-family: 'Roboto', sans-serif;">
            <p class="card-text">${factura.descripcion}</p>
            <p class="card-text"><strong>Cliente:</strong> ${factura.cliente.nombre} ${factura.cliente.apellido}</p>
        </div>
    </div>

    <h4 class="mb-3" style="color: #1d3557; font-family: 'Poppins', sans-serif;">Detalles de los productos</h4>
    <table class="table table-hover table-striped shadow-sm">
        <thead>
            <tr style="background-color: #a8dadc; color: #1d3557; font-family: 'Roboto', sans-serif; font-weight: 500;">
                <th>Producto</th>
                <th>Precio</th>
                <th>Cantidad</th>
                <th>Total</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${factura.lineas}" var="linea">
                <tr>
                    <td>${linea.producto.nombre}</td>
                    <td>${linea.producto.precio}</td>
                    <td>${linea.cantidad}</td>
                    <td style="background-color: #2a9d8f; color: #fff; font-family: 'Roboto', sans-serif;">${linea.calcularImporte()}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<jsp:include page="layout/footer.jsp" />