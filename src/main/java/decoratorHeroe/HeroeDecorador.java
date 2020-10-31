package decoratorHeroe;

/**
 *
 * @author Lion
 */
public abstract class HeroeDecorador implements Heroe{
    @Override
    public String getTipoHeroe(){
        return "Atributos";
    }
    
}
