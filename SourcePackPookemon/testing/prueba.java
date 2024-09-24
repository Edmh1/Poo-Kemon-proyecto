package SourcePackPookemon.testing;


import java.util.Scanner;

import SourcePackPookemon.registro.Entrenador;
import SourcePackPookemon.registro.Organizador;
import SourcePackPookemon.torneo.Torneo;

public class prueba {
    public static void main(String[] args) {
        Organizador organizador = new Organizador(1, "12345");
        Torneo torneo = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la contraseña del organizador: ");
        String cont = scanner.nextLine();
        if(organizador.verficiarCont(cont)){
            torneo = organizador.crearTorneo();
            if(organizador.hayTorneo()){
                System.out.println("Ingresa el número de jugadores");
                int cantidadJugadores = scanner.nextInt();
                System.out.println(cantidadJugadores);
        
                for (int i = 0; i < cantidadJugadores; i++) {
                    System.out.println("Ingresa el nombre del jugador " + (i + 1));
                    String nombre = scanner.next();
                    System.out.println("Ingrese el género del jugador (F/M): ");
                    String genero = scanner.next();
                    organizador.inscribirJugadorTorneo(new Entrenador(nombre, genero));
                }
            }
        }else{
            System.out.println("Contraseña incorrecta");
        }

        System.out.println(torneo.toString());
        scanner.close();
    }
}
