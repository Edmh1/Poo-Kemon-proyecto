/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.pml.appPookemon.datos.registro.controller;

import java.awt.Menu;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.java.com.pml.appPookemon.datos.conf_arena.model.ArenaConf;
import main.java.com.pml.appPookemon.datos.registro.model.Organizador;
import main.java.com.pml.appPookemon.persistencia.Serializar;

/**
 *
 * @author eddie
 */
public class OrganizadorController {
    
    private Organizador o;
    
    public OrganizadorController() {
        this.o = recuperar(); 
    }
    
    public void guardar (Organizador o){
        Serializar ser = new Serializar();
        try {
            ser.guardar(o);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"OJO no Guardo.......");
        }
    }
    
   public Organizador recuperar() {
        Serializar lec = new Serializar(); 
        String archivo = "organizador.obj"; 
        if (new File(archivo).exists()) {
            try {
                return lec.recuperar(archivo);
            } catch (IOException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, "Error al leer el archivo", ex);
                JOptionPane.showMessageDialog(null,"OJO no leyo.......");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, "Clase no encontrada al leer el archivo", ex);
                JOptionPane.showMessageDialog(null,"OJO no se que me estas pasando.......");
            }
        } else {
            Logger.getLogger(Menu.class.getName()).log(Level.WARNING, "El archivo no existe: " + archivo);
            JOptionPane.showMessageDialog(null,"OJO no existe.......");
        }

        return null;
    }
   
    public void setArena(ArenaConf a){
        o.setArenaConf(a);
        guardar(o);
    }
   
   public boolean admitir(String pass){
       return o.verficiarCont(pass);
   }

}
