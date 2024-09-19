/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interfaces1;

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
        
        
        Circulo cir = new Circulo(23);
        
        
        System.out.println("CONTINUEMOS CON EL CIRCULO");
        
        System.out.println("El area del circulo es: " + cir.calcularArea());
        
        System.out.println("Dibujar el circulo: ");
        
        cir.dibujar();
        
        System.out.println("Rotar figura:");
        
        cir.rotar();
        
        
        System.out.println("CONTINUEMOS CON EL CUADRADO");
        
        Cuadrado cu = new Cuadrado( 32);
        
        
        System.out.println("El area del cuadrado es : " + cu.calcularArea() );
        System.out.println("Pintar");
        cu.dibujar();
        
        
        System.out.println("Finalizar todo.");
        
        
    }
    
}
