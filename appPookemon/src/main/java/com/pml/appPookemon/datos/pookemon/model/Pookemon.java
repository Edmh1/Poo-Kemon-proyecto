package main.java.com.pml.appPookemon.datos.pookemon.model;

import main.java.com.pml.appPookemon.datos.pookemon.model.Movimiento;
import main.java.com.pml.appPookemon.datos.pookemon.model.Estadistica;
import java.util.ArrayList;
import java.util.List;
import main.java.com.pml.appPookemon.datos.pookemon.Efecto;

public class Pookemon {
    private int idPookemon;
    private String nombrePookemon;
    private String elementoPookemon;
    private Estadistica estadisticaPookemon;
    private List<Movimiento> movimientos;
    private Efecto efecto;
    private boolean defendiendo;

    public Pookemon(int idPookemon, String nombre, String elemento, Efecto efecto) {
        this.idPookemon = idPookemon;
        this.nombrePookemon = nombre;
        this.elementoPookemon = elemento;
        this.movimientos = new ArrayList<>();
        this.efecto = efecto;
    }

    @Override
    public String toString() {
        return "Pookemon{" + "idPookemon=" + idPookemon + ", nombre=" + nombrePookemon + ", elemento=" + elementoPookemon + ", estadistica=" + estadisticaPookemon + ", movimientos=" + movimientos + ", efecto=" + efecto + '}';
    }
    
    public void inicializarEstadistica(int salud, int ataque, int defensa, int velocidad, int ataqueEspecial, int defensaEspecial) {
        this.estadisticaPookemon = new Estadistica(salud, ataque, defensa, velocidad, ataqueEspecial, defensaEspecial);
    }
    
    /**
     * @param movimientos the movimientos to set
     */
    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
    
    public void activarDefensa(){
        this.defendiendo = true;
    }

    public void desactivarDefensa(){
        this.defendiendo = false;
    }
    
    public void afectarHp(int x){
        if(isDefendiendo()){
            x /= 1.5;
        }
        int vida = estadisticaPookemon.getVida();
        vida -= x;
        if (vida < 0) 
            vida = 0;
        estadisticaPookemon.setVida(vida);
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
     * @return the nombrePookemon
     */
    public String getNombrePookemon() {
        return nombrePookemon;
    }

    /**
     * @param nombrePookemon the nombrePookemon to set
     */
    public void setNombrePookemon(String nombrePookemon) {
        this.nombrePookemon = nombrePookemon;
    }

    /**
     * @return the elementoPookemon
     */
    public String getElementoPookemon() {
        return elementoPookemon;
    }

    /**
     * @param elementoPookemon the elementoPookemon to set
     */
    public void setElementoPookemon(String elementoPookemon) {
        this.elementoPookemon = elementoPookemon;
    }

    /**
     * @return the estadisticaPookemon
     */
    public Estadistica getEstadisticaPookemon() {
        return estadisticaPookemon;
    }

    /**
     * @param estadisticaPookemon the estadisticaPookemon to set
     */
    public void setEstadisticaPookemon(Estadistica estadisticaPookemon) {
        this.estadisticaPookemon = estadisticaPookemon;
    }

    /**
     * @return the movimientos
     */
    public List<Movimiento> getMovimientos() {
        return movimientos;
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
