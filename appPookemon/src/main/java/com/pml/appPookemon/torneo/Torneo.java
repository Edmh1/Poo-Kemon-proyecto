package main.java.com.pml.appPookemon.torneo;

import java.util.ArrayList;
import main.java.com.pml.appPookemon.pookemon.Efecto;
import main.java.com.pml.appPookemon.pookemon.Movimiento;
import main.java.com.pml.appPookemon.pookemon.Pookemon;
import main.java.com.pml.appPookemon.registro.Entrenador;

public class Torneo{

    private ArrayList<Entrenador> jugadores = new ArrayList<>();
    private ArrayList<Pookemon> pookemones = new ArrayList<>();
    private ArrayList<Movimiento> movimientos = new ArrayList<>();
    private NodoTorneo ganador = new NodoTorneo(null);

    public void addJugador(Entrenador e){
        jugadores.add(e);
    }
    
    public void addPookemon(Pookemon x){
        pookemones.add(x);
    }
    
    public void editarNombrePookemon(int idPookemon_p, String nuevoNombre){
        for (Pookemon p : pookemones) {
            if(p.getIdPookemon() == idPookemon_p){
                p.setNombrePookemon(nuevoNombre);
            }
        }
    }
    
    public void editarElementoPookemon(int idPookemon_p, String nuevoElemento){
        for (Pookemon p : pookemones) {
            if(p.getIdPookemon() == idPookemon_p){
                p.setElementoPookemon(nuevoElemento);
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
        for (int i = 0; i < pookemones.size(); i++) {
            if(pookemones.get(i).getIdPookemon() == id_pookemon_p){
                pookemones.remove(i);
            }
            
        }
    }
    
    public void addMovimiento(Movimiento x){
        movimientos.add(x);
    }
    
    
    
    public void eliminarMovimiento(int id_movimiento_p){
        for (int i = 0; i < movimientos.size(); i++) {
            if(movimientos.get(i).getIdMovimiento() == id_movimiento_p){
                movimientos.remove(i);
            }
            
        }
    }
    
    public void editarMovimiento(int id_movimiento_p, String newNombre, String newDescripcion, int newPotencia, int newPrecision, int newCantidadPP, String newElemento, Efecto newEfecto){
        for (Movimiento m : movimientos) {
            if(m.getIdMovimiento() == id_movimiento_p){
                if(newNombre != null){
                    m.setNombreMovimiento(newElemento);
                }
                if(newDescripcion != null){
                    m.setDescripcionMovimiento(newDescripcion);
                }
                if(newPotencia != 0){
                    m.setPotencia(newPotencia);
                }
                if(newPrecision != 0){
                    m.setPrecision(newPrecision);
                }
                if(newCantidadPP != 0){
                    m.setCantidadPP(newCantidadPP);
                }
                if(newElemento != null){
                    m.setElemento(newElemento);
                }
                if(newEfecto != null){
                    m.setEfecto(newEfecto);
                }
            }
        }
    }
    
    public String toStringPookemones() {
        String lis = "Lista de pookemones:\n";
        
        for (Pookemon p : pookemones) {
            lis +="- " + p.toString()+ "\n";
        }

        return lis;
    }
    
    public String toStringMovimientos() {
        String lis = "Lista de movimientos:\n";
        
        for (Movimiento m : movimientos) {
            lis +="- " + m.toString()+ "\n";
        }

        return lis;
    }

    
    public String toStringJugadores() {
        String lis = "Lista de jugadores:\n";
        
        for (Entrenador entrenador : jugadores) {
            lis +="- " + entrenador.getNombreEntrenador() + "\n";
        }

        return lis;
    }

    /**
     * @return the movimientos
     */
    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    /**
     * @param movimientos the movimientos to set
     */
    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }


    public void darPremio(Recompensa a){
        for (Entrenador entrenador : jugadores) {
            entrenador.añadirPremios(a);
         }                  
    }

    public void crearTorneo(){
        if(jugadores.size() % 2 != 0){
            System.out.println("El numero de jugadores debe ser par");
        }else{
            ganador = construirTorneo(0, jugadores.size()-1);
        }
    }

    private NodoTorneo construirTorneo(int inicio, int fin) {
        if(inicio == fin){
            NodoTorneo nodo = new NodoTorneo(jugadores.get(inicio));
            return nodo;
        }

        int medio = (inicio+fin)/2;

        NodoTorneo izquierdo = construirTorneo(inicio, medio);
        NodoTorneo derecho = construirTorneo(medio + 1 , fin);

        NodoTorneo padre = new NodoTorneo(null);
        padre.setIzquierda(izquierdo);
        padre.setDerecha(derecho);

        return padre;
    }

}