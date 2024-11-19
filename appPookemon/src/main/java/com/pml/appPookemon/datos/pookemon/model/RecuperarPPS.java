/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.pml.appPookemon.datos.pookemon.model;

import java.io.Serializable;

/**
 *
 * @author sebac
 */
public class RecuperarPPS extends Objeto{
    
    public RecuperarPPS(int idObjeto) {
        super(idObjeto, "Recuperar PPs", "PPs", 5);
    }

    @Override
    public void usarObjeto(Pookemon pookemon, int id) {
        /*
        for (Movimiento mov : pookemon.getMovimientos()) {
            if(id == mov.getIdMovimiento()){
                System.out.println("PPs del movimiento "+mov.getNombreMovimiento() + " antes del recupera pps: " + mov.getCantidadPP());
                int cantidadMaximaPPs = mov.getCantidadMaximaPPs();
                int cantidadPPs = mov.getCantidadPP() + getPuntosR();
                if(cantidadPPs >= cantidadMaximaPPs){
                    mov.setCantidadPP(cantidadMaximaPPs);
                }else{
                    mov.setCantidadPP(cantidadPPs);
                }
                System.out.println("PPs del movimiento " + mov.getNombreMovimiento() + " despues del recupera pps: " + mov.getCantidadPP());
                return;
            }
        }
        */
        Movimiento mov = pookemon.obtenerMovimientoPorID(id);
        int cantidadMaximaPPs = mov.getCantidadMaximaPPs();
        int cantidadPPs = mov.getCantidadPP() + getPuntosR();
        if(cantidadPPs >= cantidadMaximaPPs){
            mov.setCantidadPP(cantidadMaximaPPs);
        }else{
            mov.setCantidadPP(cantidadPPs);
        }
        System.out.println("Se han recuperados pps");
    }
    
    
    
}
