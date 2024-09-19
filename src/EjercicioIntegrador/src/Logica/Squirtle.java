
package Logica;


public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
System.out.println("Hola soy Squirtle y este es mi ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Squirtle y este es mi ataque Araniazo");
    }

    @Override
    protected void atacarMordisco() {
         System.out.println("Hola soy Squirtle y este es mi ataque Mordisco");
    }

    @Override
    public void atacarHidrobomba() {
     System.out.println("Hola soy Squirtle y este es mi ataque Hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtle y este es mi ataque Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
System.out.println("Hola soy Squirtle y este es mi ataque Pistola Agua");
    }
    
    
}
