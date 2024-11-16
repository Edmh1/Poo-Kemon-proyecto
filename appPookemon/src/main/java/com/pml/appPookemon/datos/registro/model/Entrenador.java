package main.java.com.pml.appPookemon.datos.registro.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import main.java.com.pml.appPookemon.datos.pookemon.model.Movimiento;
import main.java.com.pml.appPookemon.datos.pookemon.model.Objeto;
import main.java.com.pml.appPookemon.datos.pookemon.model.Pookemon;


public class Entrenador implements Serializable {
    private String nombreEntrenador;
    private String generoEntrenador;
    private List<Pookemon> pookemones;
    private List<Objeto> objetos;
    private int pookemonActual;

    public Entrenador(String nombreEntrenador, String generoEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
        this.generoEntrenador = generoEntrenador;
        this.pookemones = new ArrayList<>();
        this.objetos = new ArrayList<>();
        this.pookemonActual = 0;
    }
    
    public void defenderse() {
        Pookemon pookemon = pookemones.get(pookemonActual);
        pookemon.activarDefensa();
        System.out.println(pookemon.getNombrePookemon() + " se está defendiendo. El daño será reducido en este turno.");
    }

    public void atacar(int idMovimiento, Pookemon objetivo) {
        Pookemon pookemon = pookemones.get(pookemonActual);
        Movimiento movimiento = pookemon.obtenerMovimientoPorID(idMovimiento);
        if (movimiento != null) {
            System.out.println(nombreEntrenador + " ordena a " + pookemon.getNombrePookemon() + " usar " + movimiento.getNombreMovimiento());
            movimiento.realizar(pookemon, objetivo);
        } else {
            System.out.println("Movimiento no encontrado.");
        }
    }

    public void usarObjeto(int idObjeto) {
        for (Objeto objeto : objetos) {
            if (objeto.getIdObjeto() == idObjeto) {
                objeto.usarObjeto(pookemones.get(pookemonActual),0);
                System.out.println(nombreEntrenador + " usa " + objeto.getNombreObjeto() + " en " + pookemones.get(pookemonActual).getNombrePookemon());
                return;
            }
        }
        System.out.println("Objeto no encontrado.");
    }
    
    public void usarObjeto(int idObjeto, int idMovimiento) {
        for (Objeto objeto : objetos) {
            if (objeto.getIdObjeto() == idObjeto) {
                objeto.usarObjeto(pookemones.get(pookemonActual), idMovimiento);
                return;
            }
        }
        System.out.println("Objeto no encontrado.");
    }
    

    public void cambiarPookemon(int idPookemon) {
        for (int i = 0; i < pookemones.size(); i++) {
            if (pookemones.get(i).getIdPookemon() == idPookemon) {
                pookemonActual = i;
                System.out.println(nombreEntrenador + " cambia a " + pookemones.get(i).getNombrePookemon());
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
    
    public ArrayList<Pookemon> obtenerPookemonesDiferentesActual(){
        ArrayList<Pookemon> resultado = new ArrayList<>();
        Pookemon index = pookemones.get(pookemonActual);
        for (int i = 0; i < pookemones.size(); i++) {
            if(pookemones.get(i) != index){
                resultado.add(pookemones.get(i));
            }
        }
        return resultado;
    }
    
    /**
     * @param objetos the objetos to set
     */
    public void setObjetos(List<Objeto> objetos) {
        this.objetos = objetos;
    }
    
    /**
     * @param pookemones the pookemones to set
     */
    public void setPookemones(List<Pookemon> pookemones) {
        this.pookemones = pookemones;
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
     * @return the objetos
     */
    public List<Objeto> getObjetos() {
        return objetos;
    }

    /**
     * @return the pookemonActual
     */
    public Pookemon getPookemonActual() {
        return pookemones.get(pookemonActual);
    }

    /**
     * @param pookemonActual the pookemonActual to set
     */
    public void setPookemonActual(int pookemonActual) {
        this.pookemonActual = pookemonActual;
    }

}
