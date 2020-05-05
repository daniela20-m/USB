package Builder;

/**
 *
 * @author danie_d8mi
 */

/*
Se caracteriza por tener a un atributo de la clase producto, asi mismo tiene metodos concretos y metodos abstractos(asignar 
valores pero no les da un cuerpo
*/

//Abstract builder
public abstract class PizzaBuilder {
    protected Pizza pizza;
    
    public Pizza getPizza(){
        return pizza;
    }
    
    public void crearNuevaPizza() {
        pizza = new Pizza();
    }
    
    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void buildRelleno();
    
}
