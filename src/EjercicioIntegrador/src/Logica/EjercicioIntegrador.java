/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica;

/**
 *
 * @author JEFFERSON
 */
public class EjercicioIntegrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();
        Squirtle squirtle = new Squirtle();
        
        
        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();
        
        charmander.atacarAraniazo();
        charmander.atacarLanzallamas();
        
        bulbasaur.atacarAraniazo();
        bulbasaur.atacarDrenaje();
        
        pikachu.atacarAraniazo();
        pikachu.atacarImpactrueno();
        
        
        
        
        
    }
    
}
