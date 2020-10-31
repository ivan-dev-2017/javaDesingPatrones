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
public class EquipoScourge extends HeroeDecorador{
    private final Heroe heroe;
    
    public EquipoScourge(Heroe heroe){
        this.heroe = heroe;
    }
    
    @Override
    public String getTipoHeroe(){
        return heroe.getTipoHeroe()+addEquipoScourge();
    }     
    
    public String addEquipoScourge(){
        return " Equipo Scourge";
    }    
}
