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
public class MovimientoFisico extends Movimiento{

    public MovimientoFisico(int idMovimiento, String nombre, int potencia, int precision, int cantidadPP, String elemento, Efecto efecto, String rutaImagen, String tipoMovimiento) {
        super(idMovimiento, nombre, potencia, precision, cantidadPP, elemento, efecto, rutaImagen, tipoMovimiento);
    }
    
    

    @Override
    protected int calcularDañoBase(Pookemon atacante, Pookemon defensor) {
        int ataque = atacante.getEstadisticaPookemon().getAtaqueFisico();
        int defensa = defensor.getEstadisticaPookemon().getDefensaFisica();
        return (int) (((2.5f*getPotencia() * ataque) / (defensa*25))+2) ;
    }

    @Override
    public String getTipoMovimiento() {
        return "Fisico";
    }
    
}
