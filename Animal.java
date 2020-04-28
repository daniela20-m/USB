package principio4;

/**
 *
 * Palbra reservada interface
 * Otra manera de hacer herencia
 * Metodos pueden no tener cuertpo = el cuerpo se lo da los hijos que tenga por polimorfismo
 * @Override (Sobre escritura)
 * Atributos de un interface, public, static, final
 * Un interface no tiene constructo
 * Es clase no se puede instanciar para crear onjetos
 * 
 * USO. JAVA NO EXITE HERENCIA MULTIPLE, interface, implements, etc
 *  1. Principio SOLID
 *  2. Asegura seguridad: declaro los metodos que toca usarse
 *  3. 'Implements' de varias clases
 */
public interface Animal {
    public void sound();
    public void sleep();
    
    public static void comer(){
        System.out.println("Animal come");
    }
    /**
     * 
     */
    
    
}
