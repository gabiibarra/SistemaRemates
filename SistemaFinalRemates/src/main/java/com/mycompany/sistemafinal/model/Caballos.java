
package com.mycompany.sistemafinal.model;

public class Caballos {
    private int id;
    private String nombre;
    private String peso;
    private int idCuidador;

    public Caballos() {
    }

    public Caballos(int id, String nombre, String peso, int idCuidador) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.idCuidador = idCuidador;
    }
    
    public Caballos(int id, String nombre) {
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

    public int getIdCuidador() {
        return idCuidador;
    }

    public void setIdCuidador(int idCuidador) {
        this.idCuidador = idCuidador;
    }
    
    
}
