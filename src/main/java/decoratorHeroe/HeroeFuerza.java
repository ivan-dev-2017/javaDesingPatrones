package decoratorHeroe;

/**
 *
 * @author Lion
 */
public class HeroeFuerza implements Heroe{
    private String tipoHeroe = "Fuerza";
    
    @Override
    public String getTipoHeroe(){
        return tipoHeroe;
    }
    
}
