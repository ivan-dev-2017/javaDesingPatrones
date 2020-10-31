package decoratorHeroe;

/**
 *
 * @author Lion
 */
public class PruebaDecoradorHeroe {

    public static void main(String[] args) {
        Heroe heroeFuerza = new HeroeFuerza();
        heroeFuerza = new EquipoScourge(heroeFuerza);
        
        Heroe heroeAgilidad = new HeroeAgilidad();
        heroeAgilidad = new EquipoSentinel(heroeAgilidad);
        
        Heroe heroeInteligencia = new HeroeInteligencia();
        heroeInteligencia = new EquipoSentinel(heroeInteligencia);
        
        System.out.println("Heroe Fuerza:"+heroeFuerza.getTipoHeroe());
        System.out.println("Heroe Fuerza:"+heroeAgilidad.getTipoHeroe());
        System.out.println("Heroe Fuerza:"+heroeInteligencia.getTipoHeroe());
    }
    
}
