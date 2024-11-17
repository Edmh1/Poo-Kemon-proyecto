/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java.com.pml.appPookemon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.java.com.pml.appPookemon.datos.pookemon.model.EfectoEnvenenamiento;
import main.java.com.pml.appPookemon.datos.pookemon.model.EfectoParalisis;
import main.java.com.pml.appPookemon.datos.pookemon.model.EfectoQuemadura;
import main.java.com.pml.appPookemon.datos.pookemon.model.Movimiento;
import main.java.com.pml.appPookemon.datos.pookemon.model.MovimientoEspecial;
import main.java.com.pml.appPookemon.datos.pookemon.model.MovimientoFisico;
import main.java.com.pml.appPookemon.datos.pookemon.model.Pookemon;
import main.java.com.pml.appPookemon.datos.registro.model.Organizador;
import main.java.com.pml.appPookemon.persistencia.Serializar;

/**
 *
 * @author eddie
 */
public class InicializadorObj {

    public static void main(String[] args) {
        
        
        //efectos
        EfectoQuemadura quemadura = new EfectoQuemadura();
        EfectoEnvenenamiento envenenamiento = new EfectoEnvenenamiento();
        EfectoParalisis paralisis = new EfectoParalisis();
        
        
        //pookemones
        Pookemon Weavile = new Pookemon(0, "Weavile", "hielo");
        Weavile.inicializarEstadistica(70, 120, 65, 45, 85, 125);
        
        Pookemon Roserade = new Pookemon(1, "Roserade", "planta");
        Roserade.inicializarEstadistica(60, 70, 65, 125, 105, 90);

        Pookemon Venusaur = new Pookemon(2, "Venusaur", "planta");
        Venusaur.inicializarEstadistica(80, 82, 83, 100, 100, 80);

        Pookemon Typhlosion = new Pookemon(3, "Typhlosion", "fuego");
        Typhlosion.inicializarEstadistica(78, 84, 78, 109, 85, 100);

        Pookemon Gyarados = new Pookemon(4, "Gyarados", "agua");
        Gyarados.inicializarEstadistica(95, 125, 79, 60, 100, 81);

        Pookemon Milotic = new Pookemon(5, "Milotic", "agua");
        Milotic.inicializarEstadistica(95, 60, 79, 100, 125, 81);

        Pookemon Greninja = new Pookemon(6, "Greninja", "agua");
        Greninja.inicializarEstadistica(72, 95, 67, 103, 71, 122);

        Pookemon Raichu = new Pookemon(7, "Raichu", "electrico");
        Raichu.inicializarEstadistica(60, 90, 55, 90, 80, 110);

        Pookemon Nidoking = new Pookemon(8, "Nidoking", "veneno");
        Nidoking.inicializarEstadistica(81, 102, 77, 85, 75, 85);

        Pookemon Alakazam = new Pookemon(9, "Alakazam", "psiquico");
        Alakazam.inicializarEstadistica(55, 50, 45, 135, 95, 120);

        Pookemon Hypno = new Pookemon(10, "Hypno", "psiquico");
        Hypno.inicializarEstadistica(85, 73, 70, 73, 115, 67);

        Pookemon Lucario = new Pookemon(11, "Lucario", "lucha");
        Lucario.inicializarEstadistica(70, 110, 70, 115, 70, 90);

        Pookemon Tyranitar = new Pookemon(12, "Tyranitar", "roca");
        Tyranitar.inicializarEstadistica(100, 134, 110, 95, 100, 61);

        Pookemon Gengar = new Pookemon(13, "Gengar", "fantasma");
        Gengar.inicializarEstadistica(60, 65, 60, 130, 75, 110);

        Pookemon Clefable = new Pookemon(14, "Clefable", "hada");
        Clefable.inicializarEstadistica(95, 70, 73, 95, 90, 60);

        Pookemon Snorlax = new Pookemon(15, "Snorlax", "normal");
        Snorlax.inicializarEstadistica(160, 110, 65, 65, 110, 30);

        Pookemon Blissey = new Pookemon(16, "Blissey", "normal");
        Blissey.inicializarEstadistica(255, 10, 10, 75, 135, 55);

        Pookemon Dragonite = new Pookemon(17, "Dragonite", "dragon");
        Dragonite.inicializarEstadistica(91, 134, 95, 100, 100, 80);

        Pookemon Heracross = new Pookemon(18, "Heracross", "bicho");
        Heracross.inicializarEstadistica(80, 125, 75, 40, 95, 85);

        Pookemon Volcarona = new Pookemon(19, "Volcarona", "bicho");
        Volcarona.inicializarEstadistica(85, 60, 65, 135, 105, 100);

        Pookemon Metagross = new Pookemon(20, "Metagross", "acero");
        Metagross.inicializarEstadistica(80, 135, 130, 95, 90, 70);

        Pookemon Excadrill = new Pookemon(21, "Excadrill", "tierra");
        Excadrill.inicializarEstadistica(110, 135, 60, 50, 65, 88);

        Pookemon Hydreigon = new Pookemon(22, "Hydreigon", "siniestro");
        Hydreigon.inicializarEstadistica(92, 105, 90, 125, 90, 98);

        Pookemon Staraptor = new Pookemon(23, "Staraptor", "volador");
        Staraptor.inicializarEstadistica(85, 120, 70, 50, 60, 100);

        Pookemon Lapras = new Pookemon(24, "Lapras", "hielo");
        Lapras.inicializarEstadistica(130, 85, 80, 85, 95, 60);

        
        //movimientos
        Movimiento Lanzallamas = new MovimientoEspecial(1, "Lanzallamas", 90, 100, 10, "fuego", quemadura, 10);
        Movimiento PunoFuego = new MovimientoFisico(2, "Puño Fuego", 75, 100, 15, "fuego", quemadura, 10);
        Movimiento Llamarada = new MovimientoEspecial(3, "Llamarada", 110, 85, 5, "fuego", quemadura, 10);
        Movimiento Hidroariete = new MovimientoFisico(4, "Hidroariete", 85, 100, 10, "agua", null, 0);
        Movimiento Escaldar = new MovimientoEspecial(5, "Escaldar", 80, 100, 10, "agua", quemadura, 30);
        Movimiento Hidrobomba = new MovimientoEspecial(6, "Hidrobomba", 120, 80, 5, "agua", null, 0);
        Movimiento Energibola = new MovimientoEspecial(7, "Energibola", 90, 100, 10, "planta", null, 0);
        Movimiento BombaGermen = new MovimientoFisico(8, "Bomba Germen", 80, 100, 15, "planta", null, 0);
        Movimiento Latigazo = new MovimientoFisico(9, "Latigazo", 120, 85, 10, "planta", null, 0);
        Movimiento Rayo = new MovimientoEspecial(10, "Rayo", 90, 100, 10, "electrico", paralisis, 10);
        Movimiento PunoTrueno = new MovimientoFisico(11, "Puño Trueno", 75, 100, 15, "electrico", paralisis, 10);
        Movimiento Trueno = new MovimientoEspecial(12, "Trueno", 110, 70, 10, "electrico", paralisis, 30);
        Movimiento Terremoto = new MovimientoFisico(13, "Terremoto", 100, 100, 10, "tierra", null, 0);
        Movimiento TierraViva = new MovimientoEspecial(14, "Tierra Viva", 90, 100, 10, "tierra", null, 0);
        Movimiento RocaAfilada = new MovimientoFisico(15, "Roca Afilada", 100, 80, 5, "roca", null, 0);
        Movimiento JoyaDeLuz = new MovimientoEspecial(16, "Joya de Luz", 80, 100, 20, "roca", null, 0);
        Movimiento Avalancha = new MovimientoFisico(17, "Avalancha", 75, 90, 10, "roca", null, 0);
        Movimiento TajoAereo = new MovimientoEspecial(18, "Tajo Aereo", 75, 95, 15, "volador", null, 0);
        Movimiento Vendaval = new MovimientoEspecial(19, "Vendaval", 110, 70, 10, "volador", null, 0);
        Movimiento PicoTaladro = new MovimientoFisico(20, "Pico Taladro", 80, 100, 20, "volador", null, 0);
        Movimiento BombaLodo = new MovimientoEspecial(21, "Bomba Lodo", 90, 100, 10, "veneno", envenenamiento, 30);
        Movimiento PuyaNociva = new MovimientoFisico(22, "Puya Nociva", 80, 100, 20, "veneno", envenenamiento, 30);
        Movimiento LanzaMugre = new MovimientoFisico(23, "Lanza Mugre", 120, 80, 5, "veneno", envenenamiento, 30);
        Movimiento Psiquico = new MovimientoEspecial(24, "Psiquico", 90, 100, 10, "psiquico", null, 0);
        Movimiento CabezazoZen = new MovimientoFisico(25, "Cabezazo Zen", 80, 90, 15, "psiquico", null, 0);
        Movimiento Psicocorte = new MovimientoFisico(26, "Psicocorte", 70, 100, 20, "psiquico", null, 0);
        Movimiento OndaCertera = new MovimientoEspecial(27, "Onda Certera", 120, 70, 5, "lucha", null, 0);
        Movimiento ABocajarro = new MovimientoFisico(28, "ABocajarro", 120, 100, 5, "lucha", null, 0);
        Movimiento Triturar = new MovimientoFisico(29, "Triturar", 80, 100, 15, "siniestro", null, 0);
        Movimiento PulsoUmbrio = new MovimientoEspecial(30, "Pulso Umbrio", 80, 100, 15, "siniestro", null, 0);
        Movimiento BolaSombra = new MovimientoEspecial(31, "Bola Sombra", 80, 100, 15, "fantasma", null, 0);
        Movimiento GarraUmbria = new MovimientoFisico(32, "Garra Umbria", 70, 100, 15, "fantasma", null, 0);
        Movimiento FocoResplandor = new MovimientoEspecial(33, "Foco Resplandor", 80, 100, 10, "acero", null, 0);
        Movimiento CabezaDeHierro = new MovimientoFisico(34, "Cabeza de Hierro", 80, 100, 15, "acero", null, 0);
        Movimiento FuerzaLunar = new MovimientoEspecial(35, "Fuerza Lunar", 95, 100, 15, "hada", null, 0);
        Movimiento Carantona = new MovimientoFisico(36, "Carantoña", 90, 90, 10, "hada", null, 0);
        Movimiento GarraDragon = new MovimientoFisico(37, "Garra Dragon", 80, 100, 15, "dragon", null, 0);
        Movimiento PulsoDragon = new MovimientoEspecial(38, "Pulso Dragon", 85, 100, 10, "dragon", null, 0);
        Movimiento PunoHielo = new MovimientoFisico(39, "Puño Hielo", 75, 100, 15, "hielo", null, 0);
        Movimiento RayoHielo = new MovimientoEspecial(40, "Rayo Hielo", 90, 100, 10, "hielo", null, 0);
        Movimiento Ventisca = new MovimientoEspecial(41, "Ventisca", 110, 70, 5, "hielo", null, 0);
        Movimiento Megacuerno = new MovimientoFisico(42, "Megacuerno", 120, 85, 10, "bicho", null, 0);
        Movimiento Zumbido = new MovimientoEspecial(43, "Zumbido", 90, 100, 10, "bicho", null, 0);
        Movimiento TijeraX = new MovimientoFisico(44, "Tijera X", 80, 100, 15, "bicho", null, 0);
        Movimiento Vozarron = new MovimientoEspecial(45, "Vozarron", 90, 100, 10, "normal", null, 0);
        Movimiento GolpeCuerpo = new MovimientoFisico(46, "Golpe Cuerpo", 85, 100, 15, "normal", paralisis, 30);

        
        //pokemones con movimientos
        Roserade.setMovimientos(new ArrayList<>(Arrays.asList(Energibola, BombaGermen, BombaLodo, PuyaNociva)));
        Venusaur.setMovimientos(new ArrayList<>(Arrays.asList(Latigazo, BombaGermen, Energibola, BombaLodo)));
        Typhlosion.setMovimientos(new ArrayList<>(Arrays.asList(Lanzallamas, PunoFuego, Llamarada, Terremoto)));
        Gyarados.setMovimientos(new ArrayList<>(Arrays.asList(Hidroariete, Avalancha, Terremoto, RocaAfilada)));
        Milotic.setMovimientos(new ArrayList<>(Arrays.asList(Hidrobomba, Escaldar, TierraViva, RayoHielo)));
        Greninja.setMovimientos(new ArrayList<>(Arrays.asList(Hidrobomba, PulsoUmbrio, PuyaNociva, TijeraX)));
        Raichu.setMovimientos(new ArrayList<>(Arrays.asList(Rayo, PunoTrueno, Trueno, Vozarron)));
        Nidoking.setMovimientos(new ArrayList<>(Arrays.asList(Terremoto, PuyaNociva, LanzaMugre, CabezazoZen)));
        Alakazam.setMovimientos(new ArrayList<>(Arrays.asList(Psiquico, Psicocorte, FocoResplandor, Rayo)));
        Hypno.setMovimientos(new ArrayList<>(Arrays.asList(Psiquico, Vozarron, BombaLodo, GolpeCuerpo)));
        Lucario.setMovimientos(new ArrayList<>(Arrays.asList(ABocajarro, OndaCertera, Terremoto, CabezazoZen)));
        Tyranitar.setMovimientos(new ArrayList<>(Arrays.asList(Triturar, Terremoto, RocaAfilada, PuyaNociva)));
        Gengar.setMovimientos(new ArrayList<>(Arrays.asList(BolaSombra, PulsoUmbrio, OndaCertera, Psiquico)));
        Clefable.setMovimientos(new ArrayList<>(Arrays.asList(FuerzaLunar, Carantona, Vozarron, Rayo)));
        Snorlax.setMovimientos(new ArrayList<>(Arrays.asList(GolpeCuerpo, Terremoto, PunoFuego, Vozarron)));
        Blissey.setMovimientos(new ArrayList<>(Arrays.asList(FuerzaLunar, Vozarron, Rayo, Terremoto)));
        Dragonite.setMovimientos(new ArrayList<>(Arrays.asList(GarraDragon, PulsoDragon, Ventisca, PunoHielo)));
        Heracross.setMovimientos(new ArrayList<>(Arrays.asList(ABocajarro, Megacuerno, TijeraX, Terremoto)));
        Volcarona.setMovimientos(new ArrayList<>(Arrays.asList(Llamarada, Zumbido, Vendaval, FocoResplandor)));
        Metagross.setMovimientos(new ArrayList<>(Arrays.asList(CabezaDeHierro, PuyaNociva, CabezazoZen, Terremoto)));
        Excadrill.setMovimientos(new ArrayList<>(Arrays.asList(Terremoto, RocaAfilada, GarraUmbria, PuyaNociva)));
        Hydreigon.setMovimientos(new ArrayList<>(Arrays.asList(PulsoUmbrio, FocoResplandor, GarraDragon, Terremoto)));
        Staraptor.setMovimientos(new ArrayList<>(Arrays.asList(PicoTaladro, GolpeCuerpo, CabezazoZen, Terremoto)));
        Lapras.setMovimientos(new ArrayList<>(Arrays.asList(Ventisca, RayoHielo, Hidrobomba, Vozarron)));
        Weavile.setMovimientos(new ArrayList<>(Arrays.asList(GarraUmbria, Triturar, PunoHielo, Ventisca)));
        
       
        
        Organizador o = new Organizador("Admin", "12345");
        
       
        o.agregarPookemon(Roserade);
        o.agregarPookemon(Venusaur);
        o.agregarPookemon(Typhlosion);
        o.agregarPookemon(Gyarados);
        o.agregarPookemon(Milotic);
        o.agregarPookemon(Greninja);
        o.agregarPookemon(Raichu);
        o.agregarPookemon(Nidoking);
        o.agregarPookemon(Alakazam);
        o.agregarPookemon(Hypno);
        o.agregarPookemon(Lucario);
        o.agregarPookemon(Tyranitar);
        o.agregarPookemon(Gengar);
        o.agregarPookemon(Clefable);
        o.agregarPookemon(Snorlax);
        o.agregarPookemon(Blissey);
        o.agregarPookemon(Dragonite);
        o.agregarPookemon(Heracross);
        o.agregarPookemon(Volcarona);
        o.agregarPookemon(Metagross);
        o.agregarPookemon(Excadrill);
        o.agregarPookemon(Hydreigon);
        o.agregarPookemon(Staraptor);
        o.agregarPookemon(Lapras);
        o.agregarPookemon(Weavile);

        o.agregarMovimiento(Lanzallamas);
        o.agregarMovimiento(PunoFuego);
        o.agregarMovimiento(Llamarada);
        o.agregarMovimiento(Hidroariete);
        o.agregarMovimiento(Escaldar);
        o.agregarMovimiento(Hidrobomba);
        o.agregarMovimiento(Energibola);
        o.agregarMovimiento(BombaGermen);
        o.agregarMovimiento(Latigazo);
        o.agregarMovimiento(Rayo);
        o.agregarMovimiento(PunoTrueno);
        o.agregarMovimiento(Trueno);
        o.agregarMovimiento(Terremoto);
        o.agregarMovimiento(TierraViva);
        o.agregarMovimiento(RocaAfilada);
        o.agregarMovimiento(JoyaDeLuz);
        o.agregarMovimiento(Avalancha);
        o.agregarMovimiento(TajoAereo);
        o.agregarMovimiento(Vendaval);
        o.agregarMovimiento(PicoTaladro);
        o.agregarMovimiento(BombaLodo);
        o.agregarMovimiento(PuyaNociva);
        o.agregarMovimiento(LanzaMugre);
        o.agregarMovimiento(Psiquico);
        o.agregarMovimiento(CabezazoZen);
        o.agregarMovimiento(Psicocorte);
        o.agregarMovimiento(OndaCertera);
        o.agregarMovimiento(ABocajarro);
        o.agregarMovimiento(Triturar);
        o.agregarMovimiento(PulsoUmbrio);
        o.agregarMovimiento(BolaSombra);
        o.agregarMovimiento(GarraUmbria);
        o.agregarMovimiento(FocoResplandor);
        o.agregarMovimiento(CabezaDeHierro);
        o.agregarMovimiento(FuerzaLunar);
        o.agregarMovimiento(Carantona);
        o.agregarMovimiento(GarraDragon);
        o.agregarMovimiento(PulsoDragon);
        o.agregarMovimiento(PunoHielo);
        o.agregarMovimiento(RayoHielo);
        o.agregarMovimiento(Ventisca);
        o.agregarMovimiento(Megacuerno);
        o.agregarMovimiento(Zumbido);
        o.agregarMovimiento(TijeraX);
        o.agregarMovimiento(Vozarron);
        o.agregarMovimiento(GolpeCuerpo);

        
        
        Serializar ser = new Serializar();
        try {
            ser.guardar(o);
            System.out.println("epa");
        } catch (IOException ex) {
            Logger.getLogger(InicializadorObj.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /*
        Serializar ser = new Serializar();
        try {
            Organizador o = ser.recuperar("organizador.obj");
            
            o.mostrarCreditos();
        } catch (IOException ex) {
            Logger.getLogger(InicializadorObj.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InicializadorObj.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
    }
}
