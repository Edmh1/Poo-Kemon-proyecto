package main.java.com.pml.appPookemon.torneo;

import main.java.com.pml.appPookemon.registro.Entrenador;

public abstract class Accion {
    private TipoAccion tipo;
    private Entrenador e;

    public Accion(TipoAccion tipo){
        this.tipo = tipo;
    }

    public TipoAccion getTipo() {
        return tipo;
    }

    public abstract void ejecutar();
}
