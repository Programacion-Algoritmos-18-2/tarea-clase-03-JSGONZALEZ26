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
public class Docente extends Persona{
    private double sueldo;
    public Docente(String n, String a, int e, double z) {
        super(n, a, e);        
        setSueldo(z);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double z) {
        this.sueldo = z;
    }
    @Override
    public String toString(){
    
        return String.format("%s - Sueldo %.2f", super.toString(), getSueldo());
    }
}
