package main.java.com.pml.appPookemon.datos.torneo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import main.java.com.pml.appPookemon.datos.pookemon.model.Efecto;
import main.java.com.pml.appPookemon.datos.pookemon.model.EfectoEnvenenamiento;
import main.java.com.pml.appPookemon.datos.pookemon.model.EfectoParalisis;
import main.java.com.pml.appPookemon.datos.pookemon.model.EfectoQuemadura;
import main.java.com.pml.appPookemon.datos.pookemon.model.Movimiento;
import main.java.com.pml.appPookemon.datos.pookemon.model.MovimientoEspecial;
import main.java.com.pml.appPookemon.datos.pookemon.model.MovimientoFisico;
import main.java.com.pml.appPookemon.datos.pookemon.model.Pookemon;
import main.java.com.pml.appPookemon.datos.registro.model.Entrenador;


public class Torneo implements Serializable{

    private ArrayList<Entrenador> jugadores = new ArrayList<>();
    private ArrayList<Pookemon> pookemones = new ArrayList<>();
    private ArrayList<Movimiento> movimientos = new ArrayList<>();
    private ArrayList<Batalla> batallas = new ArrayList<>();
    private NodoTorneo ganador = new NodoTorneo(null);
    private NodoTorneo actual;
    private int idtorneo;
    private Recompensa premio;

    public Torneo() {
        agregarPookemonesPorDefecto();
    }

   
    public int getIdtorneo() {
        return idtorneo;
    }
    
    public void addJugador(Entrenador e){
        jugadores.add(e);
    }
    
    public void addPookemon(Pookemon x){
        pookemones.add(x);
    }

    public ArrayList<Pookemon> getPookemones() {
        return pookemones;
    }
    
    public void editarNombrePookemon(int idPookemon_p, String nuevoNombre){
        for (Pookemon p : pookemones) {
            if(p.getIdPookemon() == idPookemon_p){
                p.setNombrePookemon(nuevoNombre);
            }
        }
    }
    
    public void editarElementoPookemon(int idPookemon_p, String nuevoElemento){
        for (Pookemon p : pookemones) {
            if(p.getIdPookemon() == idPookemon_p){
                p.setElementoPookemon(nuevoElemento);
            }
        }
    }
    
    public void editarEfectoPookemon(int idPookemon_p, Efecto nuevoEfecto){
        for (Pookemon p : pookemones) {
            if(p.getIdPookemon() == idPookemon_p){
                p.setEfecto(nuevoEfecto);
            }
        }
    }
    
    public void eliminarPookemon(String pookemon){
        for (int i = 0; i < pookemones.size(); i++) {
            if(pookemones.get(i).getNombrePookemon().equalsIgnoreCase(pookemon)){
                pookemones.remove(i);
            }          
        }
    }
    
    public void addMovimiento(Movimiento x){
        movimientos.add(x);
    }
    
    
    
    public void eliminarMovimiento(String movimiento){
        for (int i = 0; i < movimientos.size(); i++) {
            if(movimientos.get(i).getNombreMovimiento().equalsIgnoreCase(movimiento)){
                movimientos.remove(i);
            }
            
        }
    }
    
    public void editarMovimiento(int id_movimiento_p, String newNombre, String newDescripcion, int newPotencia, int newPrecision, int newCantidadPP, String newElemento, Efecto newEfecto){
        for (Movimiento m : movimientos) {
            if(m.getIdMovimiento() == id_movimiento_p){
                if(newNombre != null){
                    m.setNombreMovimiento(newElemento);
                }
                if(newDescripcion != null){
                    m.setDescripcionMovimiento(newDescripcion);
                }
                if(newPotencia != 0){
                    m.setPotencia(newPotencia);
                }
                if(newPrecision != 0){
                    m.setPrecision(newPrecision);
                }
                if(newCantidadPP != 0){
                    m.setCantidadPP(newCantidadPP);
                }
                if(newElemento != null){
                    m.setElemento(newElemento);
                }
                if(newEfecto != null){
                    m.setEfecto(newEfecto);
                }
            }
        }
    }
    
    public String toStringPookemones() {
        String lis = "Lista de pookemones:\n";
        
        for (Pookemon p : pookemones) {
            lis +="- " + p.toString()+ "\n";
        }

        return lis;
    }
    
    public String toStringMovimientos() {
        String lis = "Lista de movimientos:\n";
        
        for (Movimiento m : movimientos) {
            lis +="- " + m.toString()+ "\n";
        }

        return lis;
    }

    
    public String toStringJugadores() {
        String lis = "Lista de jugadores:\n";
        
        for (Entrenador entrenador : jugadores) {
            lis +="- " + entrenador.getNombreEntrenador() + "\n";
        }

        return lis;
    }

    /**
     * @return the movimientos
     */
    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    /**
     * @param movimientos the movimientos to set
     */
    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }


    public void darPremio(Recompensa a){
        for (Entrenador entrenador : jugadores) {
            entrenador.añadirPremios(a);
         }                  
    }

    //ajustar logica aunque los jugadores sean par no cumple con arbol binario
    public void crearTorneo(){
        actual = ganador;
        if(numeroDeJugadoresPermitido()){
            ganador = construirTorneo(0, jugadores.size()-1);
        }else{
            System.out.println("No se pudo crear el torneo (Numero de jugadores no permitidos)");
        }    
        
    }

    private NodoTorneo construirTorneo(int inicio, int fin) {
        if(inicio == fin){
            NodoTorneo nodo = new NodoTorneo(jugadores.get(inicio));
            return nodo;
        }

        int medio = (inicio+fin)/2;

        NodoTorneo izquierdo = construirTorneo(inicio, medio);
        NodoTorneo derecho = construirTorneo(medio + 1 , fin);

        NodoTorneo padre = new NodoTorneo(null);
        padre.setIzquierda(izquierdo);
        padre.setDerecha(derecho);

        return padre;
    }

    public Entrenador[] siguienteBatalla(){
        actual = buscarBatalla(ganador);
        if(actual != null){
            return new Entrenador[]{actual.getIzquierda().getEntrenador(), actual.getDerecha().getEntrenador()};
        }
        return null;
    }

    private NodoTorneo buscarBatalla(NodoTorneo n){
        if(n.esHoja() || n.getEntrenador() != null){
            return null;
        }

        NodoTorneo izq = n.getIzquierda();
        NodoTorneo der = n.getDerecha();

        if(izq.getEntrenador() != null && der.getEntrenador() != null && n.getEntrenador() == null){
            return n;
        }

        NodoTorneo batallaIzquierda = buscarBatalla(izq);
        if(batallaIzquierda != null){
            return batallaIzquierda;
        }
        return buscarBatalla(der);
    }

    public void setGanador(Entrenador e){
        if(actual != null){
            actual.setEntrenador(e);
            actual = null;
        } else {
            System.out.println("Error: no hay batalla activa");
        }
    }
    
    public Batalla buscarBatalla(int idBatalla_p){
        for (Batalla b : batallas) {
            if(b.getId() == idBatalla_p){
                return b;
            }
        }
        return null;
    }
            
    public void crearRecompensa(Recompensa pre){
        premio =   pre;      
    }
    
    public Recompensa  getPremio(){
        return premio; 
    }    


    private boolean numeroDeJugadoresPermitido(){
        int n = jugadores.size();
        return n > 0 && (n & (n -1 )) == 0;
    }
    

    public NodoTorneo getGanador() {
        return ganador;
    }
    
    public String buscarElementoPookemon(String nombreBuscado) {
        for (Pookemon pookemon : pookemones) {
            if(pookemon.getNombrePookemon().equalsIgnoreCase(nombreBuscado)){
                return pookemon.getElementoPookemon();
            }
        }
        return null;
    }

    public String buscarElementoMovimiento(String nombreBuscado) {
        for (Movimiento movimiento : movimientos) {
            if(movimiento.getNombreMovimiento().equalsIgnoreCase(nombreBuscado)){
                return movimiento.getElemento();
            }
        }
        return null;
    }

    public String buscarTipoMovimiento(String nombreBuscado) {
        for (Movimiento movimiento : movimientos) {
            if(movimiento.getNombreMovimiento().equalsIgnoreCase(nombreBuscado)){
                return movimiento.getTipoMovimiento();
            }
        }
        return null;
    }
    
    public Pookemon buscarPokemonPorNombre(String nombreBuscado){
        for (Pookemon pookemon : pookemones) {
            if(pookemon.getNombrePookemon().equalsIgnoreCase(nombreBuscado)){
                return pookemon;
            }
        }
        return null;
    }
    
    public Movimiento buscarMovimientoPorNombre(String nombreBuscado){
        for (Movimiento movimiento : movimientos) {
            if(movimiento.getNombreMovimiento().equalsIgnoreCase(nombreBuscado)){
                return movimiento;
            }
        }
        return null;
    }
    
    public void agregarPookemonesPorDefecto(){
        pookemones.addAll(pookemonesPorDefectos());
    }
    
    private ArrayList<Pookemon> pookemonesPorDefectos() {
        EfectoQuemadura quemadura = new EfectoQuemadura();
        EfectoEnvenenamiento envenenamiento = new EfectoEnvenenamiento();
        EfectoParalisis paralisis = new EfectoParalisis();
        
        Pookemon Roserade = new Pookemon(407, "Roserade", "planta");
        Roserade.inicializarEstadistica(60, 70, 65, 125, 105, 90);

        Pookemon Venusaur = new Pookemon(3, "Venusaur", "planta");
        Venusaur.inicializarEstadistica(80, 82, 83, 100, 100, 80);

        Pookemon Typhlosion = new Pookemon(157, "Typhlosion", "fuego");
        Typhlosion.inicializarEstadistica(78, 84, 78, 109, 85, 100);

        Pookemon Gyarados = new Pookemon(130, "Gyarados", "agua");
        Gyarados.inicializarEstadistica(95, 125, 79, 60, 100, 81);

        Pookemon Milotic = new Pookemon(350, "Milotic", "agua");
        Milotic.inicializarEstadistica(95, 60, 79, 100, 125, 81);

        Pookemon Greninja = new Pookemon(658, "Greninja", "agua");
        Greninja.inicializarEstadistica(72, 95, 67, 103, 71, 122);

        Pookemon Raichu = new Pookemon(26, "Raichu", "electrico");
        Raichu.inicializarEstadistica(60, 90, 55, 90, 80, 110);

        Pookemon Nidoking = new Pookemon(34, "Nidoking", "veneno");
        Nidoking.inicializarEstadistica(81, 102, 77, 85, 75, 85);

        Pookemon Alakazam = new Pookemon(65, "Alakazam", "psiquico");
        Alakazam.inicializarEstadistica(55, 50, 45, 135, 95, 120);

        Pookemon Hypno = new Pookemon(97, "Hypno", "psiquico");
        Hypno.inicializarEstadistica(85, 73, 70, 73, 115, 67);

        Pookemon Lucario = new Pookemon(448, "Lucario", "lucha");
        Lucario.inicializarEstadistica(70, 110, 70, 115, 70, 90);

        Pookemon Tyranitar = new Pookemon(248, "Tyranitar", "roca");
        Tyranitar.inicializarEstadistica(100, 134, 110, 95, 100, 61);

        Pookemon Gengar = new Pookemon(94, "Gengar", "fantasma");
        Gengar.inicializarEstadistica(60, 65, 60, 130, 75, 110);

        Pookemon Clefable = new Pookemon(36, "Clefable", "hada");
        Clefable.inicializarEstadistica(95, 70, 73, 95, 90, 60);

        Pookemon Snorlax = new Pookemon(143, "Snorlax", "normal");
        Snorlax.inicializarEstadistica(160, 110, 65, 65, 110, 30);

        Pookemon Blissey = new Pookemon(242, "Blissey", "normal");
        Blissey.inicializarEstadistica(255, 10, 10, 75, 135, 55);

        Pookemon Dragonite = new Pookemon(149, "Dragonite", "dragon");
        Dragonite.inicializarEstadistica(91, 134, 95, 100, 100, 80);

        Pookemon Heracross = new Pookemon(214, "Heracross", "bicho");
        Heracross.inicializarEstadistica(80, 125, 75, 40, 95, 85);

        Pookemon Volcarona = new Pookemon(637, "Volcarona", "bicho");
        Volcarona.inicializarEstadistica(85, 60, 65, 135, 105, 100);

        Pookemon Metagross = new Pookemon(376, "Metagross", "acero");
        Metagross.inicializarEstadistica(80, 135, 130, 95, 90, 70);

        Pookemon Excadrill = new Pookemon(530, "Excadrill", "tierra");
        Excadrill.inicializarEstadistica(110, 135, 60, 50, 65, 88);

        Pookemon Hydreigon = new Pookemon(635, "Hydreigon", "siniestro");
        Hydreigon.inicializarEstadistica(92, 105, 90, 125, 90, 98);

        Pookemon Staraptor = new Pookemon(398, "Staraptor", "volador");
        Staraptor.inicializarEstadistica(85, 120, 70, 50, 60, 100);

        Pookemon Lapras = new Pookemon(131, "Lapras", "hielo");
        Lapras.inicializarEstadistica(130, 85, 80, 85, 95, 60);

        Pookemon Weavile = new Pookemon(461, "Weavile", "hielo");
        Weavile.inicializarEstadistica(70, 120, 65, 45, 85, 125);

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

        return new ArrayList<>(Arrays.asList(Roserade,Venusaur, Typhlosion, Gyarados, Milotic, Greninja, Raichu,
        Nidoking,Alakazam,Hypno,Lucario, Tyranitar,Gengar, Clefable, Snorlax, Blissey, Dragonite, Heracross,
        Volcarona, Metagross, Excadrill, Hydreigon, Staraptor, Lapras, Weavile));
        

    }
}
