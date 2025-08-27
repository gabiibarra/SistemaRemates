package com.mycompany.sistemafinal.model;

public class Remate {
    private int id;
    private int idInfoCarrera;  
    private int idOperador;
    private float importePagado;
    private float importeCobrar;
    private int idTipoJugada;

    public Remate() {
    }

    public Remate(int id,int idInfoCarrera, int idOperador, float importePagado, float importeCobrar, int idTipoJugada) {
        this.id = id;
        this.idInfoCarrera = idInfoCarrera;
        this.idOperador = idOperador;
        this.importePagado = importePagado;
        this.importeCobrar = importeCobrar;
        this.idTipoJugada = idTipoJugada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    
    
    public int getIdInfoCarrera() {
        return idInfoCarrera;
    }

    public void setIdInfoCarrera(int idInfoCarrera) {
        this.idInfoCarrera = idInfoCarrera;
    }

    public int getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(int idOperador) {
        this.idOperador = idOperador;
    }

    public float getImportePagado() {
        return importePagado;
    }

    public void setImportePagado(float importePagado) {
        this.importePagado = importePagado;
    }

    public float getImporteCobrar() {
        return importeCobrar;
    }

    public void setImporteCobrar(float importeCobrar) {
        this.importeCobrar = importeCobrar;
    }

    public int getIdTipoJugada() {
        return idTipoJugada;
    }

    public void setIdTipoJugada(int idTipoJugada) {
        this.idTipoJugada = idTipoJugada;
    }
}
