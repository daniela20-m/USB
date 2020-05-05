package principio2_O;

/**
 * Super Clase
 * @author Sebastian
 */
public abstract class Animal {

    /**
     * Clase abstracta: Es otro tipo de clase en JAVA para hacer HERENCIA, Lleva
     * la palabra reservada ABSTRACT, Llevan metodos abstractos, Una clase
     * abstracta no puede ser usada para crear objetos, Sirve para tener un
     * modelo de cómo debe ser una clase, Define el comportamiento de clases.
     */
    /**
     * Metodos abstractos Los métodos abstractos no tiene cuerpo, el cuerpo se
     * lo dan los hijos el cual le dan la funcionalidad
     */
    public abstract void dormir();

    public abstract void comer();

    /**
     * Métodos regular
     */
    public void jugar() {
        System.out.println("Juego con mi mascota");
    }
    public void volar(){
        System.out.println("Animal volando");
    }
}
