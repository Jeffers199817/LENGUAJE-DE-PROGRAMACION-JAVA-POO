/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulamiento;

/**
 *
 * @author JEFFERSON
 */
public class Encapsulamiento {
    
    public static void main(String[] args){
        
        Alumno alu = new Alumno();
        Alumno alu2 = new Alumno(16, " Suscribite", "Milenyum-Code");
        
        
        System.out.println("id: " + alu2.getId());
        System.out.println("nombre: " + alu2.getNombre());
        System.out.println("apellido: " + alu2.getApellido());
        
        
    }
    
}
