
package Polimorfismo;



/**
 *
 * @author JEFFERSON
 */
public class Consultor extends Persona{
    
    String nombre_consultora;
    int num_consulto;

    public Consultor() {
    }

    public Consultor(String nombre_consultora, int num_consulto, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombre_consultora = nombre_consultora;
        this.num_consulto = num_consulto;
    }

    public String getNombre_consultora() {
        return nombre_consultora;
    }

    public void setNombre_consultora(String nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }

    public int getNum_consulto() {
        return num_consulto;
    }

    public void setNum_consulto(int num_consulto) {
        this.num_consulto = num_consulto;
    }
    
    public void saludarPersona(){ 
        System.out.println("Desde Consultor");
    }
    
    
    
}
