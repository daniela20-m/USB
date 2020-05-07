package AbstractFactory;

/*
ABSTRACT FACTORY

Creacion o instanciacion de distintas clases, objetos de clases distintas que tienen metodos en comun
Factorias pero se pueden llamar clases fabrica, perimiten la instanciacion de los objetos correspondientes
*/
//Empresa que presta diferentes servios informaticos, diseño grafico, desarrollo de programas, crear paginas web 
public interface ServicioFactory {
    public ServicioInformatico crearServicio();
}
