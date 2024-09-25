package appPookemon.src.torneo;

import java.util.ArrayList;

import appPookemon.src.registro.Entrenador;

public class Torneo {

    private ArrayList<Entrenador> jugadores = new ArrayList<>();

    public void addJugador(Entrenador e){
        jugadores.add(e);
    }

    @Override
    public String toString() {
        String lis = "Lista de jugadores:\n";
        
        for (Entrenador entrenador : jugadores) {
            lis +="- " + entrenador.getNombre() + "\n";
        }

        return lis;
    }

}
