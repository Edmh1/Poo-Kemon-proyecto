package test.java.com.pml.appPookemon;


import java.util.Scanner;
import main.java.com.pml.appPookemon.datos.pookemon.model.Movimiento;
import main.java.com.pml.appPookemon.datos.pookemon.model.MovimientoEspecial;
import main.java.com.pml.appPookemon.datos.pookemon.model.Pookemon;
import main.java.com.pml.appPookemon.datos.registro.model.Organizador;
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
                
                Pookemon Roserade = new Pookemon(407, "Roserade", "planta", null);
                Roserade.inicializarEstadistica(60, 70, 65, 125, 105, 90);
                
                Pookemon Venusaur = new Pookemon(3, "Venusaur", "planta", null);
                Venusaur.inicializarEstadistica(80, 82, 83, 100, 100, 80);
                
                Pookemon Typhlosion = new Pookemon(157, "Typhlosion", "fuego", null);
                Typhlosion.inicializarEstadistica(78, 84, 78, 109, 85, 100);
                
                Pookemon Gyarados = new Pookemon(130, "Gyarados", "agua", null);
                Gyarados.inicializarEstadistica(95, 125, 79, 60, 100, 81);
                
                Pookemon Milotic = new Pookemon(350, "Milotic", "agua", null);
                Milotic.inicializarEstadistica(95, 60, 79, 100, 125, 81);
                
                Pookemon Greninja = new Pookemon(658, "Greninja", "agua", null);
                Greninja.inicializarEstadistica(72, 95, 67, 103, 71, 122);
                
                Pookemon Raichu = new Pookemon(26, "Raichu", "electrico", null);
                Raichu.inicializarEstadistica(60, 90, 55, 90, 80, 110);
                
                Pookemon Nidoking = new Pookemon(34, "Nidoking", "veneno", null);
                Nidoking.inicializarEstadistica(81, 102, 77, 85, 75, 85);
                
                Pookemon Alakazam = new Pookemon(65, "Alakazam", "psiquico", null);
                Alakazam.inicializarEstadistica(55, 50, 45, 135, 95, 120);
                
                Pookemon Hypno = new Pookemon(97, "Hypno", "psiquico", null);
                Hypno.inicializarEstadistica(85, 73, 70, 73, 115, 67);
                
                Pookemon Lucario = new Pookemon(448, "Lucario", "lucha", null);              
                Lucario.inicializarEstadistica(70, 110, 70, 115, 70, 90);
                
                Pookemon Tyranitar = new Pookemon(248, "Tyranitar", "roca", null);
                Tyranitar.inicializarEstadistica(100, 134, 110, 95, 100, 61);
                
                Pookemon Gengar = new Pookemon(94, "Gengar", "fantasma", null);
                Gengar.inicializarEstadistica(60, 65, 60,130, 75, 110);
                
                Pookemon Clefable = new Pookemon(36, "Clefable", "hada", null);
                Clefable.inicializarEstadistica(95, 70, 73, 95, 90, 60);
                
                Pookemon Snorlax = new Pookemon(143, "Snorlax", "normal", null);
                Snorlax.inicializarEstadistica(160, 110, 65, 65, 110, 30);
                
                Pookemon Blissey = new Pookemon(242, "Blissey", "normal", null);
                Blissey.inicializarEstadistica(255, 10, 10, 75, 135, 55);
                
                Pookemon Dragonite = new Pookemon(149, "Dragonite", "dragon", null);
                Dragonite.inicializarEstadistica(91, 134, 95, 100, 100, 80);
                
                Pookemon Heracross = new Pookemon(214, "Heracross", "bicho", null);
                Heracross.inicializarEstadistica(80, 125, 75, 40, 95, 85);
                
                Pookemon Volcarona = new Pookemon(637, "Volcarona", "bicho", null);
                Volcarona.inicializarEstadistica(85, 60, 65, 135, 105, 100);
                
                Pookemon Metagross = new Pookemon(376, "Metagross", "acero", null);
                Metagross.inicializarEstadistica(80, 135, 130, 95, 90, 70);
                
                Pookemon Excadrill = new Pookemon(530, "Excadrill", "tierra", null);
                Excadrill.inicializarEstadistica(110, 135, 60, 50, 65, 88);
                
                Pookemon Hydreigon = new Pookemon(635, "Hydreigon", "siniestro", null);
                Hydreigon.inicializarEstadistica(92, 105, 90, 125, 90, 98);
                
                Pookemon Staraptor = new Pookemon(398, "Staraptor", "volador", null);
                Staraptor.inicializarEstadistica(85, 120, 70, 50, 60, 100);
                
                Pookemon Lapras = new Pookemon(131, "Lapras", "hielo", null);
                Lapras.inicializarEstadistica(130, 85, 80, 85, 95, 60);
                
                Pookemon Weavile = new Pookemon(461, "Weavile", "hielo", null);
                Weavile.inicializarEstadistica(70, 120, 65, 45, 85, 125);
                
                torneo.addMovimiento(new MovimientoEspecial(1111, "First", "N", 20, 15, 10, "Agua", null));
                
                torneo.addMovimiento(new MovimientoEspecial(2222, "Second", "M", 10, 5, 10, "Aire", null));
                torneo.addMovimiento(new MovimientoEspecial(3333, "Third", "O", 40, 2, 15, "Fuego", null));
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
