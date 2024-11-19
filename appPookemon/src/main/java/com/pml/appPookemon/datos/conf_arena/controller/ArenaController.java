package main.java.com.pml.appPookemon.datos.conf_arena.controller;

import java.util.ArrayList;
import java.util.List;
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
    
    public List<Pookemon> getPookemones(){
        return arena.getPookemones();
    }
    
    public void agregarPookemon(Pookemon e){
        arena.addPookemon(e);
        organizadorController.setArena(arena);
    }
    
    public void eliminarPookemon(String pookemon){
        arena.eliminarPookemon(pookemon);
        organizadorController.setArena(arena);
    }
    
    public void editarPookemon(Pookemon p){
        arena.editarPookemon(p);
        organizadorController.setArena(arena);
    }
   
    public List<Movimiento> getMovimientos(){
        return arena.getMovimientos();
    }
    
    public void agregarMovimiento(Movimiento e){
        arena.addMovimiento(e);
        organizadorController.setArena(arena);
    }
    
    public void eliminarMovimiento(String movimiento){
        arena.eliminarMovimiento(movimiento);
        organizadorController.setArena(arena);
    }
    
    public void editarMovimiento(Movimiento m){
        arena.editarMovimiento(m);
        organizadorController.setArena(arena);
    }
    
    public Movimiento buscarMovimientoPorNombre(String nombreBuscado){
        return arena.buscarMovimientoPorNombre(nombreBuscado);
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
    
}
