/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.pml.appPookemon.datos.pookemon.model;

import main.java.com.pml.appPookemon.datos.pookemon.Efecto;

/**
 *
 * @author eddie
 */
public class EfectoParalisis implements Efecto{
    private int velocidadQuitada = 0;

    @Override
    public boolean seActivaEfecto(Pookemon p) {
        return p.getEstadisticaPookemon().getVelocidad() < 100 || Math.random() < 0.25;
    }

    @Override
    public void aplicarEfecto(Pookemon p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void afectarEstadiscitas(Pookemon p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarEfecto(Pookemon p) {
        if(velocidadQuitada > 50){
            p.setEfecto(null);
        }
    }
    
}
