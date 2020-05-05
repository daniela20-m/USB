package principio1_S;

/**
 * Clase encargada cuya función es hacer CRUD en BD
 *
 * @author Sebastian
 */
public class conexionBD {

    public Moto moto; // Crear la relacion con la clase moto

    /**
     * Método para guardar moto en BD
     *
     * @param moto
     */
    public void guardarmotoBD(Moto moto) {
        System.out.println("Moto almacenado en BD");
    }

    /**
     * Método para crear moto en BD
     *
     * @param moto
     */
    public void crearmotoBD(Moto moto) {
        System.out.println("Moto creado en BD");
    }

    /**
     * Método para eliminar moto en BD
     *
     * @param moto
     */
    public void eliminarmotoBD(Moto moto) {
        System.out.println("Moto eliminado en BD");
    }

    /**
     * Método para modificar moto en BD
     *
     * @param moto
     */
    public void modificarmotoBD(Moto moto) {
        System.out.println("Moto modificado en BD");
    }

    /**
     * Método para buscar moto en BD
     *
     * @param moto
     */
    public void buscarmotoBD(Moto moto) {
        System.out.println("Moto encontrado en BD");
    }
}
