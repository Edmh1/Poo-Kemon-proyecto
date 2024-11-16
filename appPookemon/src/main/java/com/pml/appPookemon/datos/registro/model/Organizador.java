package main.java.com.pml.appPookemon.datos.registro.model;

import java.io.Serializable;
import main.java.com.pml.appPookemon.datos.pookemon.model.Movimiento;
import main.java.com.pml.appPookemon.datos.pookemon.model.Pookemon;
import main.java.com.pml.appPookemon.datos.conf_arena.model.ArenaConf;


public class Organizador implements Serializable {
    private String nomUsario;
    private String password;
    private ArenaConf arenaConf;
    
    public Organizador(String nombre, String password) {
        this.nomUsario = nombre;
        this.password = password;
        arenaConf = new ArenaConf();
    }
    
    public void agregarPookemon(Pookemon pookemon){
        arenaConf.addPookemon(pookemon);

    }
    
    //falta editar pokemon
    
    public void eliminarPookemon(String nombrePookemon ){
        arenaConf.eliminarPookemon(nombrePookemon);
    }

    
    public void agregarMovimiento(Movimiento mov){
        arenaConf.addMovimiento(mov);
    }
    
    //falta editar movimiento
    
    public void eliminarMovimiento(String nombreMovimiento){
        arenaConf.eliminarMovimiento(nombreMovimiento);
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
        System.out.println("🛠️ Andres Escobar - El Maestro de las Excepciones");
        System.out.println("🛠️ Vladimir Navarro - El Guardián del Sistema");
        System.out.println();
        System.out.println("✨ ¡Gracias por usar nuestro proyecto épico! ✨");
        System.out.println("***************************");
    }

    public boolean verficiarCont(String pass){
        return this.password.equals(pass);
    }
    
    public ArenaConf getArenaConf(){
        return arenaConf;
    }
    
    public void setArenaConf(ArenaConf a){
        this.arenaConf = a;
    }

    
}
