/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author mac
 */
public class Persona implements Cloneable {
    private String nombre;
    private int edad;    

public Persona(String nombre, int edad){
    this.nombre=nombre;
    this.edad=edad;
    
}   

public int getEdad(){
    return edad;
}
public void setEdad(int edad){
    this.edad=edad;
    
}   

public String getNombre(){
    return nombre;
}

public void setNombre(String nombre){
    this.nombre=nombre;
}

    @Override
    public String toString() {
        return "Persona{" + "nombre= " + nombre + ", [ " + edad + " ]}";
    }
    
//@Override
//protected Persona clone(){
//    return new Persona(nombre, edad);
//}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        
        Object obj =null;
        try{
            obj= super.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("Imposible modificar la persona");
        }
        return obj; //To change body of generated methods, choose Tools | Templates.
    }
    
}
