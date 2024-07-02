/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author JEFFERSON
 */
public class Alumno {
    
    int id;
    String nombre;
    String apellido;
    
    
    
    //Métodos son metodos con verbor en infinivos
    //Constructor Vacio
    public Alumno(){ 
        
        
    }
    
    //Contructor lleno
    public Alumno(int id, String nombre, String apellido){ 
        this.id = id;
        this.nombre=nombre;
        this.apellido = apellido;
        
    }
    
    public int getId(){
        return id;
    }
    
    
    public void setId( int id){
        
        this.id=id;
        
    }
    
    
    public String getNombre(){
        return nombre;
    }
    
    
    public void setNombre(String nombre){
        this.nombre=nombre;
        
    }
    
    
    public String getApellido(){
        return apellido;
    }
    
    
    public void setApellido(String apellido){
         this.apellido = apellido;
    }
    
    
    
    public void mostraNombre(){
        System.out.println("su nombre es:" + nombre);

    }
    
    public void saberAprobado (double calificacion){
        
        if(calificacion >=6){
            System.out.println("Aprobé la materia");
        }
        else{
            System.out.println("Uy no aprobé");
        }
    }
    
}
