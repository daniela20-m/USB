package principio4_I;

/**
 *
 * @author Sebastian
 */
public class Leon implements Animal, Mamifero {

    @Override
    public void sound() {
        System.out.println("Grrrrrrrr");
    }

    @Override
    public void sleep() {
        System.out.println("Duerme de dia");
    }

    @Override
    public void nacimiento_mama() {
        System.out.println("Nace de la leona");
    }

}
