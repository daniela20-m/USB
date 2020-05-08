package principio2_O;

/**
 * Interfaz
 *
 * @author Sebastian
 */
public class Principal {

    public static void main(String[] args) {
        /**
         * Se puede llamar a los métodos de la clase padre o de los abuelos
         */
        Perro jake = new Perro();
        jake.jugar();
        jake.comer();
        jake.dormir();
    }
}
