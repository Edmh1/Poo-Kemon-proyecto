/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.pml.appPookemon.datos.torneo.controller;
import main.java.com.pml.appPookemon.datos.torneo.model.Batalla;
import main.java.com.pml.appPookemon.datos.registro.model.*;
import main.java.com.pml.appPookemon.datos.torneo.model.Accion;
import main.java.com.pml.appPookemon.datos.torneo.model.TipoAccion;
/**
 *
 * @author sebac
 */
public class BatallaController {
    private Batalla batalla;

    public BatallaController(Batalla batalla) {
        this.batalla = batalla;
    }
    
    public Entrenador getEntrenador1(){
        return batalla.getEntrenador1();
    }
    
    public Entrenador getEntrenador2(){
        return batalla.getEntrenador2();
    }
    
    public void setAccionEntrenador(int jugador, String tipo, int id){
        Accion a = new Accion(TipoAccion.ATACAR, id) {
            @Override
            public Object getInfo() {
                return idAccion;
            }
        };
        switch (tipo) {
            case "ATACAR":
                if(jugador == 1){
                    batalla.setAccionEntrenador1(a);
                }else{
                    batalla.setAccionEntrenador2(a);
                }   break;
            case "DEFENDER":
                if(jugador == 1){
                    a.setTipoAccion(TipoAccion.DEFENDER);
                    batalla.setAccionEntrenador1(a);
                }else{
                    a.setTipoAccion(TipoAccion.DEFENDER);
                    batalla.setAccionEntrenador2(a);
                }   break;
            case "CAMBIO":
                if(jugador == 1){
                    a.setTipoAccion(TipoAccion.CAMBIAR_POKEMON);
                    batalla.setAccionEntrenador1(a);
                }else{
                    a.setTipoAccion(TipoAccion.CAMBIAR_POKEMON);
                    batalla.setAccionEntrenador2(a);
                }   break;
                
            case "OBJETO_VIDA":
                if(jugador == 1){
                    a.setTipoAccion(TipoAccion.OBJETO_VIDA);
                    batalla.setAccionEntrenador1(a);
                }else{
                    a.setTipoAccion(TipoAccion.OBJETO_VIDA);
                    batalla.setAccionEntrenador2(a);
                }   break;   
            case "OBJETO_PPS":
                if(jugador == 1){
                    a.setTipoAccion(TipoAccion.OBJETO_PPS);
                    batalla.setAccionEntrenador1(a);
                }else{
                    a.setTipoAccion(TipoAccion.OBJETO_PPS);
                    batalla.setAccionEntrenador2(a);
                }   break;
            default:
                break;
        }
    }
    
    public String realizarTurno(){
        return batalla.realizarTurno();
    }
    
    public String aplicarEfectos(){
        return batalla.aplicarEfectos();
    }
    
    public int chequearVidaPookemones(){
        return batalla.chequearVidaPookemones();
    }
    
    public int chequearGanador(){
        return batalla.chequearGanador();
    }
}
