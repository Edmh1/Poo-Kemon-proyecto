package main.java.com.pml.appPookemon.datos.torneo;

public abstract class Accion {
    private TipoAccion tipoAccion;
    protected int idAccion;

    public Accion(TipoAccion tipo, int id){
        this.tipoAccion = tipo;
        this.idAccion = id;
    }

    public TipoAccion getTipoAccion() {
        return tipoAccion;
    }

    public int getIdAccion() {
        return idAccion;
    }

    public abstract Object getInfo();
}
