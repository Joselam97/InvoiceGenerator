package org.servlet.webapp.anotations.controllers;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.servlet.webapp.anotations.models.Factura;

import java.io.IOException;

// Annotates the servlet with the URL patterns it will handle.
// In this case, it maps to "/factura" and the root path "/".
@WebServlet({"/factura","/"})
public class ProductoServlet extends HttpServlet {

    // Injects the Factura bean, which is managed by the CDI container.
    // It provides an instance of Factura.
    @Inject
    private Factura factura;

    // The doGet method handles GET requests sent to the servlet.
    // This method will be called when a request is made to the "/factura" or "/" URL.
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Sets the 'factura' object as a request attribute to be accessed in the JSP page.
        req.setAttribute("factura", factura);
        // Sets the 'title', which will be used in the JSP to dynamically change the title of the page.
        req.setAttribute("title", "Facturacion");

        // Forwards the request and response to the "factura.jsp" page
        getServletContext().getRequestDispatcher("/factura.jsp").forward(req,resp);
    }
}
