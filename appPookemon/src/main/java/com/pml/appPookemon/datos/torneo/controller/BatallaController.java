/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.pml.appPookemon.datos.torneo.controller;
import main.java.com.pml.appPookemon.datos.torneo.model.Batalla;
import main.java.com.pml.appPookemon.datos.registro.model.*;
/**
 *
 * @author sebac
 */
public class BatallaController {
    private Batalla batalla;

    public BatallaController(Batalla batalla) {
        this.batalla = batalla;
    }
    
    public Entrenador getEntrenador1(){
        return batalla.getEntrenador1();
    }
    
    public Entrenador getEntrenador2(){
        return batalla.getEntrenador2();
    }
}
