/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.pml.appPookemon.controller;
import main.java.com.pml.appPookemon.datos.pookemon.model.Movimiento;
import main.java.com.pml.appPookemon.datos.pookemon.model.Pookemon;
import main.java.com.pml.appPookemon.datos.registro.model.Entrenador;
import main.java.com.pml.appPookemon.datos.torneo.Torneo;
/**
 *
 * @author sebac
 */
public class PookemonContoller {
    private Torneo torneo = new Torneo();
    
    public void crearTorneo(){
        torneo.crearTorneo();
    }
    
    public void agregarJugador(Entrenador e){
        torneo.addJugador(e);
    }
    
    public void agregarPookemon(Pookemon e){
        torneo.addPookemon(e);
    }
    
    public void agregarMovimiento(Movimiento e){
        torneo.addMovimiento(e);
    }
    
    public Entrenador[] batallaActual(){
        return torneo.siguienteBatalla();
    }
    
}
