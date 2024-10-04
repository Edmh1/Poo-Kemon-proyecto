package main.java.com.pml.appPookemon.torneo;

public abstract class Accion {
    private TipoAccion tipo;
    protected int id;

    public Accion(TipoAccion tipo, int id){
        this.tipo = tipo;
        this.id = id;
    }

    public TipoAccion getTipo() {
        return tipo;
    }

    public int getId() {
        return id;
    }

    public abstract Object getInfo();
}
