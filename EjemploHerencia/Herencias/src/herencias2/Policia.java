/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

/**
 *
 * @author Usuario
 */
public class Policia extends Persona{
    
    private String rango;
    
    public Policia(String n, String a,  int e, String r){
        super(n, a, e);
        establecerRango(r);
    }
    
    public void establecerRango(String r){
        rango = r;
    }
    
    public String obtenerRango(){
        return rango;
    }
    
     @Override
    public String toString(){
        
        return String.format("%s - %s", super.toString(),
                obtenerRango());
    }
}
