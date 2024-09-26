package pookemon;

public class Movimiento {
    private int idMovimiento;
    private String nombre;
    private String descripcion;
    private int potencia;
    private int precision;
    private int cantidadPP;
    private String elemento;
    private Efecto efecto;

    public Movimiento(int idMovimiento, String nombre, String descripcion, int potencia, int precision, int cantidadPP, String elemento, Efecto efecto) {
        this.idMovimiento = idMovimiento;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.potencia = potencia;
        this.precision = precision;
        this.cantidadPP = cantidadPP;
        this.elemento = elemento;
        this.efecto = efecto;
    }

    protected int calcularDañoBase(Pookemon atacante, Pookemon defensor) {
        return 0;
    }

    private boolean calcularGolpeCritico() {
        return Math.random() < 0.05;
    }

    public int calcularDañoTotal(Pookemon atacante, Pookemon defensor) {
        int dañoBase = calcularDañoBase(atacante, defensor);

        if (calcularGolpeCritico()) {
            System.out.println("¡Golpe crítico!");
            dañoBase *= 1.5;
        }
        return dañoBase;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "idMovimiento=" + idMovimiento + ", nombre=" + nombre + ", descripcion=" + descripcion + ", potencia=" + potencia + ", precision=" + precision +"% " +", cantidadPP=" + cantidadPP + ", elemento=" + elemento + ", efecto=" + efecto + '}';
    }

    public void realizar(Pookemon atacante, Pookemon defensor) {
        if (cantidadPP > 0) {
            cantidadPP--;
        } else {
            System.out.println(atacante.getNombre() + " no tiene PP suficientes. Se usará HP en su lugar.");
            atacante.afectarHp(10);
        }

        if (precision > Math.random() * 100) {
            int daño = calcularDañoTotal(atacante, defensor);
            defensor.afectarHp(daño);
            System.out.println(atacante.getNombre() + " ha realizado " + nombre + " y ha causado " + daño + " puntos de daño a " + defensor.getNombre());
            
        } else {
            System.out.println(atacante.getNombre() + " ha fallado el ataque.");
        }
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
    
    
      
}
