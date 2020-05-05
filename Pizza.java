package Builder;

/**
 *
 * @author danie_d8mi
 */
/*
Crear objetos de una clase producto los valores que se asignan son predeterminado, 
*/
// Clase producto

public class Pizza {
    private String masa = "";
    private String salsa = "";
    private String relleno = "";
    
    public void setMasa (String masa){
        this.masa = masa;
    }
    
    public void setSalsa (String salsa){
        this.salsa = salsa;
    }
    
    public void setRelleno (String relleno){
        this.relleno = relleno;
    }
}
