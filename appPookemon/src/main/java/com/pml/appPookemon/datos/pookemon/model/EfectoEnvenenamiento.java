/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.pml.appPookemon.datos.pookemon.model;

/**
 *
 * @author eddie
 */
public class EfectoEnvenenamiento implements Efecto {
    private static final double PORCENTAJE_DAÑO_ENVENENAMIENTO = 0.12;
    private static final int DURACION_MAXIMA_TURNOS = 3;

    private int turnos = 0;

    @Override
    public boolean seActivaEfecto(Pookemon p) {
        return p.getEstadisticaPookemon().getVida() > p.getEstadisticaPookemon().getVidaMaxima() * 0.2
                && p.getEstadisticaPookemon().getVida() < p.getEstadisticaPookemon().getVidaMaxima() * 0.9;
    }

    @Override
    public String aplicarEfecto(Pookemon p) {
        int vidaActual = p.getEstadisticaPookemon().getVida();
        int dañoPorEnvenenamiento = (int) (vidaActual * PORCENTAJE_DAÑO_ENVENENAMIENTO);

        p.getEstadisticaPookemon().setVida(vidaActual - dañoPorEnvenenamiento);
        turnos++;

        String info = "El Pookemon pierde " + dañoPorEnvenenamiento + " puntos de vida debido al envenenamiento";
        
        if (turnos >= DURACION_MAXIMA_TURNOS || !seActivaEfecto(p)) {
            eliminarEfecto(p);
        }
        return info;
    }

    @Override
    public String eliminarEfecto(Pookemon p) {
        p.setEfecto(null);
        return "El envenenamiento ha terminado.";
    }
    
    @Override
    public String tipoEfecto() {
        return "envenenamiento";
    }
    
}
