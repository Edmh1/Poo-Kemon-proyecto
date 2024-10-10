package main.java.com.pml.appPookemon.datos.torneo;

import main.java.com.pml.appPookemon.datos.registro.Entrenador;
import java.util.ArrayList;

public class Batalla {
    private int id;
    private Entrenador entrenador1;
    private Entrenador entrenador2;
    private ArrayList<String> turnos = new ArrayList<>();
    private int numeroTurno;
    private Accion accionEntrenador1;
    private Accion accionEntrenador2;

    public Batalla(int id, Entrenador e, Entrenador e2){
        this.id = id;
        this.entrenador1 = e;
        this.entrenador2 = e2;
        numeroTurno = 0;
    }

    public String realizarTurno(){
        String resultado = "";
        //El entrenador 1 cambió de pookemon
        if(accionEntrenador1.getTipo() == TipoAccion.CAMBIAR_POKEMON){
            resultado += "El entrenador " + entrenador1.getNombreEntrenador() + " ha decidido cambiar de pookemon";
            entrenador1.cambiarPookemon((int)accionEntrenador1.getInfo());
            if(accionEntrenador2.getTipo() == TipoAccion.CAMBIAR_POKEMON){
                resultado += "El entrenador " + entrenador2.getNombreEntrenador() + " ha decidido cambiar de pookemon";
                entrenador2.cambiarPookemon((int)accionEntrenador2.getInfo());
            }
            if(accionEntrenador2.getTipo() == TipoAccion.ATACAR){
                resultado += entrenador2.getPookemonActual().getNombrePookemon() + " ha realizado el ataque " + entrenador2.getPookemonActual().obtenerMovimientoPorID(accionEntrenador2.id).getNombreMovimiento();
                entrenador2.atacar(accionEntrenador2.id, entrenador1.getPookemonActual());
            }
            return resultado;
        }
        //El entreandor 2 cambió de pookemon
        if(accionEntrenador2.getTipo() == TipoAccion.CAMBIAR_POKEMON){
            resultado += "El entrenador " + entrenador2.getNombreEntrenador() + " ha decidido cambiar de pookemon";
            entrenador2.cambiarPookemon((int)accionEntrenador2.getInfo());
            if(accionEntrenador1.getTipo() == TipoAccion.CAMBIAR_POKEMON){
                resultado += "El entrenador " + entrenador1.getNombreEntrenador() + " ha decidido cambiar de pookemon";
                entrenador1.cambiarPookemon((int)accionEntrenador1.getInfo());
            }
            if(accionEntrenador1.getTipo() == TipoAccion.ATACAR){
                resultado += entrenador1.getPookemonActual().getNombrePookemon() + " ha realizado el ataque " + entrenador1.getPookemonActual().obtenerMovimientoPorID(accionEntrenador2.id).getNombreMovimiento();
                entrenador1.atacar(accionEntrenador1.id, entrenador2.getPookemonActual());
            }
            return resultado;
        }

        //El entrenador 1 ataca pero el entrenador 2 se defiende
        if(accionEntrenador1.getTipo() == TipoAccion.ATACAR && accionEntrenador2.getTipo() == TipoAccion.DEFENDER){
            resultado += entrenador1.getPookemonActual().getNombrePookemon() + " ha realizado el ataque " + entrenador1.getPookemonActual().obtenerMovimientoPorID(accionEntrenador2.id).getNombreMovimiento() + " ,pero el pookemon contrario se ha defendido";
            entrenador2.getPookemonActual().activarDefensa();
            entrenador1.atacar(accionEntrenador1.id, entrenador2.getPookemonActual());
            return resultado;
        }
        //El entrenador 2 ataca pero el entrenador 1 se defiende
        if(accionEntrenador2.getTipo() == TipoAccion.ATACAR && accionEntrenador1.getTipo() == TipoAccion.DEFENDER){
            resultado += entrenador2.getPookemonActual().getNombrePookemon() + " ha realizado el ataque " + entrenador2.getPookemonActual().obtenerMovimientoPorID(accionEntrenador2.id).getNombreMovimiento() + " ,pero el pookemon contrario se ha defendido";
            entrenador1.getPookemonActual().activarDefensa();
            entrenador2.atacar(accionEntrenador2.id, entrenador1.getPookemonActual());
            return resultado;
        }

        //Ambos deciden atacar
        int velocidadPookemon1 = entrenador1.getPookemonActual().getEstadisticaPookemon().getVelocidad();
        int velocidadPookemon2 = entrenador2.getPookemonActual().getEstadisticaPookemon().getVelocidad();

        if(velocidadPookemon1 > velocidadPookemon2){
            resultado += entrenador1.getPookemonActual().getNombrePookemon() + " ha realizado el ataque " + entrenador1.getPookemonActual().obtenerMovimientoPorID(accionEntrenador2.id).getNombreMovimiento();
            entrenador1.atacar(accionEntrenador1.id, entrenador2.getPookemonActual());
            resultado += entrenador2.getPookemonActual().getNombrePookemon() + " ha realizado el ataque " + entrenador2.getPookemonActual().obtenerMovimientoPorID(accionEntrenador2.id).getNombreMovimiento();
            entrenador2.atacar(accionEntrenador2.id, entrenador1.getPookemonActual());
        }else if(velocidadPookemon1 == velocidadPookemon2){
            int randomNumber = (int) (Math.random()*2);
            if(randomNumber == 0){
                resultado += entrenador1.getPookemonActual().getNombrePookemon() + " ha realizado el ataque " + entrenador1.getPookemonActual().obtenerMovimientoPorID(accionEntrenador2.id).getNombreMovimiento();
                entrenador1.atacar(accionEntrenador1.id, entrenador2.getPookemonActual());
                resultado += entrenador2.getPookemonActual().getNombrePookemon() + " ha realizado el ataque " + entrenador2.getPookemonActual().obtenerMovimientoPorID(accionEntrenador2.id).getNombreMovimiento();
                entrenador2.atacar(accionEntrenador2.id, entrenador1.getPookemonActual());
            }else{
                resultado += entrenador2.getPookemonActual().getNombrePookemon() + " ha realizado el ataque " + entrenador2.getPookemonActual().obtenerMovimientoPorID(accionEntrenador2.id).getNombreMovimiento();
                entrenador2.atacar(accionEntrenador2.id, entrenador1.getPookemonActual());
                resultado += entrenador1.getPookemonActual().getNombrePookemon() + " ha realizado el ataque " + entrenador1.getPookemonActual().obtenerMovimientoPorID(accionEntrenador2.id).getNombreMovimiento();
                entrenador1.atacar(accionEntrenador1.id, entrenador2.getPookemonActual());
                
            }
        }else{
            resultado += entrenador2.getPookemonActual().getNombrePookemon() + " ha realizado el ataque " + entrenador2.getPookemonActual().obtenerMovimientoPorID(accionEntrenador2.id).getNombreMovimiento();
            entrenador2.atacar(accionEntrenador2.id, entrenador1.getPookemonActual());
            resultado += entrenador1.getPookemonActual().getNombrePookemon() + " ha realizado el ataque " + entrenador1.getPookemonActual().obtenerMovimientoPorID(accionEntrenador2.id).getNombreMovimiento();
            entrenador1.atacar(accionEntrenador1.id, entrenador2.getPookemonActual());
        }
        return resultado;
    }

}
