/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaAbstractas;

/**
 *
 * @author JEFFERSON
 */
public class Circulo extends Figura{
    

    private double radio;
    
    public Circulo(){
        
    }
    
    public Circulo(double radio, double x, double y){
        super(x,y);
        this.radio =radio;
        
    }

    @Override
    public double calcularArea() {
        double resultado = Math.PI*(radio*radio);
        return resultado;
    }
    
    
    
    
}
