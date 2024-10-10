package main.java.com.pml.appPookemon.datos.torneo;

public class Recompensa {
    private int idRecompensa;
    private String nombre;
    private String descripcion;
    private String fechaVencimiento;

    @Override
    public String toString() {
        return "Recompensa [id=" + idRecompensa + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fechadevencimiento="
                + fechaVencimiento + "]";
    }

    public Recompensa(int id, String nombre, String descripcion, String fechadevencimiento) {
        this.idRecompensa = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaVencimiento = fechadevencimiento;
    }
    
    public int getIdRecompensa() {
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
    
    //falta implementacion de generar el codigo que se mostrara por pantalla

}
