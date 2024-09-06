
package Polimorfismo;
/**
 *
 * @author JEFFERSON
 */
public class Persona {
    
    int id;
    String dni;
    String nombre;
    String apellido;
    String domicilio;
    String telefono;
    
    public Persona(){
        
    }
    
    public Persona(int id, String dni, String nombre, String apellido, String domicilio, String telefono){
        
        this.id=id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.telefono = telefono;
        
        
    }
    
    
    public void setId(int id){
        this.id=id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setDni(String dni){
        this.dni=dni;
        
    }
    
    public String getDni(){
        
        return dni;
    }
    
    public void setNombre(String nombre){ 
        this.nombre = nombre;
    }
    
    public String getNombre(){
        
        return nombre;
    }
    
    public void setApellido(String apellido){ 
        this.apellido = apellido;
    }
    
    public String getApellido(){ 
        return apellido;
    }
    
    public void setDomilicio(String domicilio){ 
        this.domicilio = domicilio;
        
    }
    
    public String getDomicilio(){ 
        return domicilio;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
        
    }
    public String getTelefono(){
        return telefono;
    }
    
    
    public void saludarPersona(){ 
        System.out.println("Desde Persona");
    }
    
    
    public String toString() {
        return "Persona [ID: " + id + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Domicilio: " + domicilio + ", Teléfono: " + telefono + "]";
    }
}
