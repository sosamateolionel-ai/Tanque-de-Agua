# Tanque de Agua

## Descripción

Este programa implementa una clase `TanqueAgua` que permite controlar el nivel de agua de un tanque, teniendo en cuenta su capacidad máxima. Permite agregar y consumir agua, evitando valores inválidos o que el tanque supere su capacidad.

## Funcionamiento

La clase utiliza dos atributos privados:

* `capacidadMaximaLitros`: representa la capacidad máxima del tanque.
* `nivelActualLitros`: indica la cantidad de agua disponible actualmente.

El constructor valida que la capacidad sea mayor que cero, que el nivel actual no sea negativo y que no supere la capacidad máxima.

La clase contiene los siguientes métodos:

* `llenar()`: agrega agua al tanque. Si la cantidad supera la capacidad disponible, el nivel se establece en la capacidad máxima.
* `consumir()`: descuenta agua del tanque y verifica que haya suficiente cantidad disponible.
* `calcularPorcentajeLlenado()`: calcula qué porcentaje del tanque se encuentra lleno.
* `mostrarEstado()`: muestra la capacidad, el nivel actual y el porcentaje de llenado.

## Ejemplo

<img width="362" height="427" alt="image" src="https://github.com/user-attachments/assets/f157d271-57c2-4786-9c54-ca8edcd27026" />


## Conceptos utilizados

* Clases y objetos
* Encapsulamiento
* Constructores
* Métodos
* Validación de datos
* Condicionales `if`
* Excepciones `IllegalArgumentException`
* Operaciones matemáticas
* Porcentajes
* `printf` para formatear la salida
