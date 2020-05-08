package principio3_L;

/**
 * VISTA
 *
 * @author Sebastian
 */
public class Principal {

    public static void main(String[] args) {
//        Rectangle objRectangle = new Rectangle();
//        objRectangle.setHeight(5);
//        objRectangle.setWidth(2);
//
//        System.out.println("El area del rectángulo es: " + objRectangle.calculateArea());
//
//        Square objSquare = new Square();
//        objSquare.setHeight(5);
//        objSquare.setWidth(6);
//        System.out.println("El área del cuadrado es: " + objSquare.calculateArea());

        /**
         * Problema: El área de las figuras se calcula de forma diferente. 1
         * Solucion. Clase padra abstracta que se llame figura con método
         * abstracto public abstract calcularArea();
         *
         * 2 Solucion. Usar clases tipo interface
         *
         * 3 Solucion. Principio de Inmutabilidad = Consiste en que una vez
         * creado un objeto, el estado del mismo no puede volver a modificarse
         * (inmutabilidad) Ventaja: Mejora el uso de la memoria Hilos: Mejora
         * uso de concurrencia
         */
        Square objeSquare = new Square(5);
        System.out.println(objeSquare.calculateArea());
        
        Rectangle objeRectangulo = new Rectangle(20,5);
        System.out.println(objeRectangulo.calculateArea());
    }

}
