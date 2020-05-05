package principio3_L;

/**
 * SUBCLASE Clase cuadrado, suponer que el cuadrado es de tipo rectangulo USOS:
 * Polimorfismo, sobrescritura, this.
 *
 * @author Sebastian
 */
public class Square extends Rectangle {

    public Square(int side){
    super(side,side); // Super REFERENCIA
    }
//    @Override // Estos metodos usted no los creó, sino que los está sobrescribiendo de la clase que hereda
//    public int getWidth() {
//        return super.getWidth(); // Polimorfismo
//    }
//
//    @Override
//    public int getHeight() {
//        return super.getHeight();
//    }
//
//    @Override
//    public void setHeight(int height) {
//        this.height = height; // THIS, Hace referencia a que usemos las variables del padre
//        this.width = height;
//    }
//
//    @Override
//    public void setWidth(int width) {
//        this.height = width;
//        this.width = width; // THIS, Hace referencia a que usemos las variables del padre
//    }
//
//    // No aparece override, quiere decir que no estoy sobrescribiendo un método
//    public void papa() {
//
//    }

}
