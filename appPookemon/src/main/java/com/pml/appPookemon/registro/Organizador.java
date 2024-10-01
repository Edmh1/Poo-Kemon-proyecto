package main.java.com.pml.appPookemon.registro;

import main.java.com.pml.appPookemon.torneo.Torneo;
import java.util.ArrayList;

public class Organizador {
    private int idOrganizador;
    private Torneo torneoActual;
    private ArrayList<Torneo> torneos = new ArrayList<>();  
    private String password;

    public Organizador(int idOrganizador, String password) {
        this.idOrganizador = idOrganizador;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Organizador [idOrganizador=" + idOrganizador + "]";
    }
    public String mostrarTorneos(){
        String lis = "";
        for (Torneo torneo : torneos) {
            lis += torneo.toString() + "\n";
        } 
        return lis;
    }

    public void inscribirJugadorTorneo(Entrenador jugador ){
        torneoActual.addJugador(jugador);
    }

    public void añadirTorneos(){
        torneos.add(torneoActual);
    }

    public void crearTorneo(){
        torneos.add(new Torneo());
        torneoActual = torneos.get(torneos.size()-1);
    }

    public boolean hayTorneo(){
        return torneoActual != null;
    }

    public boolean verficiarCont(String pass){
        return this.password.equals(pass);
    }

    public Torneo getTorneoActual(){
        return torneoActual;
    }

}
