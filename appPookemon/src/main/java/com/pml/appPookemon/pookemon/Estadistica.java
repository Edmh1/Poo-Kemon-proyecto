package pookemon;

public class Estadistica {
    private int vida;
    private int ataqueFisico;
    private int defensaFisica;
    private int ataqueEspecial;
    private int defensaEspecial;
    private int velocidad;

    public Estadistica(int vida, int ataqueFisico, int defensaFisica, int ataqueEspecial, int defensaEspecial, int velocidad) {
        this.vida = vida;
        this.ataqueFisico = ataqueFisico;
        this.defensaFisica = defensaFisica;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Estadistica{" + "vida=" + vida + ", ataqueFisico=" + ataqueFisico + ", defensaFisica=" + defensaFisica + ", ataqueEspecial=" + ataqueEspecial + ", defensaEspecial=" + defensaEspecial + ", velocidad=" + velocidad + '}';
    }

    /**
     * @return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * @return the ataqueFisico
     */
    public int getAtaqueFisico() {
        return ataqueFisico;
    }

    /**
     * @param ataqueFisico the ataqueFisico to set
     */
    public void setAtaqueFisico(int ataqueFisico) {
        this.ataqueFisico = ataqueFisico;
    }

    /**
     * @return the defensaFisica
     */
    public int getDefensaFisica() {
        return defensaFisica;
    }

    /**
     * @param defensaFisica the defensaFisica to set
     */
    public void setDefensaFisica(int defensaFisica) {
        this.defensaFisica = defensaFisica;
    }

    /**
     * @return the ataqueEspecial
     */
    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    /**
     * @param ataqueEspecial the ataqueEspecial to set
     */
    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    /**
     * @return the defensaEspecial
     */
    public int getDefensaEspecial() {
        return defensaEspecial;
    }

    /**
     * @param defensaEspecial the defensaEspecial to set
     */
    public void setDefensaEspecial(int defensaEspecial) {
        this.defensaEspecial = defensaEspecial;
    }

    /**
     * @return the velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

 
}
