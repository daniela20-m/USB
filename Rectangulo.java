package principio3;

/**
 Clase rectangulo con sus getter and setter y un metodo para calcular el area
 * 
 * Final = no vaira, constante
 * this= referencia a las variables
 */
public class Rectangulo {
    //int width;
    //int height;

    public final int width;
    public final int height;
    
    public Rectangulo (int width, int height){
        this.height = height;
        this.width = width;
    }
    
    /*public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    */
    /**
     * Metodo para calcular el area del rectangulo
    */ 
    public double calculoArea(){
        int calculo;
        calculo = width*height;
        return calculo;
    }
    
}
