package org.servlet.webapp.anotations.controllers;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.servlet.webapp.anotations.models.Factura;

import java.io.IOException;

@WebServlet({"/factura","/"})
public class ProductoServlet extends HttpServlet {

    @Inject
    private Factura factura;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("factura", factura);
        req.setAttribute("title", "Ejemplo Factura con Inyeccion de Dependencia");

        getServletContext().getRequestDispatcher("/factura.jsp").forward(req,resp);
    }
}
