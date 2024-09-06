/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulamiento;

/**
 *
 * @author JEFFERSON
 */
public class Alumno {
    
    
    private int id;
    private String nombre;
    private String apellido;
    
    public Alumno(){ 
        
        
    }
        
    public Alumno(int id, String nombre, String apellido){
            this.id =id;
            this.nombre=nombre;
            this.apellido=apellido;
        }
    
    
    public void setId(int id){
        
        this.id = id;
        
    }
    
    public int getId(){
        
        return id;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
            
    public String getApellido(){
        return apellido;
    }       
            
            
}
