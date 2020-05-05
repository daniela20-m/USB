/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author danie_d8mi
 */
public class PicantePizzaBuilder extends PizzaBuilder {

    @Override
    public void buildMasa() {
        pizza.setMasa("Cocida");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("Picante");
    }

    @Override
    public void buildRelleno() {
        pizza.setRelleno("pimienta+salchichon");
    }
    
}
