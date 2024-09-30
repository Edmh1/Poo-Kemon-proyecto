/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.pml.appPookemon.pookemon;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author eddie
 */
public class MovimientoEspecial extends Movimiento {
    
    private Map<String, Map<String, Double>> tablaEfectividad;
    
    public MovimientoEspecial(int idMovimiento, String nombre, String descripcion, int potencia, int precision, int cantidadPP, String elemento, Efecto efecto) {
        super(idMovimiento, nombre, descripcion, potencia, precision, cantidadPP, elemento, efecto);
        inicializarTablaEfectividad();
    }
    
    private void inicializarTablaEfectividad() {
        tablaEfectividad = new HashMap<>();

        // Efectividad del elemento "fuego"
        Map<String, Double> fuegoEfectividad = new HashMap<>();
        fuegoEfectividad.put("agua", 0.5);   // Fuego es menos efectivo contra agua
        fuegoEfectividad.put("planta", 2.0); // Fuego es más efectivo contra planta
        fuegoEfectividad.put("fuego", 0.5);  // Fuego es menos efectivo contra sí mismo
        tablaEfectividad.put("fuego", fuegoEfectividad);

        // Efectividad del elemento "agua"
        Map<String, Double> aguaEfectividad = new HashMap<>();
        aguaEfectividad.put("fuego", 2.0);   // Agua es más efectiva contra fuego
        aguaEfectividad.put("planta", 0.5);  // Agua es menos efectiva contra planta
        aguaEfectividad.put("agua", 0.5);    // Agua es menos efectiva contra sí misma
        tablaEfectividad.put("agua", aguaEfectividad);

        // Efectividad del elemento "planta"
        Map<String, Double> plantaEfectividad = new HashMap<>();
        plantaEfectividad.put("agua", 2.0);  // Planta es más efectiva contra agua
        plantaEfectividad.put("fuego", 0.5); // Planta es menos efectiva contra fuego
        plantaEfectividad.put("planta", 0.5);// Planta es menos efectiva contra sí misma
        tablaEfectividad.put("planta", plantaEfectividad);

    }
    
    @Override
    protected int calcularDañoBase(Pookemon atacante, Pookemon defensor) {
        int ataque = atacante.getEstadisticaPookemon().getAtaqueEspecial();
        int defensa = defensor.getEstadisticaPookemon().getDefensaEspecial();
        return (getPotencia() * ataque / defensa) / 2;
    }

    private double calcularEfectividad(Pookemon atacante, Pookemon defensor) {
        String elementoAtacante = atacante.getElementoPookemon();
        String elementoDefensor = defensor.getElementoPookemon();
        
        if (tablaEfectividad.containsKey(elementoAtacante)) {
            Map<String, Double> efectividadContraOtros = tablaEfectividad.get(elementoAtacante);
            if (efectividadContraOtros.containsKey(elementoDefensor)) {
                return efectividadContraOtros.get(elementoDefensor);
            }
        }
        return 1.0;
    }

    @Override
    public int calcularDañoTotal(Pookemon atacante, Pookemon defensor) {
        double efectividad = calcularEfectividad(atacante, defensor);
        return (int) (super.calcularDañoTotal(atacante, defensor) * efectividad);
    }
    
    
    
}
