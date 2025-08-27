
package com.mycompany.sistemafinal.model;

public class Operador {
    private int id;
    private String nombre;
    private String telefono;
    private String contrasenia;
    private String rol;

    public Operador() {
    }
     
    public Operador(int id, String nombre, String telefono, String contrasenia, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }
    
    public Operador(int id, String nombre) {
    this.id = id;
    this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return id + " - " + nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
     
}
