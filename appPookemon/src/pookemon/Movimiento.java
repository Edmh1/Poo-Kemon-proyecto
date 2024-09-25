package pookemon;

public class Movimiento {
    private int idMovimiento;
    private String descripcion;
    private int potencia;
    private int precision;
    private int cantidadPP;
    private String elemento;
    private Efecto efecto;

    public Movimiento(int idMovimiento, String descripcion, int potencia, int precision, int cantidadPP, String elemento, Efecto efecto) {
        this.idMovimiento = idMovimiento;
        this.descripcion = descripcion;
        this.potencia = potencia;
        this.precision = precision;
        this.cantidadPP = cantidadPP;
        this.elemento = elemento;
        this.efecto = efecto;
    }

    /**
     * @return the idMovimiento
     */
    public int getIdMovimiento() {
        return idMovimiento;
    }

    /**
     * @param idMovimiento the idMovimiento to set
     */
    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    /**
     * @return the precision
     */
    public int getPrecision() {
        return precision;
    }

    /**
     * @param precision the precision to set
     */
    public void setPrecision(int precision) {
        this.precision = precision;
    }

    /**
     * @return the cantidadPP
     */
    public int getCantidadPP() {
        return cantidadPP;
    }

    /**
     * @param cantidadPP the cantidadPP to set
     */
    public void setCantidadPP(int cantidadPP) {
        this.cantidadPP = cantidadPP;
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
