
package com.mycompany.sistemafinal.model;

import java.sql.Date;

public class Carrera {
    private int id;
    private String nombre;
    private Date fecha;
    private float distancia;

    public Carrera() {
    }

    public Carrera(int id, String nombre, Date fecha, float distancia) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.distancia = distancia;
        
    }
    
    public Carrera(int id, String nombre) {
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
   
}
