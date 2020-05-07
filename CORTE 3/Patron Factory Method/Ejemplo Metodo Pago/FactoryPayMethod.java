package Clases;

/**
 *
 * @author danie_d8mi
 */

public class FactoryPayMethod {
    
 // Creador
    
    public enum PMTypes{Paypal, CreditCard, Cash}
 
    public static PayMethod getPayMethod(PMTypes payMethod) {
        switch(payMethod) {
            case Paypal:
                return new Paypal();
            case CreditCard:
                return new CreditCard();
            case Cash:
                return new Cash();
        }
        return null;
    }
}
