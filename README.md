# Acumuladores Booleanos
Breve explicación y ejercicio en lenguaje java 

## Que son los acumuladores booleanos?

Un acumulador booleano utiliza las propiedades de la lógica para acumular un valor de verdad (verdadero o falso) durante la vida de un algoritmo. En general estos algoritmos son una implementan de una función boleana.

Son muy útiles cuando se quiere chequear si se da o no, una propiedad boleana en una estructura o en un conjunto de datos, por ejemplo, en una lista de valores. 
Comparación de codificar con acumuladores, respecto de hacerlo sin:

| Sin Acumuladores                  | Con acumuladores    |
|-----------------------------------|---------------------|
|Codigo mas extenso                 |Mas declarativo      |
|Promueve la introduccion de errores| Se recorre siempre hasta el final | 
|Dificil de modificar/agregar codigo|                     |
|El codigo termina antes en algunos casos|                 |

## Regla general para acumulacion booleana

+ Cuando la hipotesis es:
Que la propiedad se cumple **para todos los elementos**, la variable booleana debe ser inicializada con el valor True y la acumulacion es con "and" (&&).

+ Cuando la hipotesis es:
Que la propiedad se cumple **para al menos un elemento**, la variable booleana debe ser inicializada con el valor False y la acumulacion es con "or" (||).








