package main.java.com.pml.appPookemon.datos.pookemon;

import main.java.com.pml.appPookemon.datos.pookemon.model.Movimiento;
import main.java.com.pml.appPookemon.datos.pookemon.model.Pookemon;


public interface Efecto {
    
    public boolean seActivaEfecto(Pookemon p);
    public void eliminarEfecto(Pookemon p);
    public void aplicarEfecto(Pookemon p);
    public void afectarEstadiscitas(Pookemon p);
    
    
}
