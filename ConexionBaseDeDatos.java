package Principio1;

/*
    Clase encanrgada o cuya funcion es hacer el CRUD  a la base de datos
    @param moto
    */
public class ConexionBaseDeDatos {
    public Moto moto; // Crear una relacion con la clase moto
    
    /*
    Metodo para crear moto en BD
    @param moto
    */
    public void crearMotoBaseDatos(){
        System.out.println("Crear moto");
    }
    
    /*
    Metodo para guardar moto en BD
    @param moto
    */
    public void guardarMotoBaseDatos(){
        System.out.println("Guardar moto");
    }
    
    /*
    Metodo para elimiar moto en BD
    @param moto
    */
    public void eliminarMotoBaseDatos(){
        System.out.println("Eliminar moto");
    }
    
    /*
    Metodo para modificar moto en BD
    @param moto
    */
    public void modificarMotoBaseDatos(){
        System.out.println("Modificar moto");
    }
    /*
    Metodo para buscar moto en BD
    @param moto
    */
    public void buscaMotoBaseDatos(){
        System.out.println("Buscar moto");
    }
}
