package org.servlet.webapp.anotations.models;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;

// @RequestScoped ensures that the Cliente object is created once per HTTP request
@RequestScoped
public class Cliente {

    private String nombre;
    private String apellido;

    // The @PostConstruct annotation tells the container to call this method after the bean has been created
    @PostConstruct
    public void inicializar(){
        nombre = "Jose";
        apellido = "Alvarez";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
