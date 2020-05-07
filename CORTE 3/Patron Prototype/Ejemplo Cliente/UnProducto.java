/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author danie_d8mi
 */

// Un ejemplo basico de producto
public class UnProducto implements Producto {
private int atributo;

UnProducto(int atributo) {
this.atributo = atributo;
}

public Object clone() {
return new UnProducto(this.atributo);
}

public String toString() {
return ((Integer)atributo).toString();
}
}
