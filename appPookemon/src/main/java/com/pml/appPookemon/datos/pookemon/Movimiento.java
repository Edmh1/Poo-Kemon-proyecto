package main.java.com.pml.appPookemon.datos.pookemon;


public class Movimiento {
    private int idMovimiento;
    private String nombreMovimiento;
    private String descripcionMovimiento;
    private int potencia;
    private int precision;
    private int cantidadPP;
    private String elemento;
    private Efecto efecto;

    public Movimiento(int idMovimiento, String nombre, String descripcion, int potencia, int precision, int cantidadPP, String elemento, Efecto efecto) {
        this.idMovimiento = idMovimiento;
        this.nombreMovimiento = nombre;
        this.descripcionMovimiento = descripcion;
        this.potencia = potencia;
        this.precision = precision;
        this.cantidadPP = cantidadPP;
        this.elemento = elemento;
        this.efecto = efecto;
    }

    protected int calcularDañoBase(Pookemon atacante, Pookemon defensor) {
        return 0;
    }

    private double calcularGolpeCritico() {
        if(Math.random() < 0.05){
            System.out.println("¡Golpe crítico!");
            return 1.5;
        }
        return 1;
    }

    public int calcularDañoTotal(Pookemon atacante, Pookemon defensor) {
        int dañoBase = calcularDañoBase(atacante, defensor);
        return (int) (dañoBase*calcularGolpeCritico());
    }

    public void realizar(Pookemon atacante, Pookemon defensor) {
        if (cantidadPP > 0) {
            cantidadPP--;
        } else {
            System.out.println(atacante.getNombrePookemon() + " no tiene PP suficientes. Se usará HP en su lugar.");
            atacante.afectarHp(10);
        }

        if (precision > Math.random() * 100) {
            int daño = calcularDañoTotal(atacante, defensor);
            defensor.afectarHp(daño);
            System.out.println(atacante.getNombrePookemon() + " ha realizado " + nombreMovimiento + " y ha causado " + daño + " puntos de daño a " + defensor.getNombrePookemon());
            
        } else {
            System.out.println(atacante.getNombrePookemon() + " ha fallado el ataque.");
        }
    }
    
     @Override
    public String toString() {
        return "Movimiento{" + "idMovimiento=" + idMovimiento + ", nombre=" + nombreMovimiento + ", descripcion=" + descripcionMovimiento + ", potencia=" + potencia + ", precision=" + precision +"% " +", cantidadPP=" + cantidadPP + ", elemento=" + elemento + ", efecto=" + efecto + '}';
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
     * @return the descripcionMovimiento
     */
    public String getDescripcionMovimiento() {
        return descripcionMovimiento;
    }

    /**
     * @param descripcionMovimiento the descripcionMovimiento to set
     */
    public void setDescripcionMovimiento(String descripcionMovimiento) {
        this.descripcionMovimiento = descripcionMovimiento;
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

    /**
     * @return the nombreMovimiento
     */
    public String getNombreMovimiento() {
        return nombreMovimiento;
    }

    /**
     * @param nombreMovimiento the nombreMovimiento to set
     */
    public void setNombreMovimiento(String nombreMovimiento) {
        this.nombreMovimiento = nombreMovimiento;
    }
    
    
      
}
