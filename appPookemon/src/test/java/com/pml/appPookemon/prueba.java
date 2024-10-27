package test.java.com.pml.appPookemon;


import java.util.Scanner;
import main.java.com.pml.appPookemon.datos.pookemon.model.Movimiento;
import main.java.com.pml.appPookemon.datos.pookemon.model.MovimientoEspecial;
import main.java.com.pml.appPookemon.datos.pookemon.model.MovimientoFisico;
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
                
                /*
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

                Movimiento Lanzallamas = new MovimientoEspecial(1, "Lanzallamas", " ", 90, 100, 10, "fuego", null);
                Movimiento PunoFuego = new MovimientoFisico(2, "Puño Fuego", "", 75, 100, 15, "fuego", null);
                Movimiento Llamarada = new MovimientoEspecial(3, "Llamarada", "", 110, 85, 5, "fuego", null);
                Movimiento Hidroariete = new MovimientoFisico(4, "Hidroariete", "", 85, 100, 10, "agua", null);
                Movimiento Escaldar = new MovimientoEspecial(5, "Escaldar", "", 80, 100, 10, "agua", null);
                Movimiento Hidrobomba = new MovimientoEspecial(6, "Hidrobomba", "", 120, 80, 5, "agua", null);
                Movimiento Energibola = new MovimientoEspecial(7, "Energibola", "", 90, 100, 10, "planta", null);
                Movimiento BombaGermen = new MovimientoFisico(8, "Bomba Germen", "", 80, 100, 15, "planta", null);
                Movimiento Latigazo = new MovimientoFisico(9, "Latigazo", "", 120, 85, 10, "planta", null);
                Movimiento Rayo = new MovimientoEspecial(10, "Rayo", "", 90, 100, 10, "electrico", null);
                Movimiento PunoTrueno = new MovimientoFisico(11, "Puño Trueno", "", 75, 100, 15, "electrico", null);
                Movimiento Trueno = new MovimientoEspecial(12, "Trueno", "", 110, 70, 10, "electrico", null);
                Movimiento Terremoto = new MovimientoFisico(13, "Terremoto", "", 100, 100, 10, "tierra", null);
                Movimiento TierraViva = new MovimientoEspecial(14, "Tierra Viva", "", 90, 100, 10, "tierra", null);
                Movimiento RocaAfilada = new MovimientoFisico(15, "Roca Afilada", "", 100, 80, 5, "roca", null);
                Movimiento JoyaDeLuz = new MovimientoEspecial(16, "Joya de Luz", "", 80, 100, 20, "roca", null);
                Movimiento Avalancha = new MovimientoFisico(17, "Avalancha", "", 75, 90, 10, "roca", null);
                Movimiento TajoAereo = new MovimientoEspecial(18, "Tajo Aereo", "", 75, 95, 15, "volador", null);
                Movimiento Vendaval = new MovimientoEspecial(19, "Vendaval", "", 110, 70, 10, "volador", null);
                Movimiento PicoTaladro = new MovimientoFisico(20, "Pico Taladro", "", 80, 100, 20, "volador", null);
                Movimiento BombaLodo = new MovimientoEspecial(21, "Bomba Lodo", "", 90, 100, 10, "veneno", null);
                Movimiento PuyaNociva = new MovimientoFisico(22, "Puya Nociva", "", 80, 100, 20, "veneno", null);
                Movimiento LanzaMugre = new MovimientoFisico(23, "Lanza Mugre", "", 120, 80, 5, "veneno", null);
                Movimiento Psiquico = new MovimientoEspecial(24, "Psiquico", "", 90, 100, 10, "psiquico", null);
                Movimiento CabezazoZen = new MovimientoFisico(25, "Cabezazo Zen", "", 80, 90, 15, "psiquico", null);
                Movimiento Psicocorte = new MovimientoFisico(26, "Psicocorte", "", 70, 100, 20, "psiquico", null);
                Movimiento OndaCertera = new MovimientoEspecial(27, "Onda Certera", "", 120, 70, 5, "lucha", null);
                Movimiento ABocajarro = new MovimientoFisico(28, "ABocajarro", "", 120, 100, 5, "lucha", null);
                Movimiento Triturar = new MovimientoFisico(29, "Triturar", "", 80, 100, 15, "siniestro", null);
                Movimiento PulsoUmbrio = new MovimientoEspecial(30, "Pulso Umbrio", "", 80, 100, 15, "siniestro", null);
                Movimiento BolaSombra = new MovimientoEspecial(31, "Bola Sombra", "", 80, 100, 15, "fantasma", null);
                Movimiento GarraUmbria = new MovimientoFisico(32, "Garra Umbria", "", 70, 100, 15, "fantasma", null);
                Movimiento FocoResplandor = new MovimientoEspecial(33, "Foco Resplandor", "", 80, 100, 10, "acero", null);
                Movimiento CabezaDeHierro = new MovimientoFisico(34, "Cabeza de Hierro", "", 80, 100, 15, "acero", null);
                Movimiento FuerzaLunar = new MovimientoEspecial(35, "Fuerza Lunar", "", 95, 100, 15, "hada", null);
                Movimiento Carantona = new MovimientoFisico(36, "Carantoña", "", 90, 90, 10, "hada", null);
                Movimiento GarraDragon = new MovimientoFisico(37, "Garra Dragon", "", 80, 100, 15, "dragon", null);
                Movimiento PulsoDragon = new MovimientoEspecial(38, "Pulso Dragon", "", 85, 100, 10, "dragon", null);
                Movimiento PunoHielo = new MovimientoFisico(39, "Puño Hielo", "", 75, 100, 15, "hielo", null);
                Movimiento RayoHielo = new MovimientoEspecial(40, "Rayo Hielo", "", 90, 100, 10, "hielo", null);
                Movimiento Ventisca = new MovimientoEspecial(41, "Ventisca", "", 110, 70, 5, "hielo", null);
                Movimiento Megacuerno = new MovimientoFisico(42, "Megacuerno", "", 120, 85, 10, "bicho", null);
                Movimiento Zumbido = new MovimientoEspecial(43, "Zumbido", "", 90, 100, 10, "bicho", null);
                Movimiento TijeraX = new MovimientoFisico(44, "Tijera X", "", 80, 100, 15, "bicho", null);
                Movimiento Vozarron = new MovimientoEspecial(45, "Vozarron", "", 90, 100, 10, "normal", null);
                Movimiento GolpeCuerpo = new MovimientoFisico(46, "Golpe Cuerpo", "", 85, 100, 15, "normal", null);
                /*
                torneo.addMovimiento(new MovimientoEspecial(1111, "First", "N", 20, 15, 10, "Agua", null));
                
                torneo.addMovimiento(new MovimientoEspecial(2222, "Second", "M", 10, 5, 10, "Aire", null));
                torneo.addMovimiento(new MovimientoEspecial(3333, "Third", "O", 40, 2, 15, "Fuego", null));
                System.out.println("" + torneo.toStringMovimientos());
                
                torneo.eliminarMovimiento(2222);
                System.out.println("" + torneo.toStringMovimientos());
                
                torneo.editarMovimiento(3333, null, null, 35, 0, 0, null, null);*/
            }   //System.out.println("\n" + torneo.toStringMovimientos() );
                
        }else{
            System.out.println("Contraseña incorrecta");
        }

        System.out.println(torneo.toString());
        scanner.close();
    }
}
