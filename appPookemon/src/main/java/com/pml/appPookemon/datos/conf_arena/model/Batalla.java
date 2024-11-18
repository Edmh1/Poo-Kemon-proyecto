package main.java.com.pml.appPookemon.datos.conf_arena.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import main.java.com.pml.appPookemon.datos.conf_arena.controller.ArenaController;
import main.java.com.pml.appPookemon.datos.pookemon.model.Pookemon;
import main.java.com.pml.appPookemon.datos.registro.model.Entrenador;

public class Batalla {
    private Entrenador entrenador1;
    private Entrenador entrenador2;
    private List<String> turnos = new ArrayList<>();
    private List<Pookemon> pookemones;
    private int numeroTurno;
    private Accion accionEntrenador1;
    private Accion accionEntrenador2;
    

    public Batalla(){
        numeroTurno = 0;
    }

    public String realizarTurno(){
        String resultado = "Turno" + (numeroTurno+1) + ": ";
        int idAccionEntrenador1 = accionEntrenador1.idAccion;
        int idAccionEntrenador2 = accionEntrenador2.idAccion;
        
        //El jugador 1 usa un obejto de vida
        if(accionEntrenador1.getTipoAccion() == TipoAccion.OBJETO_VIDA){
            resultado += "El entrenador " + entrenador1.getNombreEntrenador() + " ha usado una pocion";
            entrenador1.usarObjeto(0);
            //El jugador 2 usa un objeto vida
            if(accionEntrenador2.getTipoAccion() == TipoAccion.OBJETO_VIDA){
                resultado += "El entrenador " + entrenador2.getNombreEntrenador() + " ha usado una pocion";
                entrenador2.usarObjeto(0);
                actualizarTurno(resultado);
                return resultado+ "\n";
            }
            //El jugador 2 usa un objeto PPs
            if(accionEntrenador2.getTipoAccion() == TipoAccion.OBJETO_PPS){
                resultado += "El entrenador " + entrenador2.getNombreEntrenador() + " ha usado un recupera pps";
                entrenador2.usarObjeto(1, idAccionEntrenador2);
                actualizarTurno(resultado);
                return resultado+ "\n";
            }
            
            //El jugador 2 ataca
            if(accionEntrenador2.getTipoAccion() == TipoAccion.ATACAR){
                atacar(entrenador2, entrenador1, idAccionEntrenador2);
                resultado += logAtacar(entrenador2, idAccionEntrenador2);
                actualizarTurno(resultado);
                return resultado+ "\n";
            }
            
            //El jugador 2 cambia de pookemon
            if(accionEntrenador2.getTipoAccion() == TipoAccion.CAMBIAR_POKEMON){
                resultado += "El entrenador " + entrenador2.getNombreEntrenador() + " ha decidido cambiar de pookemon";
                entrenador2.cambiarPookemon((idAccionEntrenador2));
                actualizarTurno(resultado);
                return resultado+ "\n";
            }
            
            
            //El jugador 2 se defiende
            if(accionEntrenador2.getTipoAccion() == TipoAccion.DEFENDER){
                resultado += "El entrenador " + entrenador2.getNombreEntrenador() + " se ha defendido";
                entrenador2.getPookemonActual().desactivarDefensa();
                return resultado+ "\n";
            }
        }
        
        //El jugador 2 usa un obejto de vida
        if(accionEntrenador2.getTipoAccion() == TipoAccion.OBJETO_VIDA){
            resultado += "El entrenador " + entrenador2.getNombreEntrenador() + " ha usado una pocion";
            entrenador2.usarObjeto(0);
            //El jugador 1 usa un objeto vida
            if(accionEntrenador1.getTipoAccion() == TipoAccion.OBJETO_VIDA){
                resultado += "El entrenador " + entrenador1.getNombreEntrenador() + " ha usado una pocion";
                entrenador1.usarObjeto(0);
                actualizarTurno(resultado);
                return resultado+ "\n";
            }
            //El jugador 1 usa un objeto PPs
            if(accionEntrenador1.getTipoAccion() == TipoAccion.OBJETO_PPS){
                resultado += "El entrenador " + entrenador1.getNombreEntrenador() + " ha usado un recupera pps";
                entrenador1.usarObjeto(1, idAccionEntrenador1);
                actualizarTurno(resultado);
                return resultado+ "\n";
            }
            
            //El jugador 1 ataca
            if(accionEntrenador1.getTipoAccion() == TipoAccion.ATACAR){
                atacar(entrenador1, entrenador2, idAccionEntrenador1);
                resultado += logAtacar(entrenador1, idAccionEntrenador1);
                actualizarTurno(resultado);
                return resultado+ "\n";
            }
            
            //El jugador 1 cambia de pookemon
            if(accionEntrenador1.getTipoAccion() == TipoAccion.CAMBIAR_POKEMON){
                resultado += "El entrenador " + entrenador1.getNombreEntrenador() + " ha decidido cambiar de pookemon";
                entrenador1.cambiarPookemon(idAccionEntrenador1);
                actualizarTurno(resultado);
                return resultado+ "\n";
            }
            
            //El jugador 1 se defiende
            if(accionEntrenador1.getTipoAccion() == TipoAccion.DEFENDER){
                resultado += "El entrenador " + entrenador1.getNombreEntrenador() + " se ha defendido";
                entrenador1.getPookemonActual().desactivarDefensa();
                actualizarTurno(resultado);
                return resultado+ "\n";
            }
        }
        
        //El jugador 1 usa un obejto de PPs
        if(accionEntrenador1.getTipoAccion() == TipoAccion.OBJETO_PPS){
            resultado += "El entrenador " + entrenador1.getNombreEntrenador() + " ha usado un recupera pps";
            entrenador1.usarObjeto(1, idAccionEntrenador1);
            //El jugador 2 usa un objeto vida
            if(accionEntrenador2.getTipoAccion() == TipoAccion.OBJETO_VIDA){
                resultado += "El entrenador " + entrenador2.getNombreEntrenador() + " ha usado una pocion";
                entrenador2.usarObjeto(0);
                actualizarTurno(resultado);
                return resultado+ "\n";
            }
            //El jugador 2 usa un objeto PPs
            if(accionEntrenador2.getTipoAccion() == TipoAccion.OBJETO_PPS){
                resultado += "El entrenador " + entrenador2.getNombreEntrenador() + " ha usado un recupera pps";
                entrenador2.usarObjeto(1, idAccionEntrenador2);
                actualizarTurno(resultado);
                return resultado+ "\n";
            }
            
            //El jugador 2 ataca
            if(accionEntrenador2.getTipoAccion() == TipoAccion.ATACAR){
                atacar(entrenador2, entrenador1, idAccionEntrenador2);
                resultado += logAtacar(entrenador2, idAccionEntrenador2);
                actualizarTurno(resultado);
                return resultado+ "\n";
            }
            
            //El jugador 2 cambia de pookemon
            if(accionEntrenador2.getTipoAccion() == TipoAccion.CAMBIAR_POKEMON){
                resultado += "El entrenador " + entrenador2.getNombreEntrenador() + " ha decidido cambiar de pookemon";
                entrenador2.cambiarPookemon((idAccionEntrenador2));
                actualizarTurno(resultado);
                return resultado+ "\n";
            }
            
            
            //El jugador 2 se defiende
            if(accionEntrenador2.getTipoAccion() == TipoAccion.DEFENDER){
                resultado += "El entrenador " + entrenador2.getNombreEntrenador() + " se ha defendido";
                entrenador2.getPookemonActual().desactivarDefensa();
                return resultado+ "\n";
            }
        }
        
        //El jugador 2 usa un obejto de PPs
        if(accionEntrenador2.getTipoAccion() == TipoAccion.OBJETO_PPS){
            resultado += "El entrenador " + entrenador2.getNombreEntrenador() + " ha usado un recupera pps " + "\n";
            entrenador2.usarObjeto(1, idAccionEntrenador2);
            //El jugador 1 usa un objeto vida
            if(accionEntrenador1.getTipoAccion() == TipoAccion.OBJETO_VIDA){
                resultado += "El entrenador " + entrenador1.getNombreEntrenador() + " ha usado una pocion";
                entrenador1.usarObjeto(0);
                actualizarTurno(resultado);
                return resultado+ "\n";
            }
            //El jugador 1 usa un objeto PPs
            if(accionEntrenador1.getTipoAccion() == TipoAccion.OBJETO_PPS){
                resultado += "El entrenador " + entrenador1.getNombreEntrenador() + " ha usado un recupera pps";
                entrenador1.usarObjeto(1, idAccionEntrenador1);
                actualizarTurno(resultado);
                return resultado+ "\n";
            }
            
            //El jugador 1 ataca
            if(accionEntrenador1.getTipoAccion() == TipoAccion.ATACAR){
                atacar(entrenador1, entrenador2, idAccionEntrenador1);
                resultado += logAtacar(entrenador1, idAccionEntrenador1);
                actualizarTurno(resultado);
                return resultado+ "\n";
            }
            
            //El jugador 1 cambia de pookemon
            if(accionEntrenador1.getTipoAccion() == TipoAccion.CAMBIAR_POKEMON){
                resultado += "El entrenador " + entrenador1.getNombreEntrenador() + " ha decidido cambiar de pookemon";
                entrenador1.cambiarPookemon(idAccionEntrenador1);
                actualizarTurno(resultado);
                return resultado+ "\n";
            }
            
            //El jugador 1 se defiende
            if(accionEntrenador1.getTipoAccion() == TipoAccion.DEFENDER){
                resultado += "El entrenador " + entrenador1.getNombreEntrenador() + " se ha defendido";
                entrenador1.getPookemonActual().desactivarDefensa();
                actualizarTurno(resultado);
                return resultado+ "\n";
            }
        }
        //El entrenador 1 cambió de pookemon
        if(accionEntrenador1.getTipoAccion() == TipoAccion.CAMBIAR_POKEMON){
            resultado += "El entrenador " + entrenador1.getNombreEntrenador() + " ha decidido cambiar de pookemon" + "\n";
            entrenador1.cambiarPookemon(idAccionEntrenador1);
            if(accionEntrenador2.getTipoAccion() == TipoAccion.CAMBIAR_POKEMON){
                resultado += "El entrenador " + entrenador2.getNombreEntrenador() + " ha decidido cambiar de pookemon" + "\n";
                entrenador2.cambiarPookemon((idAccionEntrenador2));
            }
            if(accionEntrenador2.getTipoAccion() == TipoAccion.ATACAR){
                atacar(entrenador2, entrenador1, idAccionEntrenador2);
                resultado += logAtacar(entrenador2, idAccionEntrenador2);
            }
            actualizarTurno(resultado);
            return resultado+ "\n";
        }
        //El entreandor 2 cambió de pookemon
        if(accionEntrenador2.getTipoAccion() == TipoAccion.CAMBIAR_POKEMON){
            resultado += "El entrenador " + entrenador2.getNombreEntrenador() + " ha decidido cambiar de pookemon" + "\n";
            entrenador2.cambiarPookemon(idAccionEntrenador2);
            if(accionEntrenador1.getTipoAccion() == TipoAccion.CAMBIAR_POKEMON){
                resultado += "El entrenador " + entrenador1.getNombreEntrenador() + " ha decidido cambiar de pookemon" + "\n";
                entrenador1.cambiarPookemon(idAccionEntrenador1);
            }
            if(accionEntrenador1.getTipoAccion() == TipoAccion.ATACAR){
                atacar(entrenador1, entrenador2, idAccionEntrenador1);
                resultado += logAtacar(entrenador1, idAccionEntrenador1);
            }
            actualizarTurno(resultado);
            return resultado+ "\n";
        }

        //El entrenador 1 ataca pero el entrenador 2 se defiende
        if(accionEntrenador1.getTipoAccion() == TipoAccion.ATACAR && accionEntrenador2.getTipoAccion() == TipoAccion.DEFENDER){ 
            int idAtaque = idAccionEntrenador1;
            entrenador2.defenderse();
            atacar(entrenador1, entrenador2, idAtaque);
            resultado += logAtacar(entrenador1, idAtaque);
            entrenador2.getPookemonActual().desactivarDefensa();
            actualizarTurno(resultado);
            return resultado+ "\n";
        }
        //El entrenador 2 ataca pero el entrenador 1 se defiende
        if(accionEntrenador2.getTipoAccion() == TipoAccion.ATACAR && accionEntrenador1.getTipoAccion() == TipoAccion.DEFENDER){
            int idAtaque = idAccionEntrenador2;
            entrenador1.defenderse();
            atacar(entrenador2, entrenador1, idAtaque);
            resultado += logAtacar(entrenador2,idAtaque);
            entrenador2.getPookemonActual().desactivarDefensa();
            actualizarTurno(resultado);
            return resultado+ "\n";
        }
        
        //Ambos deciden defender
        if(accionEntrenador2.getTipoAccion() == TipoAccion.DEFENDER && accionEntrenador1.getTipoAccion() == TipoAccion.DEFENDER){
            resultado += "Ambos deciden defenderse";
            entrenador2.getPookemonActual().desactivarDefensa();
            entrenador1.getPookemonActual().desactivarDefensa();
            return resultado + "\n";
        }

        //Ambos deciden atacar
        int velocidadPookemon1 = entrenador1.getPookemonActual().getEstadisticaPookemon().getVelocidad();
        int velocidadPookemon2 = entrenador2.getPookemonActual().getEstadisticaPookemon().getVelocidad();

        if(velocidadPookemon1 > velocidadPookemon2){
            resultado += logAtacar(entrenador1,idAccionEntrenador1);
            atacar(entrenador1, entrenador2, idAccionEntrenador1);
            resultado += logAtacar(entrenador2, idAccionEntrenador2);
            atacar(entrenador2, entrenador1, idAccionEntrenador2);
        }else if(velocidadPookemon1 == velocidadPookemon2){
            int randomNumber = (int) (Math.random()*2);
            if(randomNumber == 0){
                resultado += logAtacar(entrenador1,idAccionEntrenador1);
                atacar(entrenador1, entrenador2, idAccionEntrenador1);
                resultado += logAtacar(entrenador2, idAccionEntrenador2);
                atacar(entrenador2, entrenador1, idAccionEntrenador2);
            }else{
                resultado += logAtacar(entrenador2, idAccionEntrenador2);
                atacar(entrenador2, entrenador1, idAccionEntrenador2);
                resultado += logAtacar(entrenador1,idAccionEntrenador1);
                atacar(entrenador1, entrenador2, idAccionEntrenador1);
            }
        }else{
            resultado += logAtacar(entrenador2, idAccionEntrenador2);
            atacar(entrenador2, entrenador1, idAccionEntrenador2);
            resultado += logAtacar(entrenador1,idAccionEntrenador1);
            atacar(entrenador1, entrenador2, idAccionEntrenador1);
        }
        
        
        return resultado + "\n";
    }

    public String GenerarReporteBatalla(){
        String reporteBatalla = "";
        for(int i = 0; i < turnos.size(); i++){
            reporteBatalla+= turnos.get(i);
            reporteBatalla += "\n";
        }
        return reporteBatalla;
    }

    private void atacar(Entrenador atacante, Entrenador defensor, int id){
        atacante.atacar(id, defensor.getPookemonActual());
    }

    private String logAtacar(Entrenador atacante, int id){
        String nombrePookemon =  atacante.getPookemonActual().getNombrePookemon();
        String nombreAtaque = atacante.getPookemonActual().obtenerMovimientoPorID(id).getNombreMovimiento();
        return logAtaque(nombrePookemon, nombreAtaque);
    }

    private String logAtaque(String nombrePookemon, String nombreAtaque){
        return nombrePookemon + " ha realizado el ataque " + nombreAtaque + "\n";
    }
    
    public String aplicarEfectos(){
        String logEfectos = "";
        Pookemon pk1 = entrenador1.getPookemonActual();
        Pookemon pk2 = entrenador2.getPookemonActual();
        
        if(pk1.tieneEfecto()){
            logEfectos += pk1.aplicarEfecto() + "\n";
        }
        if(pk2.tieneEfecto()){
            logEfectos += pk2.aplicarEfecto() + "\n";
        }
        
        return logEfectos;
    }
    
    private void actualizarTurno(String resultado){
        if(resultado.equals("") == false){
            turnos.add((numeroTurno+1) + resultado);
            numeroTurno++;
        }
    }
    
    public boolean generarMazo(){
        Random random = new Random();
        ArenaController a = new ArenaController();
        List<Pookemon> auxiliar = a.getPookemones(); 
       
        if (auxiliar.size() < 6) {
            return false;  // Asegurarse de que hay suficientes Pookemones
        }
        
        for (int i = 0; i < 2; i++) {
            ArrayList<Pookemon> mazo = new ArrayList<>();
            boolean seguir = true;
            while(seguir){
                int azar = random.nextInt(auxiliar.size()); //conseguir un número al azar
                Pookemon iterable = auxiliar.get(azar); //obtengo del array de pookemones un objeto al azar
                if(!mazo.contains(iterable)){ //valido que el objeto no esté ya en mazo
                    mazo.add(iterable);
                    auxiliar.remove(iterable);
                    if(mazo.size() == 3){ //verifico si ya la lista está llena. En nuestro caso, cuando hayan 3 pookemones
                        if(i == 0){
                            entrenador1.setPookemones(mazo);
                        }else{
                            entrenador2.setPookemones(mazo);
                        }
                    
                        seguir = false;
                    }
                }
            }
        }
        
        return true;
                    
    }
    
    public int chequearVidaPookemones(){
        int vidaPk1 = entrenador1.getPookemonActual().getEstadisticaPookemon().getVida();
        int vidaPk2 = entrenador2.getPookemonActual().getEstadisticaPookemon().getVida();
        
        //Se murió el pookemon del entrenador 1
        if(vidaPk2 > 0 && vidaPk1 <= 0){
            return 1;
        //Se murió el pookemon del entrenador 2
        }else if(vidaPk1 > 0 && vidaPk2 <= 0){
            return 2;
        }
        
        return -1;
    }
    
    public int chequearGanador(){
        int pkEliminadosEntrenador1 = contarPookemonesEliminados(1);
        int pkEliminadosEntrenador2 = contarPookemonesEliminados(2);
        
        //Gano el entrenador 2
        if(pkEliminadosEntrenador1 == 3){
            return 2;
        }
        
        //Gano el entrenador 1
        if(pkEliminadosEntrenador2 == 3){
            return 1;
        }
        
        //No ha ganado nadie
        return -1;
    }
    
        private int contarPookemonesEliminados(int i) {
        List<Pookemon> lista = null;
        int nPookemones = 0;
        if(i == 1){
            lista = entrenador1.getPookemones();
        }else if(i == 2){
            lista = entrenador2.getPookemones();
        }
        
        if(lista != null){
            for (Pookemon pookemon : lista) {
                if(pookemon.getEstadisticaPookemon().getVida() == 0){
                    nPookemones++;
                }
            }
        }
        
        return nPookemones;
    }

    public Entrenador getEntrenador1() {
        return entrenador1;
    }

    public Entrenador getEntrenador2() {
        return entrenador2;
    }
    
    public void setEntrenador1(Entrenador accionEntrenador1) {
        this.entrenador1 = accionEntrenador1;
    }
    
    public void setEntrenador2(Entrenador accionEntrenador2) {
        this.entrenador2 = accionEntrenador2;
    }

    public void setAccionEntrenador1(Accion accionEntrenador1) {
        this.accionEntrenador1 = accionEntrenador1;
    }

    public void setAccionEntrenador2(Accion accionEntrenador2) {
        this.accionEntrenador2 = accionEntrenador2;
    }
    
}
