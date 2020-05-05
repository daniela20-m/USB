* Daniela Arenas Monroy
* Universidad San Buenaventura

## ARQUITECURA Y PATRONES DE SOFTWARE

En esta clase desarrollamos  proyectos, donde se aplican diferentes patrones y principios SOLID.

|        CARPETA  | CONTENIDO |
|----------------|-------------------------------|
|CORTE 1 | Tarea 1 | 
| CORTE 2 | Tarea 1 | 
| CORTE 3 | Principios SOLID, Patrones Creacionales, Calculadora |
| PROYECTO| .java |

## Corte 1.
* Tarea 1. 

## CORTE 2
*Tarea 1.

## CORTE 3

## Principios SOLID
## Principio 1.
*S: Principio de responsabilidad única (Single responsibility principle)*

## Principio 2.
*O: Principio de abierto/cerrado (Open/closed principle)*

## Principio 3.
*L: Principio de sustitución de Liskov (Liskov substitution principle)*

## Principio 4.
*I: Principio de segregación de la interfaz  (Interface segregation principle)* 

## Principio 5.
*D: Principio de inversión de la dependencia (Dependency inversion principle)* 

![](https://tech.tribalyte.eu/wp-content/uploads/2018/02/Solid-1.png)

## Patrones Creacionales
* Abstract factory: el problema que intenta solucionar es: la creación de diferentes familias de objetos relacionados o que dependen entre si, sin especificar sus clases concretas. Permite trabajar con objetos de distintas familias de manera que las familias no se mezclen entre si y haciendo transparente el tipo de familia concreta que se esta usando.

* Builder : El objetivo es conseguir que la construcción de un objeto compuesto sea independiente de su representación, de manera que la construcción no se vea afectada por el hecho de que cambie su forma de representación.

* Factory Method : 
Este es un patrón que se ocupa en la creación de objetos, sin especificar la clase de objeto que se crear. Factory method se ocupa del problema mediante la definición de un método para crear los objetos.
Introducción

## Calculadora
Se desarrollo una calculadora con funciones basicas (suma, resta, multiplicación y división).


## Proyecto del Semestre.

* Descripcion del problema.
En las plataformas de videojuegos no hay un sistema que permita el acceso a una información detallada de las estadísticas del jugador respecto a varios juegos probados, de igual forma los usuarios no pueden compartir detalles de su progreso.
Así mismo, no hay variedad de contenido en diferentes temáticas de tal forma que la experiencia del usuario no cumple las expectativas para jugar variedad de títulos.


- Requerimientos funcionales

|        Codigo        |Nombre                |Descripcion                         |
|----------------|-------------------------------|-----------------------------|
|RF01 | Iniciar sesión | Iniciar sesión mediante un usuario/correo y contraseña. |
|RF02 | Registrar usuario | Llenar formulario de registro para crear usuario en la plataforma. |
|RF03 | Recuperar contraseña | Mediante un código enviado por correo electrónico, se ingresa el código en la aplicación para modificar la contraseña. |
|RF04 | Modificar perfil | Cada usuario puede modificar ciertos datos y opciones según convenga. |
|RF05 | Consultar juego en la tienda | Se cargará un listado filtrado por categoría de juego para comprar. |
|RF06 | Comprar juego | Dependiendo de las monedas que tenga el usuario, podrá comprar los juegos que desee. |
|RF07 | Recargar monedas | Mediante un código ingresado por el usuario en la aplicación, o por parte del administrador, se le otorgan monedas al usuario. |
|RF08 | Cargar juegos en biblioteca | Cuando el usuario compre un juego se añadirá a la biblioteca disponible para jugar. |
|RF09 | Jugar juego en biblioteca | Mediante la selección del juego se añade. |
|RF010 | Tablero de juego | Una vez se haya marcado un hito en un juego, se registrarán las estadísticas tales como: tiempo jugado, puntaje, nivel, experiencia. |
|RF011 | Ver estadísticas de usuario | Se registrará un listado de estadísticas tales como: juego, tiempo jugado, puntaje, nivel, experiencia de todos los juegos visitados por el usuario. |
|RF012 | Recompensas | Por cada hito importante alcanzado en un juego, se recargarán monedas a la cuenta del usuario o el administrador publicará llaves únicas periódicamente el cual valen para desbloquear un juego gratis. |
|RF013 | Añadir amigos | Se consultará un listado de usuarios el cual se podrán añadir siempre y cuando el usuario añadido acepte la solicitud. |
|RF014 | Ver estadísticas de amigos | Una vez 2 usuarios sean amigos se podrá ver las estadísticas individuales y se hará una comparativa de las estadísticas propias. |
|RF015 | Chat local | Una vez 2 usuarios sean amigos se podrá activar una ventana de chat, el cual podrán conversar desde 2 computadores simultáneamente. |
|RF016 | Enviar correo | Por cada “transacción” se enviará un correo electrónico a la cuenta registrada en la plataforma. |

- Requerimientos no funcionales

|        Codigo        |Nombre                |Descripcion                         |
|----------------|-------------------------------|-----------------------------|
|RFN01 | Interfaz grafica | Iniciar sesión mediante un usuario/correo y contraseña. |
|RFN02 | Manuales | El programa debe contar con manuales de usuario para aprender el uso de la plataforma. |
|RFN03 | Patrones | Se debe desarrollar el programa mediante patrones (Pizarrón y capas o cliente-servidor). |
|RFN04 | Lenguaje de programación | Se debe desarrollar en el lenguaje de programación JAVA, siguiendo los estándares de patrones de arquitectura y estructuras de datos. |
|RFN05 | Herramientas de desarrollo | Se debe usar el IDE Netbeans o Eclipse para el desarrollo de la aplicación. |
|RFN06 | Persistencia de datos | El programa debe contar con persistencia de datos en un motor de base de datos tales como MySQL, Oracle o MariaDB. |
|RFN07 | Usabilidad | Todas las interfaces deben ser de fácil manejo e intuitivas para el usuario final. |
|RFN08 | Contenido multimedia | El programa debe tener contenido multimedia para referenciar los juegos a los que se hacen alusión. |
