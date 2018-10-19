/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;

/**
 *
 * @author Jairo
 */
public class Policia extends Persona{
    //Atributo nuevo
    private String rango;
    //Constructor
    public Policia(String n, String a, int e, String rango) {
        super(n, a, e);
        setRango(rango);
    }
    //Getter y Setter
    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
    
    @Override
   public String toString(){
    
        return String.format("%s - Rango %s", super.toString(), getRango());
    } 
}
