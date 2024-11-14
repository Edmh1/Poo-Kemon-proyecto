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
<<<<<<< HEAD
public class EfectoQuemadura implements Efecto,Serializable{
    private int dañoRealizado = 0;
=======
public class EfectoQuemadura implements Efecto {
    private static final double PORCENTAJE_DAÑO_QUEMADURA = 0.06;
    private static final int UMBRAL_DAÑO_TOTAL = 30;

    private int dañoAcumulado = 0;
>>>>>>> d2e1db9cadc7d95a87ce57895982dbbc933240f1

    @Override
    public boolean seActivaEfecto(Pookemon p) {
        return p.getEstadisticaPookemon().getDefensaEspecial() < 100;
    }

    @Override
    public String aplicarEfecto(Pookemon p) {
        if (seActivaEfecto(p)) {
            int vidaActual = p.getEstadisticaPookemon().getVida();
            int dañoPorQuemadura = (int) (vidaActual * PORCENTAJE_DAÑO_QUEMADURA);

            int nuevaVida = vidaActual - dañoPorQuemadura;
            p.getEstadisticaPookemon().setVida(nuevaVida);

            dañoAcumulado += dañoPorQuemadura;

            // Reducción del ataque físico y especial
            int ataqueEspecial = p.getEstadisticaPookemon().getAtaqueEspecial();
            int ataqueFisico = p.getEstadisticaPookemon().getAtaqueFisico();
            p.getEstadisticaPookemon().setAtaqueEspecial((int) (ataqueEspecial * 0.9));
            p.getEstadisticaPookemon().setAtaqueFisico((int) (ataqueFisico * 0.9));
            
            // Mensaje informativo
            String info = "El Pookemon ha sido quemado. Pierde " + dañoPorQuemadura + " puntos de vida. Su ataque físico y especial se reducen.";
            
            eliminarEfecto(p);
            return info;
        }
        return "El efecto no fue Activado";
    }

    @Override
    public String eliminarEfecto(Pookemon p) {
        if (dañoAcumulado >= UMBRAL_DAÑO_TOTAL) {
            p.setEfecto(null);
            return "El efecto de quemadura ha desaparecido.";
        }else{ 
            return "El efecto quemadura persiste";
        }
    }
    
    @Override
    public String tipoEfecto() {
        return "quemadura";
    }

    
}
