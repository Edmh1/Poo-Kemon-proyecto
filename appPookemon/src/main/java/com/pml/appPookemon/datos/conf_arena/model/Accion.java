package main.java.com.pml.appPookemon.datos.conf_arena.model;

import java.io.Serializable;

public abstract class Accion implements Serializable{
    private TipoAccion tipoAccion;
    protected int idAccion;

    public Accion(TipoAccion tipo, int id){
        this.tipoAccion = tipo;
        this.idAccion = id;
    }

    public TipoAccion getTipoAccion() {
        return tipoAccion;
    }

    public void setTipoAccion(TipoAccion tipoAccion) {
        this.tipoAccion = tipoAccion;
    }

    public int getIdAccion() {
        return idAccion;
    }

    public abstract Object getInfo();
}
