package main.java.com.pml.appPookemon.datos.torneo.model;

import java.io.Serializable;

public class Recompensa implements Serializable {
    private int idRecompensa;
    private String nombre;
    private String descripcion;
    private String fechaVencimiento;

    @Override
    public String toString() {
        return "Recompensa [id=" + idRecompensa + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fechadevencimiento="
                + fechaVencimiento + "]";
    }

    public Recompensa(String nombre, String descripcion, String fechadevencimiento) {
        
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaVencimiento = fechadevencimiento;
    }
    
    public int getIdRecompensa() {
        idRecompensa =getCodigo();
        return idRecompensa;
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
