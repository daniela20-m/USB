package Main;


import Builder.*;
/**
 *
 * @author danie_d8mi
 */
public class Principal {
    public static void main (String [] args){
        Cocina cocina = new Cocina(); // Director
        PizzaBuilder hawaianaBuilder = new HawaianaPizzaBuilder();
        PizzaBuilder picanteBuilder = new PicantePizzaBuilder();
        
        cocina.setpizzaBuilder(hawaianaBuilder);
        cocina.construirPizza();
        
        Pizza pizza = cocina.getPizza();
    }
}
