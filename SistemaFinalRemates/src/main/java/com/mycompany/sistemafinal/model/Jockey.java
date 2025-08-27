package com.mycompany.sistemafinal.model;


public class Jockey {
    private int id;
    private String nombre;
    private String peso;
    private String telefono;
    private String localidad;

    public Jockey() {
    }

    public Jockey(int id, String nombre, String peso, String telefono, String localidad) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.telefono = telefono;
        this.localidad = localidad;
    }
    public Jockey(int id, String nombre) {
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

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
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
