/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.pml.appPookemon.datos.pookemon.controller;

import main.java.com.pml.appPookemon.datos.conf_arena.controller.ArenaController;
import main.java.com.pml.appPookemon.datos.pookemon.model.Efecto;
import main.java.com.pml.appPookemon.datos.pookemon.model.Movimiento;
import main.java.com.pml.appPookemon.datos.pookemon.model.MovimientoEspecial;
import main.java.com.pml.appPookemon.datos.pookemon.model.MovimientoFisico;

/**
 *
 * @author Arturo
 */
public class MovimientoController {
    
    private ArenaController a;
    
    public MovimientoController(){
        a = new ArenaController();
    }

    public Movimiento agregarMovimiento(String nombreMovimiento, int potencia, int precision, int cantidadPP, String elemento, Efecto efecto, String tipo, int probabilidadEfecto) {
        if(tipo.equalsIgnoreCase("Mov. Fisico")){
            Movimiento movimiento = new MovimientoFisico(asignarId(a.getMovimientos().size()), nombreMovimiento, potencia, precision, cantidadPP, elemento, efecto, probabilidadEfecto);
            return movimiento;
        } else {
            Movimiento movimiento = new MovimientoEspecial(asignarId(a.getMovimientos().size()), nombreMovimiento, potencia, precision, cantidadPP, elemento, efecto, probabilidadEfecto);
            return movimiento;
        }
        
    }
    
    private int asignarId(int id){
        for (Movimiento movimiento : a.getMovimientos()) {
            if(id==movimiento.getIdMovimiento()){
                id++;
                asignarId(id);
            }
        }
        
        return id;
    }
    
}
