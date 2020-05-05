package principio3_L;

/**
 * SUPERCLASE
 * Clase rectángulo con sus getter and setters y un método para calcular área
 * FINAL = No varia, constante
 * THIS = Referencia a las variables o constantes
 * @author Sebastian
 */
public class Rectangle {

   // int width;
   // int height;
    
    public final int width;
    public final int height; // Principio de inmutabilidad (final)

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }

    /**
     * Método para calcular el área del rectángulo
     *
     * @return
     */
    public double calculateArea() {
        int calculo;
        calculo = width * height;
        return calculo;
    }
}
