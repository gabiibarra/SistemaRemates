package com.mycompany.sistemafinal.model;

public class TipoJugada {
    private int id;
    private String nombre;
    private int porcentaje;
    private String descripcion;

    public TipoJugada() {
    }

    public TipoJugada(int id, String nombre, int porcentaje, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.descripcion = descripcion;
    }
    
    public TipoJugada(int id, String nombre) {
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

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
