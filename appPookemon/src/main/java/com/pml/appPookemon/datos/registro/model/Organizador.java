package main.java.com.pml.appPookemon.datos.registro;

import main.java.com.pml.appPookemon.datos.pookemon.Efecto;
import main.java.com.pml.appPookemon.datos.pookemon.model.Movimiento;
import main.java.com.pml.appPookemon.datos.pookemon.model.Pookemon;
import main.java.com.pml.appPookemon.datos.torneo.Torneo;
import java.util.ArrayList;

public class Organizador {
    private int idOrganizador;
    private Torneo torneoActual;
    private ArrayList<Torneo> torneos = new ArrayList<>();  
    private String password;

    public Organizador(int idOrganizador, String password) {
        this.idOrganizador = idOrganizador;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Organizador [idOrganizador=" + idOrganizador + "]";
    }
    
    public String mostrarTorneos(){
        String lis = "";
        for (Torneo torneo : torneos) {
            lis += torneo.toString() + "\n";
        } 
        return lis;
    }

    public void inscribirJugadorTorneo(Entrenador jugador, int idTorneo ){
        for (Torneo torneo : torneos) {
            if (torneo.getIdtorneo()==idTorneo) {
                torneo.addJugador(jugador);
                break;
            }         
        }
    }
    
    public Torneo torneoPorId(int id){
       
        for (Torneo torneo : torneos) {
            if (torneo.getIdtorneo()==id) {
                return torneo;
            }        
        }
        return null; 
        
    }
    
    public void agregarpookemon(Pookemon  pookemon ){
        torneoActual.addPookemon(pookemon);

    }
    
    public void editarPookemon(int idPookemon, String nombrePookemon, String nombreElemento,Efecto efect ){
        torneoActual.editarNombrePookemon(idPookemon, nombrePookemon);
        torneoActual.editarEfectoPookemon(idPookemon, efect);
        torneoActual.editarElementoPookemon(idPookemon, nombreElemento);
    
        
    }
    
    public void eliminarPookemon(int idPookemon ){
        torneoActual.eliminarPookemon(idPookemon);
    }

    public void agregarMovimiento(Movimiento mov){
        torneoActual.addMovimiento(mov);
    }
    
    
    //no se estan pasando los datos que deberian pasarse
    public void editarMovimiento(int idMov, String nombreMovimiento, int daño, int precision, int velocidad ){
        torneoActual.editarMovimiento(idMov, nombreMovimiento, null, daño, precision, velocidad, nombreMovimiento, null);
    }
    
    //falta el eliminar
    
    public Torneo crearTorneo(){
        torneos.add(new Torneo());
        torneoActual = torneos.get(torneos.size()-1);
        return torneoActual;
    }

    public boolean hayTorneo(){
        return torneos != null;
    }

    public boolean verficiarCont(String pass){
        return this.password.equals(pass);
    }

    public Torneo getTorneoActual(){
        return torneoActual;
    }
    
    /** Faltan estos metodos segun el diagrama de clases (definir)
     * + definirRecompensa(idTorneo : int, recompensa : str)
        + mostrarReporteBatalla(idTorneo : int, idBatalla : int)   
        + mostrarCreditos()
     */

}
