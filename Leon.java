package principio4;

/**
 *
 * @author danie
 */
public class Leon implements Animal, Mamifero{

    @Override
    public void sound() {
        System.out.println("Nace de la leona");
    }

    @Override
    public void sleep() {
        System.out.println("Grrr");
    }

    @Override
    public void nacimiento_mama() {
        System.out.println("Duerme de día");
    }
    
}
