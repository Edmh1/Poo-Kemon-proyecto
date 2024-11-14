package main.java.com.pml.appPookemon.datos.pookemon.model;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


public abstract class Movimiento implements Serializable {
    private int idMovimiento;
    private String nombreMovimiento;
    private String descripcionMovimiento;
    private int potencia;
    private int precision;
    private int cantidadPP;
    private int cantidadMaximaPP;
    private String elemento;
    private Efecto efecto;
   
    private final double muyEfectivo = 2.0;
    private final double pocoEfectivo = 0.5;
    private final double noEfectivo = 0.0;
    
    private Map<String, Map<String, Double>> tablaEfectividad;

    public Movimiento(int idMovimiento, String nombre, int potencia, int precision, int cantidadPP, String elemento, Efecto efecto) {
        this.idMovimiento = idMovimiento;
        this.nombreMovimiento = nombre;
        this.potencia = potencia;
        this.precision = precision;
        this.cantidadPP = cantidadPP;
        this.elemento = elemento;
        this.efecto = efecto;
        this.cantidadMaximaPP = cantidadPP;
        inicializarTablaEfectividad();
    }

    protected abstract int calcularDañoBase(Pookemon atacante, Pookemon defensor);

    private double calcularGolpeCritico() {
        if(Math.random() < 0.05){
            System.out.println("¡Golpe crítico!");
            return 1.5;
        }
        return 1;
    }
    
    private double calcularEfectividad(Pookemon defensor) {
        String elementoDefensor = defensor.getElementoPookemon();
        String elementoMovimiento = getElemento();
        
        if (tablaEfectividad.containsKey(elementoMovimiento)) {
            Map<String, Double> efectividadContraOtros = tablaEfectividad.get(elementoMovimiento);
            if (efectividadContraOtros.containsKey(elementoDefensor)) {
                return efectividadContraOtros.get(elementoDefensor);
            }
        }
        return 1.0;
    }

    private double calcularAumentoPorAfinidadDeElemento(Pookemon atacante){
        String elementoAtacante = atacante.getElementoPookemon();
        String elementoMovimiento = getElemento();
        if(elementoMovimiento.equals(elementoAtacante)){
            return 1.5;
        } else {
            return 1.0;
        }
    }
   
    public int calcularDañoTotal(Pookemon atacante, Pookemon defensor) {
        double efectividad = calcularEfectividad(defensor);
        double bonificacion = calcularAumentoPorAfinidadDeElemento(atacante);
        int dañoBase = calcularDañoBase(atacante, defensor);
        return (int) (bonificacion*efectividad*dañoBase*calcularGolpeCritico());
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
            if(defensor.isDefendiendo()){
                daño = (int) (daño - (daño*0.3f));
            }
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
    
    public int getCantidadMaximaPPs(){
        return cantidadMaximaPP;
    }

    private void inicializarTablaEfectividad() {
        tablaEfectividad = new HashMap<>();

        // Efectividad del elemento "fuego"
        Map<String, Double> fuegoEfectividad = new HashMap<>();
        fuegoEfectividad.put("fuego", pocoEfectivo);  // Fuego es menos efectivo contra sí mismo
        fuegoEfectividad.put("agua", pocoEfectivo);   // Fuego es menos efectivo contra agua
        fuegoEfectividad.put("planta", muyEfectivo); // Fuego es más efectivo contra planta
        fuegoEfectividad.put("roca", pocoEfectivo); // Fuego es menos efectivo contra roca
        fuegoEfectividad.put("bicho", muyEfectivo); // Fuego es más efectivo contra bicho
        fuegoEfectividad.put("hielo", muyEfectivo); // Fuego es más efectivo contra hielo
        fuegoEfectividad.put("dragon", pocoEfectivo); // Fuego es menos efectivo contra dragon
        fuegoEfectividad.put("acero", muyEfectivo); // Fuego es más efectivo contra acero
        tablaEfectividad.put("fuego", fuegoEfectividad);

        // Efectividad del elemento "agua"
        Map<String, Double> aguaEfectividad = new HashMap<>();
        aguaEfectividad.put("fuego", muyEfectivo);   // Agua es más efectiva contra fuego
        aguaEfectividad.put("agua", pocoEfectivo);    // Agua es menos efectiva contra sí misma
        aguaEfectividad.put("planta", pocoEfectivo);  // Agua es menos efectiva contra planta
        aguaEfectividad.put("tierra", muyEfectivo); // Agua es más efectiva contra tierra
        aguaEfectividad.put("roca", muyEfectivo); // Agua es más efectiva contra roca
        aguaEfectividad.put("dragon", pocoEfectivo); // Agua es menos efectiva contra dragon
        tablaEfectividad.put("agua", aguaEfectividad);

        // Efectividad del elemento "planta"
        Map<String, Double> plantaEfectividad = new HashMap<>();
        plantaEfectividad.put("fuego", pocoEfectivo); // Planta es menos efectiva contra fuego
        plantaEfectividad.put("agua", muyEfectivo);  // Planta es más efectiva contra agua
        plantaEfectividad.put("planta", pocoEfectivo); // Planta es menos efectiva contra sí misma
        plantaEfectividad.put("volador", pocoEfectivo); // Planta es menos efectiva contra volador
        plantaEfectividad.put("tierra", muyEfectivo); // Planta es más efectiva contra tierra
        plantaEfectividad.put("roca", muyEfectivo); // Planta es más efectiva contra roca
        plantaEfectividad.put("bicho", pocoEfectivo); // Planta es menos efectiva contra bicho
        plantaEfectividad.put("veneno", pocoEfectivo); // Planta es menos efectiva contra veneno
        plantaEfectividad.put("dragon", pocoEfectivo); // Planta es menos efectiva contra dragon
        plantaEfectividad.put("acero", pocoEfectivo); // Planta es menos efectiva contra acero
        tablaEfectividad.put("planta", plantaEfectividad);
        
        // Efectividad del elemento "electrico"
        Map<String, Double> electricoEfectividad = new HashMap<>();
        electricoEfectividad.put("agua", muyEfectivo); // Electrico es mas efectivo contra agua
        electricoEfectividad.put("planta", pocoEfectivo); // Electrico es menos efectivo contra planta
        electricoEfectividad.put("electrico", pocoEfectivo); // Electrico es menos efectivo contra sí mismo
        electricoEfectividad.put("volador", muyEfectivo); // Electrico es mas efectivo contra volador
        electricoEfectividad.put("tierra", noEfectivo); // Electrico es no efectivo contra tierra
        electricoEfectividad.put("dragon", pocoEfectivo); // Electrico es menos efectivo contra dragon
        tablaEfectividad.put("electrico", electricoEfectividad);
        
        // Efectividad del elemento "volador"
        Map<String, Double> voladorEfectividad = new HashMap<>();
        voladorEfectividad.put("planta", muyEfectivo); // Volador es mas efectivo contra planta
        voladorEfectividad.put("electrico", pocoEfectivo); // Volador es menos efectivo contra electrico
        voladorEfectividad.put("roca", pocoEfectivo); // Volador es menos efectivo contra roca
        voladorEfectividad.put("bicho", muyEfectivo); // Volador es mas efectivo contra bicho
        voladorEfectividad.put("lucha", muyEfectivo); // Volador es mas efectivo contra lucha
        voladorEfectividad.put("acero", pocoEfectivo); // Volador es menos efectivo contra acero
        tablaEfectividad.put("volador", voladorEfectividad);
        
        // Efectividad del elemento "tierra"
        Map<String, Double> tierraEfectividad = new HashMap<>();
        tierraEfectividad.put("fuego", muyEfectivo); // Tierra es mas efectivo contra fuego
        tierraEfectividad.put("planta", pocoEfectivo); // Tierra es menos efectivo contra planta
        tierraEfectividad.put("electrico", muyEfectivo); // Tierra es mas efectivo contra electrico
        tierraEfectividad.put("volador", noEfectivo); // Tierra es no efectivo contra volador
        tierraEfectividad.put("roca", muyEfectivo); // Tierra es mas efectivo contra roca
        tierraEfectividad.put("bicho", pocoEfectivo); // Tierra es menos efectivo contra bicho
        tierraEfectividad.put("acero", muyEfectivo); // Tierra es mas efectivo contra acero
        tablaEfectividad.put("tierra", tierraEfectividad);
        
        // Efectividad del elemento "normal"
        Map<String, Double> normalEfectividad = new HashMap<>();
        normalEfectividad.put("roca", pocoEfectivo); // Normal es menos efectivo contra roca
        normalEfectividad.put("fantasma", noEfectivo); // Normal es no efectivo contra fantasma
        normalEfectividad.put("acero", pocoEfectivo); // Normal es menos efectivo contra acero
        tablaEfectividad.put("normal", normalEfectividad); 
        
        // Efectividad del elemento "roca"
        Map<String, Double> rocaEfectividad = new HashMap<>();
        rocaEfectividad.put("fuego", muyEfectivo); // Roca es mas efectivo contra fuego
        rocaEfectividad.put("volador", muyEfectivo); // Roca es mas efectivo contra volador
        rocaEfectividad.put("tierra", pocoEfectivo); // Roca es menos efectivo contra tierra
        rocaEfectividad.put("bicho", muyEfectivo); // Roca es mas efectivo contra bicho
        rocaEfectividad.put("lucha", pocoEfectivo); // Roca es menos efectivo contra lucha
        rocaEfectividad.put("hielo", muyEfectivo); // Roca es mas efectivo contra hielo
        rocaEfectividad.put("acero", pocoEfectivo); // Roca es menos efectivo contra acero
        tablaEfectividad.put("roca", rocaEfectividad);
        
        // Efectividad del elemento "bicho"
        Map<String, Double> bichoEfectividad = new HashMap<>();
        bichoEfectividad.put("fuego", pocoEfectivo); // Bicho es menos efectivo contra fuego
        bichoEfectividad.put("planta", muyEfectivo); // Bicho es mas efectivo contra planta
        bichoEfectividad.put("volador", pocoEfectivo); // Bicho es menos efectivo contra volador
        bichoEfectividad.put("veneno", pocoEfectivo); // Bicho es menos efectivo contra veneno
        bichoEfectividad.put("psiquico", muyEfectivo); // Bicho es mas efectivo contra psiquico
        bichoEfectividad.put("lucha", pocoEfectivo); // Bicho es menos efectivo contra lucha
        bichoEfectividad.put("fantasma", pocoEfectivo); // Bicho es menos efectivo contra fantasma
        bichoEfectividad.put("siniestro", muyEfectivo); // Bicho es mas efectivo contra siniestro
        bichoEfectividad.put("hada", pocoEfectivo); // Bicho es menos efectivo contra hada
        bichoEfectividad.put("acero", pocoEfectivo); // Bicho es menos efectivo contra acero
        tablaEfectividad.put("bicho", bichoEfectividad);
                
        // Efectividad del elemento "veneno"
        Map<String, Double> venenoEfectividad = new HashMap<>();
        venenoEfectividad.put("planta", muyEfectivo); // Veneno es mas efectivo contra planta
        venenoEfectividad.put("tierra", pocoEfectivo); // Veneno es menos efectivo contra tierra
        venenoEfectividad.put("roca", pocoEfectivo); // Veneno es menos efectivo contra roca
        venenoEfectividad.put("veneno", pocoEfectivo); // Veneno es menos efectivo contra sí mismo
        venenoEfectividad.put("fantasma", pocoEfectivo); // Veneno es menos efectivo contra fantasma
        venenoEfectividad.put("hada", muyEfectivo); // Veneno es mas efectivo contra hada
        venenoEfectividad.put("acero", noEfectivo); // Veneno es no efectivo contra acero
        tablaEfectividad.put("veneno", venenoEfectividad);
        
        // Efectividad del elemento "psiquico"
        Map<String, Double> psiquicoEfectividad = new HashMap<>();
        psiquicoEfectividad.put("psiquico", pocoEfectivo); //Psiquico es menos efectivo contra sí mismo
        psiquicoEfectividad.put("veneno", muyEfectivo); //Psiquico es mas efectivo contra veneno
        psiquicoEfectividad.put("lucha", muyEfectivo); //Psiquico es mas efectivo contra lucha
        psiquicoEfectividad.put("siniestro", noEfectivo); //Psiquico es no efectivo contra siniestro
        psiquicoEfectividad.put("acero", pocoEfectivo); //Psiquico es menos efectivo contra acero
        tablaEfectividad.put("psiquico", psiquicoEfectividad);
        
        // Efectividad del elemento "lucha"
        Map<String, Double> luchaEfectividad = new HashMap<>();
        luchaEfectividad.put("volador", pocoEfectivo); //Lucha es menos efectivo contra volador
        luchaEfectividad.put("normal", muyEfectivo); //Lucha es mas efectivo contra normal
        luchaEfectividad.put("roca", muyEfectivo); //Lucha es mas efectivo contra roca
        luchaEfectividad.put("bicho", pocoEfectivo); //Lucha es menos efectivo contra bicho
        luchaEfectividad.put("veneno", pocoEfectivo); //Lucha es menos efectivo contra veneno
        luchaEfectividad.put("psiquico", pocoEfectivo); //Lucha es menos efectivo contra psiquico
        luchaEfectividad.put("fantasma", noEfectivo); //Lucha es no efectivo contra fantasma
        luchaEfectividad.put("siniestro", muyEfectivo); //Lucha es mas efectivo contra siniestro
        luchaEfectividad.put("hielo", muyEfectivo); //Lucha es mas efectivo contra hielo
        luchaEfectividad.put("hada", pocoEfectivo); //Lucha es menos efectivo contra hada
        luchaEfectividad.put("acero", muyEfectivo); //Lucha es mas efectivo contra acero
        tablaEfectividad.put("lucha", luchaEfectividad);
        
        // Efectividad del elemento "fantasma"
        Map<String, Double> fantasmaEfectividad = new HashMap<>();
        fantasmaEfectividad.put("normal", noEfectivo); //Fantasma es no efectivo contra normal
        fantasmaEfectividad.put("psiquico", muyEfectivo); //Fantasma es mas efectivo contra psiquico
        fantasmaEfectividad.put("fantasma", muyEfectivo); //Fantasma es mas efectivo contra sí mismo
        fantasmaEfectividad.put("siniestro", pocoEfectivo); //Fantasma es menos efectivo contra siniestro
        tablaEfectividad.put("fantasma", fantasmaEfectividad);
        
        // Efectividad del elemento "siniestro"
        Map<String, Double> siniestroEfectividad = new HashMap<>();
        siniestroEfectividad.put("psiquico", muyEfectivo); //Siniestro es mas efectivo contra psiquico
        siniestroEfectividad.put("lucha", pocoEfectivo); //Siniestro es menos efectivo contra lucha
        siniestroEfectividad.put("fantasma", muyEfectivo); //Siniestro es mas efectivo contra fantasma
        siniestroEfectividad.put("siniestro", pocoEfectivo); //Siniestro es menos efectivo contra sí mismo
        siniestroEfectividad.put("hada", pocoEfectivo); //Siniestro es menos efectivo contra hada
        tablaEfectividad.put("siniestro", siniestroEfectividad);
        
        // Efectividad del elemento "hielo"
        Map<String, Double> hieloEfectividad = new HashMap<>();
        hieloEfectividad.put("fuego", pocoEfectivo); //Hielo es menos efectivo contra fuego
        hieloEfectividad.put("agua", pocoEfectivo); //Hielo es menos efectivo contra agua
        hieloEfectividad.put("planta", muyEfectivo); //Hielo es mas efectivo contra planta
        hieloEfectividad.put("volador", muyEfectivo); //Hielo es mas efectivo contra volador
        hieloEfectividad.put("tierra", muyEfectivo); //Hielo es mas efectivo contra tierra
        hieloEfectividad.put("hielo", pocoEfectivo); //Hielo es menos efectivo contra sí mismo
        hieloEfectividad.put("dragon", muyEfectivo); //Hielo es mas efectivo contra dragon
        hieloEfectividad.put("acero", pocoEfectivo); //Hielo es menos efectivo contra acero
        tablaEfectividad.put("hielo", hieloEfectividad);
        
        // Efectividad del elemento "dragon"
        Map<String, Double> dragonEfectividad = new HashMap<>();
        dragonEfectividad.put("dragon", muyEfectivo); //Dragon es mas efectivo contra sí mismo
        dragonEfectividad.put("hada", noEfectivo); //Dragon es no efectivo contra hada
        dragonEfectividad.put("acero", pocoEfectivo); //Dragon es menos efectivo contra acero
        tablaEfectividad.put("dragon", dragonEfectividad);
        
        // Efectividad del elemento "hada"
        Map<String, Double> hadaEfectividad = new HashMap<>();
        hadaEfectividad.put("fuego", pocoEfectivo); //Hada es menos efectivo contra fuego
        hadaEfectividad.put("veneno", pocoEfectivo); //Hada es menos efectivo contra veneno
        hadaEfectividad.put("lucha", muyEfectivo); //Hada es mas efectivo contra lucha
        hadaEfectividad.put("siniestro", muyEfectivo); //Hada es mas efectivo contra siniestro
        hadaEfectividad.put("dragon", muyEfectivo); //Hada es mas efectivo contra dragon
        hadaEfectividad.put("acero", pocoEfectivo); //Hada es menos efectivo contra acero
        tablaEfectividad.put("hada", hadaEfectividad);
        
        // Efectividad del elemento "acero"
        Map<String, Double> aceroEfectividad = new HashMap<>();
        aceroEfectividad.put("fuego", pocoEfectivo); //Acero es menos efectivo contra fuego
        aceroEfectividad.put("agua", pocoEfectivo); //Acero es menos efectivo contra agua
        aceroEfectividad.put("electrico", pocoEfectivo); //Acero es menos efectivo contra electrico
        aceroEfectividad.put("roca", muyEfectivo); //Acero es mas efectivo contra roca
        aceroEfectividad.put("hielo", muyEfectivo); //Acero es mas efectivo contra hielo
        aceroEfectividad.put("hada", muyEfectivo); //Acero es mas efectivo contra hada
        aceroEfectividad.put("acero", pocoEfectivo); //Acero es menos efectivo contra sí mismo
        tablaEfectividad.put("acero", aceroEfectividad);

    }    

    /**
     * @return the tipoMovimiento
     */
    public abstract String getTipoMovimiento();
    
      
}
