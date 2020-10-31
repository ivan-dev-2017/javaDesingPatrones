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
public class HeroeAgilidad implements Heroe{
    private String tipoHeroe = "Agilidad";    
    
    @Override
    public String getTipoHeroe(){
        return tipoHeroe;
    }      
    
}
