package org.servlet.webapp.anotations.models;

public class LineaFactura {

    private Producto producto;
    private Integer cantidad;

    public LineaFactura(Producto producto, Integer cantidad){
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    // This method calculates the total amount for this product line (quantity * price of the product)
    public Integer calcularImporte() {
        return cantidad * producto.getPrecio(); // Calls the 'getPrecio()' method of Producto to get the price
    }
}
