
package com.mycompany.sistemafinal.model;


public class Cuidadores {
    private int id;
    private String nombre;
    private String telefono;
    private String localidad;

    public Cuidadores() {
    }
    
    public Cuidadores(int id, String nombre) {
    this.id = id;
    this.nombre = nombre;
    }
    public Cuidadores(int id, String nombre, String telefono, String localidad) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.localidad = localidad;
    }
    
    @Override
    public String toString() {
        return getId() + " - " + getNombre();
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

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    

}
