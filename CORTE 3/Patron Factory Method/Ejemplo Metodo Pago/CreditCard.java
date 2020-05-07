package Clases;

/**
 *
 * @author danie_d8mi
 */

// Producto Concreto CreditCard

public class CreditCard implements PayMethod {
    
    @Override
    
    public String pay() {
        return "Pagando con tarjeta crédito";
    }
}
