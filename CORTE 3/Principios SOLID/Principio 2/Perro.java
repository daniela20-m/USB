package principio2_O;

/** 
 * Subclase
 * Padre es animal, perro es hijo
 * @author Sebastian
 */
public class Perro extends Animal {

    @Override
    public void dormir() {
        System.out.println("Perro durmiendo");
    }

    @Override
    public void comer() {
        System.out.println("Perro comiendo");
    }
    
}
