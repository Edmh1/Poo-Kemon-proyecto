package main.java.com.pml.appPookemon.datos.conf_arena.model;

import java.io.Serializable;

public class Recompensa implements Serializable {
    private String nombre;
    private String descripcion;
    private String fechaVencimiento;


    public Recompensa(String nombre, String descripcion, String fechadevencimiento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaVencimiento = fechadevencimiento;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public String getFechaVencimiento() {
        return fechaVencimiento;
    } 

    public String getNombre(){
        return nombre;
    }

    private int generarCodigoAleatorio(){
        int aleatorio = (int) (Math.random() * 1000000);
        return aleatorio;
        
    }
    public int getCodigo(){
        return generarCodigoAleatorio();
    }


         
        


}
