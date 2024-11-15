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

public class EfectoParalisis implements Efecto,Serializable{

    private static final double PORCENTAJE_REDUCCION_VELOCIDAD = 0.10;
    private static final int DURACION_MAXIMA_TURNOS = 3;
    private int velocidadQuitada = 0;
    private int turnos = 0;
    private boolean puedeAtacar = true;

    @Override
    public boolean seActivaEfecto(Pookemon p) {
        return p.getEstadisticaPookemon().getVelocidad() < 100 || Math.random() < 0.25;
    }

    @Override
    public String aplicarEfecto(Pookemon p) {
        String info ="";
        if (turnos == 0 && seActivaEfecto(p)) {
            int velocidadActual = p.getEstadisticaPookemon().getVelocidad();
            velocidadQuitada = (int) (velocidadActual * PORCENTAJE_REDUCCION_VELOCIDAD);
            p.getEstadisticaPookemon().setVelocidad(velocidadActual - velocidadQuitada);
            info = "El Pookemon está paralizado, pierde velocidad y no puede atacar.";
        }

        puedeAtacar = false;
        turnos++;

        if (turnos >= DURACION_MAXIMA_TURNOS) {
            eliminarEfecto(p);
        }
        return info;
    }

    @Override
    public String eliminarEfecto(Pookemon p) {
        p.getEstadisticaPookemon().setVelocidad(p.getEstadisticaPookemon().getVelocidad() + velocidadQuitada);
        p.setEfecto(null);
        puedeAtacar = true;
        return "El efecto de parálisis ha terminado.";
    }

    public boolean puedeAtacar() {
        return puedeAtacar;
    }

    @Override
    public String tipoEfecto() {
        return "paralisis";
    }
    
}
