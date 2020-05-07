package Clases;

/**
 *
 * @author danie_d8mi
 */

// Producto Concreto Cash

public class Cash implements PayMethod {
    
    @Override
     
    public String pay() {
        return "Pagando con Cash";
    }
}
