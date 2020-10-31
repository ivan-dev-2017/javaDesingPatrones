/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorHeroe;

/**
 *
 * @author Lion
 */
public class EquipoSentinel extends HeroeDecorador{
    private final Heroe heroe;
    
    public EquipoSentinel(Heroe heroe){
        this.heroe = heroe;
    }
    
    @Override
    public String getTipoHeroe(){
        return heroe.getTipoHeroe()+addEquipoSentinel();
    }     
    
    public String addEquipoSentinel(){
        return " Equipo Sentinel";
    }
    
    
}
