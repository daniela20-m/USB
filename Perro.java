package principio2;

/*
Padre es Animal
Hijo Perro
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
