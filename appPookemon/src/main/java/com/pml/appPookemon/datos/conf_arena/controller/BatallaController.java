package main.java.com.pml.appPookemon.datos.conf_arena.controller;

import java.util.List;
import main.java.com.pml.appPookemon.datos.conf_arena.model.Batalla;
import main.java.com.pml.appPookemon.datos.registro.model.*;
import main.java.com.pml.appPookemon.datos.conf_arena.model.Accion;
import main.java.com.pml.appPookemon.datos.conf_arena.model.TipoAccion;
import main.java.com.pml.appPookemon.datos.pookemon.model.Pookemon;
/**
 *
 * @author sebac
 */
public class BatallaController {
    
    private Batalla batalla;

    public BatallaController() {
        this.batalla = new Batalla();
    }
    
    public Batalla getBatalla(){
        return batalla;
    }
    
    public Entrenador getEntrenador(int entrenador){
        if(entrenador == 1){
            return batalla.getEntrenador1();
        }else{
            return batalla.getEntrenador2();
        }
    }
    
    public void setEntrenador(int entrenador, Entrenador e){
        if(entrenador == 1){
            batalla.setEntrenador1(e);
        }else{
            batalla.setEntrenador2(e);
        }
    }

    public void setAccionEntrenador(int jugador, String tipo, int id) {
        Accion a = new Accion(TipoAccion.ATACAR, id) {
            @Override
            public Object getInfo() {
                return idAccion;
            }
        };
        
        switch (tipo) {
            case "ATACAR":
                if (jugador == 1) {
                    batalla.setAccionEntrenador1(a);
                } else {
                    batalla.setAccionEntrenador2(a);
                }
                break;
            case "DEFENDER":
                a.setTipoAccion(TipoAccion.DEFENDER);
                if (jugador == 1) {
                    batalla.setAccionEntrenador1(a);
                } else {
                    batalla.setAccionEntrenador2(a);
                }
                break;
            case "CAMBIO":
                a.setTipoAccion(TipoAccion.CAMBIAR_POKEMON);
                if (jugador == 1) {
                    batalla.setAccionEntrenador1(a);
                } else {
                    batalla.setAccionEntrenador2(a);
                }
                break;
            case "OBJETO_VIDA":
                a.setTipoAccion(TipoAccion.OBJETO_VIDA);
                if (jugador == 1) {
                    batalla.setAccionEntrenador1(a);
                } else {
                    batalla.setAccionEntrenador2(a);
                }
                break;
            case "OBJETO_PPS":
                a.setTipoAccion(TipoAccion.OBJETO_PPS);
                if (jugador == 1) {
                    batalla.setAccionEntrenador1(a);
                } else {
                    batalla.setAccionEntrenador2(a);
                }
                break;
            default:
                break;
        }
    }
    
    
    public String realizarTurno() {
        String resultado = batalla.realizarTurno();    
        return resultado;
    }

   
    public String aplicarEfectos() {
        String resultado = batalla.aplicarEfectos();   
        return resultado;
    }
}
