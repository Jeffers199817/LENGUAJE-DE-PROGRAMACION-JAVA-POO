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
        
        Empleado emple  = new Empleado();
        
        emple.getNum_legajo();
        emple.getNombre();
        
        emple.saludarPersona();
        emple.saludarEmpleado();
        
        Consultor consul = new Consultor();
        
        consul.getNum_consulto();
        consul.getNombre();
        
        consul.saludarPersona();
        consul.saludarConsultor();

                
        
        Jefe jefe1 = new Jefe();
        jefe1.saludarJefe();
        
        
        
        
                
                
    }
    
}
