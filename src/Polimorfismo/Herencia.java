
package Polimorfismo;

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
        
        Persona vector[] = new Persona[4];
        vector[0]= new Persona(1,"4321334","Jefferson","Alquinga","Puembo","0962857715");
        vector[1]= new Empleado();
        vector[2]= new Consultor();
        vector[3]= new Jefe();
        
         
        
        for( int i = 0; i<vector.length ; i++)
        {
     
        
        System.out.println( "Contenido : vector [" + i + "]: " + vector[i]);
       
            vector[i].saludarPersona();
        
        //Instancia de Persona
        
        vector[0].setApellido("Coloma");
        vector[0].setNombre("Erick");
        vector[0].setDomilicio("Yaruqui");
            
        //INSTANCIA DE EMPLEADO 
        if (vector[i] instanceof Empleado) { 
        Empleado empleado = (Empleado) vector[i]; // Casting a Empleado
        empleado.setNum_legajo(12345); // Llamar al método setNum_legajo
        empleado.setNombre("Maria");
        empleado.setApellido("SantaCruz");
        empleado.setDomilicio("Quito");
        empleado.setTelefono("0962857715");
        System.out.println("El numero de legajo es: " + empleado.getNum_legajo() );
        }
        
        //INSTANCIA DE CONSULTOR
        
        
        if( vector[i] instanceof Consultor){
            Consultor consultor = (Consultor) vector[i];
            consultor.setApellido("Simbaña");
             consultor.setNombre("edison");
        consultor.setDomilicio("Tumbaco");
        consultor.setTelefono("02345345715");
        }
        
        
        
        //INSTANCIA DEL JEFE
            
             if( vector[i] instanceof Jefe){
            Jefe Jef = (Jefe) vector[i];
            Jef.setApellido("SantaCruz");
             Jef.setNombre("Alisson");
        Jef.setDomilicio("Cumbaya");
        Jef.setTelefono("02345345715");
        }
        
  
            
        
        
       
        }
        
        
        
        for(int j = 0; j<vector.length; j++){
            
      System.out.println( "Contenido : vector [" + j + "]: " + vector[j]);
        }
        
                
                
    }
    
}
