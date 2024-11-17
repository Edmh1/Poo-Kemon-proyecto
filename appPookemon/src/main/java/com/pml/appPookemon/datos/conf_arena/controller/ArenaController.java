package main.java.com.pml.appPookemon.datos.conf_arena.controller;

import java.util.ArrayList;
import main.java.com.pml.appPookemon.datos.pookemon.model.Movimiento;
import main.java.com.pml.appPookemon.datos.pookemon.model.Pookemon;
import main.java.com.pml.appPookemon.datos.conf_arena.model.ArenaConf;
import main.java.com.pml.appPookemon.datos.registro.controller.OrganizadorController;
/**
 *
 * @author sebac
 */
public class ArenaController {
    private ArenaConf arena;
    private OrganizadorController organizadorController;
    
    public ArenaController() {
        this.organizadorController = new OrganizadorController();
        this.arena = organizadorController.recuperar().getArenaConf(); 
    }
    
    public ArenaConf getArena(){
        return arena;
    }
    
    public void agregarPookemon(Pookemon e){
        arena.addPookemon(e);
        organizadorController.setArena(arena);
    }
    
    public ArrayList<Pookemon> getPookemones(){
        return arena.getPookemones();
    }
    
    public void agregarMovimiento(Movimiento e){
        arena.addMovimiento(e);
        organizadorController.setArena(arena);
    }
    
    public ArrayList<Movimiento> getMovimientos(){
        return arena.getMovimientos();
    }
    
    public String buscarElementoMovimiento(String nombreBuscado){
        return arena.buscarElementoMovimiento(nombreBuscado);
    }
    
    public String buscarTipoMovimiento(String nombreBuscado){
        return arena.buscarTipoMovimiento(nombreBuscado);
    }
    
    public String buscarElementoPookemon(String nombreBuscado){
        return arena.buscarElementoPookemon(nombreBuscado);
    }
        
    public Pookemon buscarPokemonPorNombre(String nombreBuscado){
        return arena.buscarPokemonPorNombre(nombreBuscado);
    }
    
    public Movimiento buscarMovimientoPorNombre(String nombreBuscado){
        return arena.buscarMovimientoPorNombre(nombreBuscado);
    }
    
    public void eliminarPookemon(String pookemon){
        arena.eliminarPookemon(pookemon);
        organizadorController.setArena(arena);
    }
    
    public void eliminarMovimiento(String movimiento){
        arena.eliminarMovimiento(movimiento);
        organizadorController.setArena(arena);
    }
            
    
}
