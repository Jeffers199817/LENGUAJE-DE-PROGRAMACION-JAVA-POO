/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaAbstractas;

/**
 *
 * @author JEFFERSON
 */
public class Cuadrado extends Figura {
    
    private Double lado;
    
    public Cuadrado(){
        
    }

    public Cuadrado(double lado,double x , double y ){
        super(x,y);
        this.lado=lado;
        
    }

    @Override
    public double calcularArea() {
    double resultado = lado*lado;
    return resultado;
    }

    @Override
    public double calcularPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
