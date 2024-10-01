package main.java.com.pml.appPookemon.torneo;

public class Recompensa {
    private int id;
    private String nombre;
    private String descripcion;
    private String fechadevencimiento;

    @Override
    public String toString() {
        return "Recompensa [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fechadevencimiento="
                + fechadevencimiento + "]";
    }

    public Recompensa(int id, String nombre, String descripcion, String fechadevencimiento) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechadevencimiento = fechadevencimiento;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getFechadevencimiento() {
        return fechadevencimiento;
    } 

    public String getNombre(){
        return nombre;
    }

}
