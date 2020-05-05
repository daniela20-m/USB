package Builder;

/**
 *
 * @author danie_d8mi
 */

/*
Heredad de pizzaBuilder, ya que es el mas general
*/

// Concrete builder
public class HawaianaPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildMasa() {
        pizza.setMasa("Suave");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("Dulce");
    }

    @Override
    public void buildRelleno() {
        pizza.setRelleno("chorizo+alcachofas");
    }
    
}
