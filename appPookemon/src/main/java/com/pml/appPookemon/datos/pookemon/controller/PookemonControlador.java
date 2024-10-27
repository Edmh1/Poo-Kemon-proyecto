/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.pml.appPookemon.datos.pookemon.controller;

import main.java.com.pml.appPookemon.datos.pookemon.model.Pookemon;

/**
 *
 * @author Arturo
 */
public class PookemonControlador {

    public Pookemon agregarPookemon(String nombre, int velocidad, int ataqueFisico, int defensaFisica, int ataqueEspecial, int defensaEspecial, String elemento) {
        Pookemon pookemon = new Pookemon(0, nombre, elemento);
        pookemon.inicializarEstadistica(100, ataqueFisico, defensaFisica, ataqueEspecial, defensaEspecial, velocidad);
        return pookemon;
        
    }
    
      
}
