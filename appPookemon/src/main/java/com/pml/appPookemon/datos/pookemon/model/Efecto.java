package main.java.com.pml.appPookemon.datos.pookemon.model;

import main.java.com.pml.appPookemon.datos.pookemon.model.Movimiento;
import main.java.com.pml.appPookemon.datos.pookemon.model.Pookemon;


public interface Efecto {
    
    public boolean seActivaEfecto(Pookemon p);
    public String aplicarEfecto(Pookemon p);
    public String eliminarEfecto(Pookemon p);
    public String tipoEfecto();
}
