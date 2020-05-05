package principio5_D;

/**
 *
 * @author Sebastian
 */
public class Vehiculo {

    String tipo = "Ferrari";

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void conducir_ferrari() {
        System.out.println("Manejo un " + tipo);
    }
}
