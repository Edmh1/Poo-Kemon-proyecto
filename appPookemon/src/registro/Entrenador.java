package registro;

import java.util.ArrayList;
import java.util.List;
import pookemon.Movimiento;
import pookemon.Objecto;
import pookemon.Pookemon;

public class Entrenador {
    
    private int idEntrenador;
    private String nombreEntrenador;
    private String generoEntrenador;
    private List<Pookemon> pookemones;
    private List<Objecto> objectos;
    private int pookemonActual;

    public Entrenador(int idEntrenador, String nombreEntrenador, String generoEntrenador) {
        this.idEntrenador = idEntrenador;
        this.nombreEntrenador = nombreEntrenador;
        this.generoEntrenador = generoEntrenador;
        this.pookemones = new ArrayList<>();
        this.objectos = new ArrayList<>();
        this.pookemonActual = 0;
    }
    
    public void defenderse() {
        Pookemon pookemon = pookemones.get(pookemonActual);
        pookemon.activarDefensa();
        System.out.println(pookemon.getNombre() + " se está defendiendo. El daño será reducido en este turno.");
    }

    public void atacar(int idMovimiento, Pookemon objetivo) {
        Pookemon pookemon = pookemones.get(pookemonActual);
        Movimiento movimiento = pookemon.obtenerMovimientoPorID(idMovimiento);
        if (movimiento != null) {
            System.out.println(nombreEntrenador + " ordena a " + pookemon.getNombre() + " usar " + movimiento.getNombre());
            movimiento.realizar(pookemon, objetivo);
        } else {
            System.out.println("Movimiento no encontrado.");
        }
    }

    public void usarObjeto(int idObjeto) {
        for (Objecto objeto : objectos) {
            if (objeto.getIdObjeto() == idObjeto) {
                objeto.usarObjeto(pookemones.get(pookemonActual));
                System.out.println(nombreEntrenador + " usa " + objeto.getNombreObjeto() + " en " + pookemones.get(pookemonActual).getNombre());
                return;
            }
        }
        System.out.println("Objeto no encontrado.");
    }
    
    public void usarObjeto(int idObjeto, int idMovimiento) {
        for (Objecto objeto : objectos) {
            if (objeto.getIdObjeto() == idObjeto) {
                objeto.usarObjeto(pookemones.get(pookemonActual), idMovimiento);
                System.out.println(nombreEntrenador + " usa " + objeto.getNombreObjeto() + " en " + pookemones.get(pookemonActual).getMovimientos().get(idMovimiento).getNombre());
                return;
            }
        }
        System.out.println("Objeto no encontrado.");
    }
    

    public void cambiarPookemon(int idPookemon) {
        for (int i = 0; i < pookemones.size(); i++) {
            if (pookemones.get(i).getIdPookemon() == idPookemon) {
                pookemonActual = i;
                System.out.println(nombreEntrenador + " cambia a " + pookemones.get(i).getNombre());
                return;
            }
        }
        System.out.println("Pookemon no encontrado.");
    }

    public Pookemon obtenerPookemonPorID(int idPookemon) {
        for (Pookemon pookemon : pookemones) {
            if (pookemon.getIdPookemon() == idPookemon) {
                return pookemon;
            }
        }
        return null;
    }

    /**
     * @return the idEntrenador
     */
    public int getIdEntrenador() {
        return idEntrenador;
    }

    /**
     * @param idEntrenador the idEntrenador to set
     */
    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    /**
     * @return the nombreEntrenador
     */
    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    /**
     * @param nombreEntrenador the nombreEntrenador to set
     */
    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    /**
     * @return the generoEntrenador
     */
    public String getGeneroEntrenador() {
        return generoEntrenador;
    }

    /**
     * @param generoEntrenador the generoEntrenador to set
     */
    public void setGeneroEntrenador(String generoEntrenador) {
        this.generoEntrenador = generoEntrenador;
    }

    /**
     * @return the pookemones
     */
    public List<Pookemon> getPookemones() {
        return pookemones;
    }

    /**
     * @param pookemones the pookemones to set
     */
    public void setPookemones(List<Pookemon> pookemones) {
        this.pookemones = pookemones;
    }

    /**
     * @return the objetos
     */
    public List<Objecto> getObjectos() {
        return objectos;
    }

    /**
     * @param objetos the objetos to set
     */
    public void setObjectos(List<Objecto> objetos) {
        this.objectos = objetos;
    }

    /**
     * @return the pookemonActual
     */
    public int getPookemonActual() {
        return pookemonActual;
    }

    /**
     * @param pookemonActual the pookemonActual to set
     */
    public void setPookemonActual(int pookemonActual) {
        this.pookemonActual = pookemonActual;
    }

    

}
