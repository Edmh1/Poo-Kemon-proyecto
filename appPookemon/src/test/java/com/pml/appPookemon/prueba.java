package test.java.com.pml.appPookemon;


import java.util.Scanner;
import main.java.com.pml.appPookemon.datos.pookemon.Movimiento;
import main.java.com.pml.appPookemon.datos.registro.Organizador;
import main.java.com.pml.appPookemon.datos.torneo.Torneo;


public class prueba {
    public static void main(String[] args) {
        Organizador organizador = new Organizador(1, "12345");
        Torneo torneo = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la contraseña del organizador: ");
        String cont = scanner.nextLine();
        if(organizador.verficiarCont(cont)){
            torneo = organizador.getTorneoActual();
            if(organizador.hayTorneo()){
                /*System.out.println("Ingresa el número de jugadores");
                int cantidadJugadores = scanner.nextInt();
                System.out.println(cantidadJugadores);
        
                for (int i = 0; i < cantidadJugadores; i++) {
                    System.out.println("Ingresa el nombre del jugador " + (i + 1));
                    String nombre = scanner.next();
                    System.out.println("Ingrese el género del jugador (F/M): ");
                    String genero = scanner.next();
                    organizador.inscribirJugadorTorneo(new Entrenador(nombre, genero));
                }
                
      
*/
                /*
                torneo.addPookemon(new Pookemon(1111, "Pikachu", "Electricidad", null));
                torneo.addPookemon(new Pookemon(2222, "Charmander", "Fuego", null));
                torneo.addPookemon(new Pookemon(3333, "Squirrel", "Agua", null));
                
                System.out.println("" + torneo.toStringPookemones());
                
                torneo.editarElementoPookemon(1111, "Fuego");
                torneo.editarNombrePookemon(2222, "Escannor");
                System.out.println("" + torneo.toStringPookemones() + "\n");
                
                torneo.eliminarPookemon(3333);
                
                System.out.println("" + torneo.toStringPookemones() + "\n");
                */
                
                torneo.addMovimiento(new Movimiento(1111, "First", "N", 20, 15, 10, "Agua", null));
                
                torneo.addMovimiento(new Movimiento(2222, "Second", "M", 10, 5, 10, "Aire", null));
                torneo.addMovimiento(new Movimiento(3333, "Third", "O", 40, 2, 15, "Fuego", null));
                System.out.println("" + torneo.toStringMovimientos());
                
                torneo.eliminarMovimiento(2222);
                System.out.println("" + torneo.toStringMovimientos());
                
                torneo.editarMovimiento(3333, null, null, 35, 0, 0, null, null);
            }   System.out.println("\n" + torneo.toStringMovimientos() );
                
        }else{
            System.out.println("Contraseña incorrecta");
        }

        System.out.println(torneo.toString());
        scanner.close();
    }
}
