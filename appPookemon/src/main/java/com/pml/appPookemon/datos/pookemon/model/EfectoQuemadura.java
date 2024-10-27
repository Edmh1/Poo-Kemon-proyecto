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
public class EfectoQuemadura implements Efecto{
    private int dañoRealizado = 0;

    @Override
    public boolean seActivaEfecto(Pookemon p) {
        return p.getEstadisticaPookemon().getDefensaEspecial() < 100;
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
        if(dañoRealizado > 30){
            p.setEfecto(null);
        }
    }


    
}
