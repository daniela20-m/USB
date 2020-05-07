package Clases;

/**
 *
 * @author danie_d8mi
 */

// Producto Concreto Paypal

public class Paypal implements PayMethod {
    
    @Override
    
    public String pay() {
        return "Pagando con Paypal";
    }
}
