package main.java.com.pml.appPookemon.datos.registro.model;

import main.java.com.pml.appPookemon.datos.pookemon.model.Efecto;
import main.java.com.pml.appPookemon.datos.pookemon.model.Movimiento;
import main.java.com.pml.appPookemon.datos.pookemon.model.Pookemon;
import main.java.com.pml.appPookemon.datos.torneo.model.Torneo;
import java.util.ArrayList;

import main.java.com.pml.appPookemon.datos.torneo.model.Recompensa;

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
    
    public void editarMovimiento(  int idmov, String nombreMovimiento, int daño, int precision, int velocidad ){
        torneoActual.editarMovimiento(idmov, nombreMovimiento, nombreMovimiento, daño, precision, velocidad, nombreMovimiento, null);
    }

    public void eliminarMovimiento(  int idmov ){
        torneoActual.eliminarMovimiento(idmov);
    }

    public void  mostrarCreditos(){
        System.out.println("***************************");
        System.out.println("*     🌟🔴🔵 Pookemon 🌟🔴🔵     *");
        System.out.println("***************************");
        System.out.println("* 🎉 Créditos Especiales 🎉 *");
        System.out.println("*      Los Maestros       *");
        System.out.println("***************************");
        System.out.println();
        System.out.println("💻 Desarrollo y Construccion por:");
        System.out.println("🛠️ Eddie Manotas - El Conquistador de Bugs");
        System.out.println("🛠️ Arturo Velasquez - El Arquitecto del Código");
        System.out.println("🛠️ Sebastian Castro - El Guerrero del Backend");
        System.out.println("🛠️ Andres Escobar - El Maestro del Frontend");
        System.out.println("🛠️ Vladimir Navarro - El Guardián del Sistema");
        System.out.println();
        System.out.println("✨ ¡Gracias por usar nuestro proyecto épico! ✨");
        System.out.println("***************************");
    }



    
    
    public void editarMovimiento(int idMov, String nombreMovimiento, String descripcion,int daño, int precision, int velocidad, String nombreEfecto,Efecto efect ){
        torneoActual.editarMovimiento(idMov, nombreMovimiento, descripcion, daño, precision, velocidad,  nombreEfecto, efect);

    }
    
    
    
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
    //sujeto a cambios (quiza)
    public void asignarRecompesa(int idtorneo, Recompensa re){
        torneoActual.crearRecompensa(re);
    }
    
    /** Faltan estos metodos segun el diagrama de clases (definir)         
        + mostrarReporteBatalla(idTorneo : int, idBatalla : int)   
    **/
    
    public String mostrarReporteBatalla(int idTorneo_p, int idBatalla_p){
        for (Torneo t : torneos) {
            if(t.getIdtorneo() == idTorneo_p){
                return t.buscarBatalla(idBatalla_p).GenerarReporteBatalla();
            }
        }
        
        return "";
    }
     

}
