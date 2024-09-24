package SourcePackPookemon.testing;


import java.util.Scanner;

import SourcePackPookemon.registro.Entrenador;
import SourcePackPookemon.torneo.Torneo;

public class prueba {
    public static void main(String[] args) {
        Torneo torneo = new Torneo();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el número de jugadores");
        int cantidadJugadores = scanner.nextInt();
        System.out.println(cantidadJugadores);

        for (int i = 0; i < cantidadJugadores; i++) {
            System.out.println("Ingresa el nombre del jugador " + (i + 1));
            String nombre = scanner.next();
            System.out.println("Ingrese el género del jugador (F/M): ");
            String genero = scanner.next();
            torneo.addJugador(new Entrenador(nombre, genero));
        }

        System.out.println(torneo.toString());
        scanner.close();
    }
}
