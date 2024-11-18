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

    public String mostrarCreditos() {
        StringBuilder creditos = new StringBuilder();

        creditos.append("***************************\n");
        creditos.append("*     🌟🔴🔵 Pookemon 🌟🔴🔵     *\n");
        creditos.append("***************************\n");
        creditos.append("* 🎉 Créditos Especiales: 🎉 *\n");
        creditos.append("*      Carlos Henriquez       *\n");
        creditos.append("***************************\n");
        creditos.append("💻 Desarrollo y Construccion por:\n");
        creditos.append("\n");
        creditos.append("🛠️ Eddie Manotas - El Conquistador de Bugs\n");
        creditos.append("🛠️ Arturo Velasquez - El Mago del Código\n");
        creditos.append("🛠️ Sebastian Castro - El Guerrero de las Mil Batallas\n");
        creditos.append("🛠️ Andres Escobar - El Maestro de las Excepciones\n");
        creditos.append("🛠️ Vladimir Navarro - El Guardián del Sistema\n");
        creditos.append("\n");
        creditos.append("✨ ¡Gracias por usar nuestro épico proyecto! ✨\n");
        creditos.append("***************************\n");

        return creditos.toString();
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
