/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author JEFFERSON
 */
public class Charmander extends Pokemon implements IFuego {

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
      System.out.println("Hola soy Charmander y este es mi ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Charmander y este es mi ataque Araniazo");
    }

    @Override
    protected void atacarMordisco() {
       System.out.println("Hola soy Charmander y este es mi ataque Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander y este es mi ataque Punio Fuego");
    }

    @Override
    public void atacarLanzallamas() {
       System.out.println("Hola soy Charmander y este es mi ataque Lanza LLamas");
    }

    @Override
    public void atacarAscuas() {
       System.out.println("Hola soy Charmander y este es mi ataque Ascuas");
    }

    
}
