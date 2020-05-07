package Clases;

import java.util.HashMap;

/**
 *
 * @author danie_d8mi
 */
// La clase encargada de generar objetos a partir de los prototipos
public class FactoriaPrototipo {
    private HashMap mapaObjetos;
    private String nombrePorDefecto;

    public FactoriaPrototipo() {
        mapaObjetos = new HashMap();
        // Se incluyen al mapa todos los productos prototipo
        mapaObjetos.put("producto 1", new UnProducto(1));
    }

    public Object create() {
        return create(nombrePorDefecto);
    }

    public Object create(String nombre) {
        nombrePorDefecto = nombre;
        UnProducto objeto = (UnProducto)mapaObjetos.get(nombre);
        return objeto != null ? objeto.clone() : null;
    }
}
