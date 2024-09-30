package main.java.com.pml.appPookemon.registro;

import main.java.com.pml.appPookemon.torneo.Torneo;


public class Organizador {
    private int idOrganizador;
    private Torneo torneoActual;
    private String password;

    public Organizador(int idOrganizador, String password) {
        this.idOrganizador = idOrganizador;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Organizador [idOrganizador=" + idOrganizador + "]";
    }

    public void inscribirJugadorTorneo(Entrenador jugador ){
        torneoActual.addJugador(jugador);
    }

    public Torneo crearTorneo(){
        torneoActual = new Torneo();
        return torneoActual;
    }

    public boolean hayTorneo(){
        return torneoActual != null;
    }

    public boolean verficiarCont(String pass){
        return this.password.equals(pass);
    }



}
