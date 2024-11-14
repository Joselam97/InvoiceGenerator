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
}
