package Principio1;

public class Moto {

    String marca_moto;
    String color_moto;
    int modelo_moto;
    

    public Moto(String marca, String color, int modelo){
        this.marca_moto=marca;
        this.color_moto=color;
        this.modelo_moto=modelo;
    }

    public String getMarca_moto() {
        return marca_moto;
    }

    public void setMarca_moto(String marca_moto) {
        this.marca_moto = marca_moto;
    }

    public String getColor_moto() {
        return color_moto;
    }

    public void setColor_moto(String color_moto) {
        this.color_moto = color_moto;
    }

    public int getModelo_moto() {
        return modelo_moto;
    }

    public void setModelo_moto(int modelo_moto) {
        this.modelo_moto = modelo_moto;
    }
    
    /* Mal
    public void guardarmotoBaseDatos(){
        System.out.println("Carro almacenado en base de datos");
    }
*/
}
