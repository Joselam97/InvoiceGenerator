package org.servlet.webapp.anotations.models;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;

// @Named makes the Factura bean available for injection in the JSF context
@Named
@RequestScoped // The bean is created per HTTP request
public class Factura {

    // Injecting a list of LineaFactura objects, which will be provided by the container
    @Inject
    private List<LineaFactura> lineas;

    private Cliente cliente;
    private String descripcion;
    private Long folio;

    // The @PostConstruct method is called after the bean's dependencies are injected
    @PostConstruct
    public void inicializar() {
        // Initialize the customer's name and create a description for the invoice
        cliente.setNombre(cliente.getNombre().concat(" ").concat("Luis"));
        descripcion = "Factura Oficina".concat(" del cliente: ").concat(cliente.getNombre());
        // Generate a random folio number for the invoice
        folio = Math.round(Math.random() * 1000000000)+10;
    }

    // The @PreDestroy method is called before the bean is destroyed to clean up any resources or log messages
    @PreDestroy
    public void destruir(){
        System.out.println("Factura destruida: ".concat(descripcion));
    }

    public List<LineaFactura> getLineas() {
        return lineas;
    }

    public void setLineas(List<LineaFactura> lineas) {
        this.lineas = lineas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // Setter for the 'cliente' field, annotated with @Inject to allow dependency injection
    @Inject
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getFolio() {
        return folio;
    }

    public void setFolio(Long folio) {
        this.folio = folio;
    }
}
