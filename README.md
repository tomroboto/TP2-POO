# TP2-POO
Repositorio del Trabajo Práctico N°2 de Programación Orientada a Objetos.<br>
**Profesor: Francisco Acuña**
## UML
![UML](src/main/resources/uml.png)

## Resumen estructura
Las clases Moto y Auto son hijas de la clase abstracta Vehiculo, esta contiene la definición del compareTo y la función abstracta toString, tambien la función precioString para facilitar el pasaje de double a String.

La clase Concesionaria tiene una ArrayList de vehiculos como atributo, implementa la interface IEntrega que define las funciones que se usarán para la entrega.
Para imprimir la lista de vehiculos recorro el ArrayList y hago un println a cada uno.
Para determinar el de precio más alto hago un stream de la lista de vehiculos, los comparo a todos por el precio y obtengo el mayor. Ídem con el precio más bajo.
Para buscar el vehiculo con Y implementé un buscador que recibe un String de parámetro y con un Stream busca qué vehículos contienen ese String, devuelve un ArrayList.
Para ordenar los vehiculos por precio hago un stream de la lista de vehiculos, los ordeno por precio e imprimo por consola cada uno. Ídem con el nombre.
