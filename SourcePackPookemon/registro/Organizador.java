package SourcePackPookemon.registro;

import java.util.ArrayList;

import SourcePackPookemon.torneo.Torneo;

public class Organizador {

    private int idOrganizador;
    ArrayList<Torneo> torneos = new ArrayList<>();
    private int torneoActual;

    public Organizador(int idOrganizador, int torneoActual) {
        this.idOrganizador = idOrganizador;
        this.torneoActual = torneoActual;
    }

    @Override
    public String toString() {
        return "Organizador [idOrganizador=" + idOrganizador + ", torneoActual=" + torneoActual + "]";
    }

    public void inscribirJugadorTorneo(Entrenador jugador , int idTorneo){
       
    }

    

}
