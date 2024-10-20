package main.java.com.pml.appPookemon.datos.torneo;


import java.util.ArrayList;
import java.util.Random;
import main.java.com.pml.appPookemon.datos.pookemon.model.Pookemon;
import main.java.com.pml.appPookemon.datos.registro.model.Entrenador;

public class Batalla {
    private int id;
    private Entrenador entrenador1;
    private Entrenador entrenador2;
    private ArrayList<String> turnos = new ArrayList<>();
    private int numeroTurno;
    private Accion accionEntrenador1;
    private Accion accionEntrenador2;
    private ArrayList<Pookemon> pookemones;

    public Batalla(int id, Entrenador e, Entrenador e2, ArrayList<Pookemon> pookemones){
        this.id = id;
        this.entrenador1 = e;
        this.entrenador2 = e2;
        this.pookemones = pookemones;
        numeroTurno = 0;
    }

    public String realizarTurno(){
        String resultado = "";
        int idAccionEntrenador1 = accionEntrenador1.idAccion;
        int idAccionEntrenador2 = accionEntrenador2.idAccion;
        //El entrenador 1 cambió de pookemon
        if(accionEntrenador1.getTipoAccion() == TipoAccion.CAMBIAR_POKEMON){
            resultado += "El entrenador " + entrenador1.getNombreEntrenador() + " ha decidido cambiar de pookemon";
            entrenador1.cambiarPookemon(idAccionEntrenador1);
            if(accionEntrenador2.getTipoAccion() == TipoAccion.CAMBIAR_POKEMON){
                resultado += "El entrenador " + entrenador2.getNombreEntrenador() + " ha decidido cambiar de pookemon";
                entrenador2.cambiarPookemon((idAccionEntrenador2));
            }
            if(accionEntrenador2.getTipoAccion() == TipoAccion.ATACAR){
                atacar(entrenador2, entrenador1, idAccionEntrenador2);
                resultado += logAtacar(entrenador2, idAccionEntrenador2);
            }
            return resultado;
        }
        //El entreandor 2 cambió de pookemon
        if(accionEntrenador2.getTipoAccion() == TipoAccion.CAMBIAR_POKEMON){
            resultado += "El entrenador " + entrenador2.getNombreEntrenador() + " ha decidido cambiar de pookemon";
            entrenador2.cambiarPookemon(idAccionEntrenador2);
            if(accionEntrenador1.getTipoAccion() == TipoAccion.CAMBIAR_POKEMON){
                resultado += "El entrenador " + entrenador1.getNombreEntrenador() + " ha decidido cambiar de pookemon";
                entrenador1.cambiarPookemon(idAccionEntrenador1);
            }
            if(accionEntrenador1.getTipoAccion() == TipoAccion.ATACAR){
                atacar(entrenador1, entrenador2, idAccionEntrenador1);
                resultado += logAtacar(entrenador1, idAccionEntrenador1);
            }
            return resultado;
        }

        //El entrenador 1 ataca pero el entrenador 2 se defiende
        if(accionEntrenador1.getTipoAccion() == TipoAccion.ATACAR && accionEntrenador2.getTipoAccion() == TipoAccion.DEFENDER){ 
            int idAtaque = idAccionEntrenador1;
            entrenador2.getPookemonActual().activarDefensa();
            atacar(entrenador1, entrenador2, idAtaque);
            resultado += logAtacar(entrenador1, idAtaque);
            return resultado;
        }
        //El entrenador 2 ataca pero el entrenador 1 se defiende
        if(accionEntrenador2.getTipoAccion() == TipoAccion.ATACAR && accionEntrenador1.getTipoAccion() == TipoAccion.DEFENDER){
            int idAtaque = idAccionEntrenador2;
            entrenador1.getPookemonActual().activarDefensa();
            atacar(entrenador2, entrenador1, idAtaque);
            resultado += logAtacar(entrenador2,idAtaque);
            return resultado;
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

        if(resultado.equals("") == false){
            turnos.add((numeroTurno+1) + resultado);
            numeroTurno++;
        }
        return resultado;
    }

    public void ActualizarLog(){
        //Aqui se actualiza el log del GUI
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
        return nombrePookemon + " ha realizado el ataque " + nombreAtaque;
    }

    public int getId() {
        return id;
    }
    
    public boolean generarMazo(){
        Random random = new Random();
        
        if (pookemones.size() < 6) {
            System.out.println("No hay suficientes Pookemones para crear el mazo.");
            return false;  // Asegurarse de que hay suficientes Pookemones
        }
        
        for (int i = 0; i < 2; i++) {
            ArrayList<Pookemon> mazo = new ArrayList<>();
            boolean seguir = true;
            while(seguir){
                int azar = random.nextInt(pookemones.size()); //conseguir un número al azar
                Pookemon iterable = pookemones.get(azar); //obtengo del array de pookemones un objeto al azar
                if(!mazo.contains(iterable)){ //valido que el objeto no esté ya en mazo
                    mazo.add(iterable);
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
}
