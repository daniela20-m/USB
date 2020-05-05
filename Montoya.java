package principio5_D;

/**
 *
 * @author Sebastian
 */
public class Montoya implements Piloto {

    /* Para poder pilotear o conducir necesito un carro
     */
    private final Vehiculo vehiculo;
    String tipo = "Lamborgini";

    // FORMA 1: Ya no depende de la clase sino dependo del constructor
    public Montoya(Vehiculo vehiculo) {
        this.vehiculo = new Vehiculo(tipo);
    }
    
    // FORMA 2: Se aplica setter y getter en el método pilotear
    

    @Override
    public void pilorear() {
        // FORMA 2
        
        vehiculo.setTipo("BMW");
        vehiculo.conducir_ferrari();
    }

    /*
     * 1. No es muy flexible
     * 2. Dependencia fuertemente acoplada porque solo ferrari, lamborgini o BMW no es posible
     */
 /*
    * Iron Man: Rescadatarnos
    * Inyeccion de dependencias
    * 1. Forma 1: Conductor, hace modificacion de inyección de dependencias
    * 2. Forma 2: Mirador (SETTERS) 
     */
}
