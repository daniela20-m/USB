package principio3;

/**
Clase cuadrado, suponer que el cuadrado es de tipo rectangulo con lados del mismo tamaño 
¿es verdad?
* Polomisfismo
* Sobreescritura
 */
public class Cuadrado extends Rectangulo {
    
    public Cuadrado (int side) {
        super(side, side); // Super refencia
    }
    /* @Override // Estos metodos no los creo usted, sino que los esta sobre-escribiendo de la clase heredada
    public int getWidth(){
        return width; // Polimorfismo
    }
    
    @Override
    public int getHeight(){
        return height;
    }
    
    @Override
    public void setWidth(int width){
        this.width = width;
        this.height = height;
    }
    
    @Override
    public void setHeight(int height){
        this.height = height;
        this.width = height; //THIS, hace referencia a que usemos las variables del padre
    }
    
    //No aparece override, quiere decir que no estoy sbre escribiendo un metodo
    public void papa(){
        
    }
    */
}
