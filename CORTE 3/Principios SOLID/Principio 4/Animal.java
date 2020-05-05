package principio4_I;

/**
 * Interface: Otra manera de hacer herencia Los métodos no tienen cuerpo, el
 * body se lo dan las hijas que heredan por polimorfismo Aplica principio de
 *
 * @Override cuando las hijas heredan Atributos de una interface son public,
 * static, final Una interface no tiene constructor Esta clase no se puede
 * instanciar para crear objetos
 *
 * Uso: En Java no existe herencia múltiple, para solventarlo utiliza
 * interfaces. [Implements]
 *
 * ¿Por qué y cuándo se usa? - Cuarto Principio solid - Para asegurar seguridad
 * : delcaro los métodos que toca usarse - "implements" de varias clases
 *
 * @author Sebastian
 */
public interface Animal {

    public void sound();

    public void sleep();

    public static void eat(){
        System.out.println("Animal come");
    }
    
    
}
