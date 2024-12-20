package org.servlet.webapp.anotations.configs;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import org.servlet.webapp.anotations.models.LineaFactura;
import org.servlet.webapp.anotations.models.Producto;

import java.util.Arrays;
import java.util.List;

/* This class is an application-scoped CDI producer which provides instances of
LineaFactura to be injected into other classes
 */
@ApplicationScoped
public class ProducerResources {

    // The @Produces annotation marks this method as a
    // producer that will supply a List of LineaFactura instances
    @Produces
    private List<LineaFactura> beanLineas() {
        Producto producto1 = new Producto("Monitor LG LCD 24'", 250);
        Producto producto2 = new Producto("Notebook Asus", 500);
        Producto producto3 = new Producto("Impresora HP Multifuncional", 80);
        Producto producto4 = new Producto("Escritorio Oficina", 300);

        // Creating LineaFactura instances using the products created above with quantities
        LineaFactura linea1 = new LineaFactura(producto1, 2);
        LineaFactura linea2 = new LineaFactura(producto2, 1);
        LineaFactura linea3 = new LineaFactura(producto3, 3);
        LineaFactura linea4 = new LineaFactura(producto4, 1);

        // Returning the list of LineaFactura objects created above
        return Arrays.asList(linea1, linea2, linea3, linea4);
    }
}
