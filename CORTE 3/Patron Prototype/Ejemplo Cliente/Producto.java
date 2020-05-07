package Clases;

/**
 *
 * @author danie_d8mi
 */

// Los productos deben implementar esta interface

public interface Producto extends Cloneable {
    
    Object clone();
// Aqui van todas las operaciones comunes a los productos que genera la factoria
}
