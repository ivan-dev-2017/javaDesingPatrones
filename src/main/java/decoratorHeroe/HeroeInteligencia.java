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
public class HeroeInteligencia implements Heroe{
    private String tipoHeroe = "Inteligencia";    
    
    @Override
    public String getTipoHeroe(){
        return tipoHeroe;
    }    
}
