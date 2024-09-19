/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces1;

/**
 *
 * @author JEFFERSON
 */
public class Circulo implements Figura,Dibujable,Rotable{
    
    private double radio;
    
    public Circulo(){
        
    }
    
    public Circulo(double radio){
        this.radio=radio;
    }
    
    
    
    @Override
    public double calcularArea(){
        double pi=3.14;
        double resultado = radio*pi;
        return resultado;
    }
    
    
    @Override 
    public void dibujar(){ 
        
        System.out.println("Hola, estoy rotando un circulo");
        
    }
    
    @Override
    public void rotar(){ 
        System.out.println("Hola, Estoy rotando");
    }
}
