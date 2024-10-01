package main.java.com.pml.appPookemon.registro;

import main.java.com.pml.appPookemon.torneo.Torneo;
import java.util.ArrayList;

public class Organizador {
    private int idOrganizador;
    private int idtorneo;
    private ArrayList<Torneo> torneos = new ArrayList<>();  
    private String password;

    public Organizador(int idOrganizador, String password,int  idtorneo) {

        this.idOrganizador = idOrganizador;
        this.password = password;
        this.idtorneo =  idtorneo;

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
        for (Torneo torneo : torneos) {
            torneo.addJugador(jugador);           
        }
    }

    public void añadirTorneos(Torneo tor){
        torneos.add(crearTorneo());
        
    }

    public Torneo crearTorneo(){
        Torneo tor = new Torneo();
        return tor;
    }

    public boolean hayTorneo(){
        return torneos != null;
    }

    public boolean verficiarCont(String pass){
        return this.password.equals(pass);
    }



}
