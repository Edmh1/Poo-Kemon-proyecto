package main.java.com.pml.appPookemon.torneo;

import main.java.com.pml.appPookemon.registro.Entrenador;

public class NodoTorneo {

    private Entrenador entrenador;
    private NodoTorneo izquierda;
    private NodoTorneo derecha;

    public NodoTorneo(Entrenador e){
        this.entrenador = e;
        this.izquierda = null;
        this.derecha = null;
    }

    public void setIzquierda(NodoTorneo izq){
        this.izquierda = izq;
    }

    public void setDerecha(NodoTorneo der) {
        this.derecha = der;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public NodoTorneo getDerecha() {
        return derecha;
    }

    public NodoTorneo getIzquierda() {
        return izquierda;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public boolean esHoja(){
        return (izquierda == null && derecha == null);
    }

}
