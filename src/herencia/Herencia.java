/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

/**
 *
 * @author JEFFERSON
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Persona  per = new Persona(1,"23423"," Jefferson", "aqluinga", " Puembo"," 234234234");
        
        Empleado emple  = new Empleado();
        
        emple.getNum_legajo();
        emple.setNombre("Jefferson43");
        
        System.out.println("Nombre es: " +  emple.getNombre());
        
        System.out.println("Nombre es: " +  per.getNombre());
 
        
        
        emple.saludarPersona();
        emple.saludarEmpleado();
        
        Consultor consul = new Consultor();
        
        consul.getNum_consulto();
        consul.getNombre();
        
        consul.saludarPersona();
        consul.saludarConsultor();

                
        
        Jefe jefe1 = new Jefe();
        jefe1.saludarJefe();
        
        
         System.out.println("Nombre es: " +  per.getNombre());
        
                
                
    }
    
}
