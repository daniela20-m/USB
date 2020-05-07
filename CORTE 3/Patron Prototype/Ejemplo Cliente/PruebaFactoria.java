package Clases;

/**
 *
 * @author danie_d8mi
 */
public class PruebaFactoria {
    static public void main(String[] args) {
        
    FactoriaPrototipo factoria = new FactoriaPrototipo();
    
    Producto producto = (Producto) factoria.create("Producto 1");
    
        System.out.println ("Este es el objeto creado: " + producto);
}
}
