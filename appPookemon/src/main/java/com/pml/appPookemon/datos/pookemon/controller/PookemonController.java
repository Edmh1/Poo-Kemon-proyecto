/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.pml.appPookemon.datos.pookemon.controller;

import main.java.com.pml.appPookemon.datos.conf_arena.controller.ArenaController;
import main.java.com.pml.appPookemon.datos.pookemon.model.Pookemon;

/**
 *
 * @author Arturo
 */
public class PookemonController {
    
    private ArenaController a;
    
    public PookemonController(){
        this.a = new ArenaController();
    }

    public Pookemon agregarPookemon(String nombre, int velocidad, int ataqueFisico, int defensaFisica, int ataqueEspecial, int defensaEspecial, String elemento) {
        Pookemon pookemon = new Pookemon(a.getPookemones().size(), nombre, elemento);
        pookemon.inicializarEstadistica(100, ataqueFisico, defensaFisica, ataqueEspecial, defensaEspecial, velocidad);
        return pookemon;
        
    }
    
      
}
