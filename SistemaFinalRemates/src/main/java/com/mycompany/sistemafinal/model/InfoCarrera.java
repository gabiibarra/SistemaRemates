
package com.mycompany.sistemafinal.model;

public class InfoCarrera {
    private int id;
    private int idCarrera;
    private int idCaballo;
    private int idJokey;

    public InfoCarrera() {
    }
    

    public InfoCarrera(int id,int idCarrera, int idCaballo, int idJokey) {
        this.id = id;
        this.idCarrera = idCarrera;
        this.idCaballo = idCaballo;
        this.idJokey = idJokey;
    }
    
    @Override
    public String toString() {
        String valor = "Carrera: " + idCarrera + " - Caballo: " + idCaballo;

        if (idCarrera == 0) {
            valor = "Seleccionar";
        }

        return valor;
    }

    public InfoCarrera(int idCarrera, int idCaballo) {
    this.idCarrera = idCarrera;
    this.idCaballo = idCaballo;
    }


    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    public int getIdCaballo() {
        return idCaballo;
    }

    public void setIdCaballo(int idCaballo) {
        this.idCaballo = idCaballo;
    }

    public int getIdJokey() {
        return idJokey;
    }

    public void setIdJokey(int idJokey) {
        this.idJokey = idJokey;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
  
    
    
}
