/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.pml.appPookemon.datos.pookemon.model;

import main.java.com.pml.appPookemon.datos.pookemon.Efecto;
import main.java.com.pml.appPookemon.datos.pookemon.model.Movimiento;


/**
 *
 * @author eddie
 */
public class MovimientoFisico extends Movimiento{
    
    public MovimientoFisico(int idMovimiento, String nombre, String descripcion, int potencia, int precision, int cantidadPP, String elemento, Efecto efecto) {
        super(idMovimiento, nombre, descripcion, potencia, precision, cantidadPP, elemento, efecto);
    }

    @Override
    protected int calcularDañoBase(Pookemon atacante, Pookemon defensor) {
        int ataque = atacante.getEstadisticaPookemon().getAtaqueFisico();
        int defensa = defensor.getEstadisticaPookemon().getDefensaFisica();
        return (getPotencia() * ataque / defensa) / 2;
    }
    
}
