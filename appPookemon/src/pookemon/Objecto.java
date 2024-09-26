package pookemon;

public class Objecto {

    private int idObjeto;
    private String nombreObjeto;
    private String tipoObjeto;
    private int puntosR;

    public Objecto(int idObjeto, String nombreObjeto, String tipoObjeto, int puntosR) {
        this.idObjeto = idObjeto;
        this.nombreObjeto = nombreObjeto;
        this.tipoObjeto = tipoObjeto;
        this.puntosR = puntosR;
    }
    
    public void usarObjeto(Pookemon pookemon) {
        pookemon.getEstadistica().setVida(pookemon.getEstadistica().getVida()+puntosR);
        System.out.println(pookemon.getNombre() + " ha recuperado " + puntosR + " puntos de vida.");
    }
    
    public void usarObjeto(Pookemon pookemon, int idMovimiento) {
        for (Movimiento mov : pookemon.getMovimientos()) {
            if(idMovimiento == mov.getIdMovimiento())
                mov.setCantidadPP(mov.getCantidadPP()+puntosR);
        }
        System.out.println(pookemon.getNombre() + " ha recuperado " + puntosR + " puntos de PP.");
    }      
   

    /**
     * @return the idObjeto
     */
    public int getIdObjeto() {
        return idObjeto;
    }

    /**
     * @param idObjeto the idObjeto to set
     */
    public void setIdObjeto(int idObjeto) {
        this.idObjeto = idObjeto;
    }

    /**
     * @return the nombreObjeto
     */
    public String getNombreObjeto() {
        return nombreObjeto;
    }

    /**
     * @param nombreObjeto the nombreObjeto to set
     */
    public void setNombreObjeto(String nombreObjeto) {
        this.nombreObjeto = nombreObjeto;
    }

    /**
     * @return the tipoObjeto
     */
    public String getTipoObjeto() {
        return tipoObjeto;
    }

    /**
     * @param tipoObjeto the tipoObjeto to set
     */
    public void setTipoObjeto(String tipoObjeto) {
        this.tipoObjeto = tipoObjeto;
    }

    /**
     * @return the puntosR
     */
    public int getPuntosR() {
        return puntosR;
    }

    /**
     * @param puntosR the puntosR to set
     */
    public void setPuntosR(int puntosR) {
        this.puntosR = puntosR;
    }
    
    
    
}
