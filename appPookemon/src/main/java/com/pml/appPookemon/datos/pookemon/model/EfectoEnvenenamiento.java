/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.pml.appPookemon.datos.pookemon.model;

import java.io.Serializable;

/**
 *
 * @author eddie
 */
public class EfectoEnvenenamiento implements Efecto, Serializable{
    private int turnos = 0;

    @Override
    public boolean seActivaEfecto(Pookemon p) {
        return p.getEstadisticaPookemon().getVida() > p.getEstadisticaPookemon().getVidaMaxima()*0.2
                &&  p.getEstadisticaPookemon().getVida() < p.getEstadisticaPookemon().getVidaMaxima()*0.9;
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
        if(turnos > 3){
            p.setEfecto(null);
        }
    }
    
}
