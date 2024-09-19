/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaAbstractas;

/**
 *
 * @author JEFFERSON
 */
public abstract class Figura {
    
    protected double x; // pos en x
    protected double y; // pos en y 
    
    
    protected Figura(){
        
    }
    
    protected Figura(double x, double y){
        this.x=x;
        this.y=y;
    }
    
    
    public abstract double calcularArea();
    
    
    public abstract double calcularPerimetro();
    
    
}
