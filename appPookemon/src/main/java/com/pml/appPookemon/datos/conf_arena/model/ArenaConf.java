package main.java.com.pml.appPookemon.datos.conf_arena.model;

import java.io.Serializable;
import java.util.ArrayList;
import main.java.com.pml.appPookemon.datos.pookemon.model.Movimiento;
import main.java.com.pml.appPookemon.datos.pookemon.model.Pookemon;



public class ArenaConf implements Serializable{

    private ArrayList<Pookemon> pookemones = new ArrayList<>();
    private ArrayList<Movimiento> movimientos = new ArrayList<>();
    private Recompensa premio;
    
    public ArenaConf() {
        premio = new Recompensa("Targeta Regalo", "Este es un sobre misterioso");
    }
    

    public ArrayList<Pookemon> getPookemones() {
        return pookemones;
    }
    
    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }
    
    public void addPookemon(Pookemon x){
        pookemones.add(x);
    }
    
    public void eliminarPookemon(String pookemon){
        for (int i = 0; i < pookemones.size(); i++) {
            if(pookemones.get(i).getNombrePookemon().equalsIgnoreCase(pookemon)){
                pookemones.remove(i);
            }          
        }
    }
    
    public void editarPookemon(Pookemon p){
        pookemones.set(p.getIdPookemon(), p);
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
    
    public void editarMovimiento(Movimiento m){
        movimientos.set(m.getIdMovimiento(), m);
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
    
    public String buscarElementoPookemon(String nombreBuscado) {
        for (Pookemon pookemon : pookemones) {
            if(pookemon.getNombrePookemon().equalsIgnoreCase(nombreBuscado)){
                return pookemon.getElementoPookemon();
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

}
