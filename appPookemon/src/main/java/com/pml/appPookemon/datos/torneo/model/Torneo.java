package main.java.com.pml.appPookemon.datos.torneo.model;

import java.io.Serializable;
import java.util.ArrayList;
import main.java.com.pml.appPookemon.datos.pookemon.model.Efecto;
import main.java.com.pml.appPookemon.datos.pookemon.model.Movimiento;
import main.java.com.pml.appPookemon.datos.pookemon.model.Pookemon;
import main.java.com.pml.appPookemon.datos.registro.model.Entrenador;


public class Torneo implements Serializable{

    private ArrayList<Entrenador> jugadores = new ArrayList<>();
    private ArrayList<Pookemon> pookemones = new ArrayList<>();
    private ArrayList<Movimiento> movimientos = new ArrayList<>();
    private ArrayList<Batalla> batallas = new ArrayList<>();
    private NodoTorneo ganador = new NodoTorneo(null);
    private NodoTorneo actual;
    private int idtorneo;
    private Recompensa premio;

   
    public int getIdtorneo() {
        return idtorneo;
    }
    
    public void addJugador(Entrenador e){
        jugadores.add(e);
    }
    
    public void addPookemon(Pookemon x){
        pookemones.add(x);
    }

    public ArrayList<Pookemon> getPookemones() {
        return pookemones;
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
    
    public void eliminarPookemon(String pookemon){
        for (int i = 0; i < pookemones.size(); i++) {
            if(pookemones.get(i).getNombrePookemon().equalsIgnoreCase(pookemon)){
                pookemones.remove(i);
            }          
        }
    }
    
    public void addMovimiento(Movimiento x){
        movimientos.add(x);
    }
    
    
    
    public void eliminarMovimiento(String movimiento){
        for (int i = 0; i < movimientos.size(); i++) {
            if(movimientos.get(i).getNombreMovimiento().equalsIgnoreCase(movimiento)){
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

    //ajustar logica aunque los jugadores sean par no cumple con arbol binario
    public void crearTorneo(){
        actual = ganador;
        if(numeroDeJugadoresPermitido()){
            ganador = construirTorneo(0, jugadores.size()-1);
        }else{
            System.out.println("No se pudo crear el torneo (Numero de jugadores no permitidos)");
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

    public Entrenador[] siguienteBatalla(){
        actual = buscarBatalla(ganador);
        if(actual != null){
            return new Entrenador[]{actual.getIzquierda().getEntrenador(), actual.getDerecha().getEntrenador()};
        }
        return null;
    }

    private NodoTorneo buscarBatalla(NodoTorneo n){
        if(n.esHoja() || n.getEntrenador() != null){
            return null;
        }

        NodoTorneo izq = n.getIzquierda();
        NodoTorneo der = n.getDerecha();

        if(izq.getEntrenador() != null && der.getEntrenador() != null && n.getEntrenador() == null){
            return n;
        }

        NodoTorneo batallaIzquierda = buscarBatalla(izq);
        if(batallaIzquierda != null){
            return batallaIzquierda;
        }
        return buscarBatalla(der);
    }

    public void setGanador(Entrenador e){
        if(actual != null){
            actual.setEntrenador(e);
            actual = null;
        } else {
            System.out.println("Error: no hay batalla activa");
        }
    }
    
    public Batalla buscarBatalla(int idBatalla_p){
        for (Batalla b : batallas) {
            if(b.getId() == idBatalla_p){
                return b;
            }
        }
        return null;
    }
            
    public void crearRecompensa(Recompensa pre){
        premio =   pre;      
    }
    
    public Recompensa  getPremio(){
        return premio; 
    }    


    private boolean numeroDeJugadoresPermitido(){
        int n = jugadores.size();
        return n > 0 && (n & (n -1 )) == 0;
    }
    

    public NodoTorneo getGanador() {
        return ganador;
    }
    
    public String buscarElementoPookemon(String nombreBuscado) {
        for (Pookemon pookemon : pookemones) {
            if(pookemon.getNombrePookemon().equalsIgnoreCase(nombreBuscado)){
                return pookemon.getElementoPookemon();
            }
        }
        return null;
    }

    public String buscarElementoMovimiento(String nombreBuscado) {
        for (Movimiento movimiento : movimientos) {
            if(movimiento.getNombreMovimiento().equalsIgnoreCase(nombreBuscado)){
                return movimiento.getElemento();
            }
        }
        return null;
    }

    public String buscarTipoMovimiento(String nombreBuscado) {
        for (Movimiento movimiento : movimientos) {
            if(movimiento.getNombreMovimiento().equalsIgnoreCase(nombreBuscado)){
                return movimiento.getTipoMovimiento();
            }
        }
        return null;
    }
    
    public Pookemon buscarPokemonPorNombre(String nombreBuscado){
        for (Pookemon pookemon : pookemones) {
            if(pookemon.getNombrePookemon().equalsIgnoreCase(nombreBuscado)){
                return pookemon;
            }
        }
        return null;
    }
    
    public Movimiento buscarMovimientoPorNombre(String nombreBuscado){
        for (Movimiento movimiento : movimientos) {
            if(movimiento.getNombreMovimiento().equalsIgnoreCase(nombreBuscado)){
                return movimiento;
            }
        }
        return null;
    }

}
