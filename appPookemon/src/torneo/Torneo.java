package torneo;

import java.util.ArrayList;
import pookemon.Efecto;
import pookemon.Movimiento;

import registro.Entrenador;
import pookemon.Pookemon;

public class Torneo {

    private ArrayList<Entrenador> jugadores = new ArrayList<>();
    private ArrayList<Pookemon> pookemones = new ArrayList<>();

    public void addJugador(Entrenador e){
        jugadores.add(e);
    }
    
    public void addPookemon(Pookemon x){
        pookemones.add(x);
    }
    
    public void editarNombrePookemon(int idPookemon_p, String nuevoNombre){
        for (Pookemon p : pookemones) {
            if(p.getIdPookemon() == idPookemon_p){
                p.setNombre(nuevoNombre);
            }
        }
    }
    
    public void editarElementoPookemon(int idPookemon_p, String nuevoElemento){
        for (Pookemon p : pookemones) {
            if(p.getIdPookemon() == idPookemon_p){
                p.setElemento(nuevoElemento);
            }
        }
    }
    
    public void editarEfectoPookemon(int idPookemon_p, Efecto nuevoEfecto){
        for (Pookemon p : pookemones) {
            if(p.getIdPookemon() == idPookemon_p){
                p.setEfecto(nuevoEfecto);
            }
        }
    }
    
    public void eliminarPookemon(int id_pookemon_p){
        for (Pookemon p : pookemones) {
            if(p.getIdPookemon() == id_pookemon_p){
                pookemones.remove(p);
            }
        }
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
