/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ClaAbstractas;

/**
 *
 * @author JEFFERSON
 */
public class ClaAbstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Cuadrado cuadrad = new Cuadrado(12,1,3);
       
        Double resultadoC= cuadrad.calcularArea();
        System.out.println("El area de un cuadrado es:" + resultadoC );
        
        Circulo circul = new Circulo(4,5,3);
        System.out.println("El area de un circulo es : " + circul.calcularArea());
       
        
    }
    
}
