/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pookemon;

/**
 *
 * @author eddie
 */
public class MovimientoEspecial extends Movimiento {
    
    public MovimientoEspecial(int idMovimiento, String nombre, String descripcion, int potencia, int precision, int cantidadPP, String elemento, Efecto efecto) {
        super(idMovimiento, nombre, descripcion, potencia, precision, cantidadPP, elemento, efecto);
    }
    
    @Override
    protected int calcularDañoBase(Pookemon atacante, Pookemon defensor) {
        int ataque = atacante.getEstadistica().getAtaqueEspecial();
        int defensa = defensor.getEstadistica().getDefensaEspecial();
        return (getPotencia() * ataque / defensa) / 2;
    }
    
}
