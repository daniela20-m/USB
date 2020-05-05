package Builder;

/**
 *
 * @author danie_d8mi
 */

/*
PizzaBuilder es el abstract builder uso del polimorfismo y el objeto que se recibe puede ser un hawaiana 
o picante ya que son clases hijas
*/

// Clase director
public class Cocina {
    private PizzaBuilder pizzaBuilder;
    
    public void setpizzaBuilder(PizzaBuilder pb){
        pizzaBuilder = pb;
    }
    
   public Pizza getPizza(){
       return pizzaBuilder.getPizza();
   }
   
   public void construirPizza(){
       pizzaBuilder.crearNuevaPizza(); //instanciar el objeot pizza
       pizzaBuilder.buildMasa();
       pizzaBuilder.buildSalsa();
       pizzaBuilder.buildRelleno();
   }
}
