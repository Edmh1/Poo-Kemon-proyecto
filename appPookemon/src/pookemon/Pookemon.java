package pookemon;

import java.util.ArrayList;
import java.util.List;

public class Pookemon {
    private int idPookemon;
    private String nombre;
    private String elemento;
    private Estadistica estadistica;
    private List<Movimiento> movimientos;
    private Efecto efecto;
    private boolean defendiendo;

    public Pookemon(int idPookemon, String nombre, String elemento, Efecto efecto) {
        this.idPookemon = idPookemon;
        this.nombre = nombre;
        this.elemento = elemento;
        this.movimientos = new ArrayList<>();
        this.efecto = efecto;
    }

    @Override
    public String toString() {
        return "Pookemon{" + "idPookemon=" + idPookemon + ", nombre=" + nombre + ", elemento=" + elemento + ", estadistica=" + estadistica + ", movimientos=" + movimientos + ", efecto=" + efecto + '}';
    }
    
    public void inicializarEstadistica(int salud, int ataque, int defensa, int velocidad, int ataqueEspecial, int defensaEspecial) {
        this.estadistica = new Estadistica(salud, ataque, defensa, velocidad, ataqueEspecial, defensaEspecial);
    }
    
    public void addMovimiento(Movimiento x){
        movimientos.add(x);
    }
    
    public void activarDefensa(){
        this.defendiendo = true;
    }
    
    public void afectarHp(int x){
        if(isDefendiendo()){
            x /= 1.5;
        }
        int vida = estadistica.getVida();
        vida -= x;
        if (vida < 0) 
            vida = 0;
        estadistica.setVida(vida);
        defendiendo = false;
    }
    
    public Movimiento obtenerMovimientoPorID(int id){
        for (Movimiento movimiento : movimientos) {
            if(movimiento.getIdMovimiento() == id)
                return movimiento;
        }
        return null;
    }
    

    /**
     * @return the defendiendo
     */
    public boolean isDefendiendo() {
        return defendiendo;
    }
    
    /**
     * @return the idPookemon
     */
    public int getIdPookemon() {
        return idPookemon;
    }

    /**
     * @param idPookemon the idPookemon to set
     */
    public void setIdPookemon(int idPookemon) {
        this.idPookemon = idPookemon;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the elemento
     */
    public String getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    /**
     * @return the estadistica
     */
    public Estadistica getEstadistica() {
        return estadistica;
    }

    /**
     * @param estadistica the estadistica to set
     */
    public void setEstadistica(Estadistica estadistica) {
        this.estadistica = estadistica;
    }

    /**
     * @return the movimientos
     */
    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    /**
     * @param movimientos the movimientos to set
     */
    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    /**
     * @return the efecto
     */
    public Efecto getEfecto() {
        return efecto;
    }

    /**
     * @param efecto the efecto to set
     */
    public void setEfecto(Efecto efecto) {
        this.efecto = efecto;
    }

    
    
}
