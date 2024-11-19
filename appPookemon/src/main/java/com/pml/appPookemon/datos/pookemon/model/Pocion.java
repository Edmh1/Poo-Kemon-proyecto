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
public class Pocion extends Objeto{
    
    public Pocion(int idObjeto) {
        super(idObjeto, "Pocion", "POCION", 20);
    }

    @Override
    public void usarObjeto(Pookemon pookemon, int id) {
        int vidaMaximaPookemon = pookemon.getEstadisticaPookemon().getVidaMaxima();
        int vidaTotal = pookemon.getEstadisticaPookemon().getVida() + getPuntosR();
        
        if(vidaTotal >= vidaMaximaPookemon){
            pookemon.getEstadisticaPookemon().setVida(vidaMaximaPookemon);
        }else{
            pookemon.getEstadisticaPookemon().setVida(vidaTotal);
        }
        System.out.println("Se ha recuperado vida");
    }
    
}
