/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica;

/**
 *
 * @author JEFFERSON
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alumno estudiante1 = new Alumno();
     Alumno estudiante= new Alumno( 1,"Jefferson", "Alquinga");
     
     
     
     estudiante.mostraNombre();
     estudiante.saberAprobado(7);
     
        System.out.println("La id del alumno 2: " + estudiante.getId());
        int idNuevo= 2;
        estudiante.setId(idNuevo);
        System.out.println("El nuevo id es: "+ estudiante.getId());
        
        System.out.println("======================================");
        System.out.println("Datos del alumno 1 son:");
        System.out.println(" id: "+ estudiante1.id+ " nombre: " + estudiante1.nombre + " apellido: " + estudiante1.apellido );
        
        System.out.println("Seteamos los datos del alumno1 ");
        
        estudiante1.setId(1);
        estudiante1.setNombre("Jefferson1");
        estudiante1.setApellido("chuquimarca1");
        
         System.out.println("======================================");
        System.out.println("Datos del alumno 1 actualizados son:");
        System.out.println(" id: "+ estudiante1.id+ " nombre: " + estudiante1.nombre + " apellido: " + estudiante1.apellido );
        
    }
    
}
