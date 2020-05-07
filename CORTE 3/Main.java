package Clases;

/**
 *
 * @author danie_d8mi
 */

class Main {
    
    public static void main(String[] args) {
        PayMethod payMethod = FactoryPayMethod.getPayMethod(FactoryPayMethod.PMTypes.Paypal);
 
        System.out.println(payMethod.pay()); // Pagando con Paypal
    }
}
