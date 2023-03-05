# Ejercicios_Tema_6
# Mi repositorio es https://github.com/diegofdxz/Ejercicios_Tema_6.git
## 1 Es el mayor
Escriba una función que tome dos valores reales como argumentos y devuelva el mayor de los dos.

Escriba otra función que también tome dos valores reales como argumentos, pero que devuelva:

0 si los dos valores son iguales;

1 si el primer valor es el mayor;

el texto -1 en caso contrario.

Escribir un algoritmo principal que llame a estas dos funciones.

## 2 Micro guerra de barcos (versión 2)
Requisito previo: Ejercicio 8 del capítulo Las tablas

Retomar el algoritmo de la guerra de barcos, dividiéndolo en procedimientos y funciones:

Escribir un procedimiento initializarTablero() que inicialice el tablero de juego.

Escribir un procedimiento mostrarTablero() que, como su nombre indica, muestre el tablero de juego.

Escribir una función introducirEnteroEntreLimites(), que hace que el usuario introduzca un valor hasta que esté entre un valor mínimo y un valor máximo, pasados en los argumentos de esta función.

Escribir una función de disparar() que le permita al jugador elegir sus coordenadas de disparo y devuelva verdadero si el barco es alcanzado y falso en caso contrario.

Escribir el algoritmo principal que llama a estos procedimientos y sus funciones. 

## 3 Una tabla y funciones
Escriba una función que cree una tabla que tenga una dimensión de diez números enteros e inicialice aleatoriamente los valores de esta tabla, con valores entre un límite mínimo y un límite máximo, que se pasan como argumentos.

Cree una función que devuelva el mayor valor de una tabla (esta tabla no tiene necesariamente diez celdas, etc.).

Escriba un algoritmo que llame a estas dos funciones.

## 4 El juego del rebaño de ovejas
El objetivo de este juego es cruzar dos rebaños de ovejas. Inicialmente, las ovejas están en la siguiente configuración:

Images/06RI03.png
El objetivo es llegar al final a la siguiente configuración:

Images/06RI04.png
Para lograrlo, debes respetar las siguientes reglas:

Una oveja puede avanzar un paso, siempre que el espacio frente a ella esté libre.

Una oveja puede saltar sobre otra oveja yendo en la dirección opuesta, si el siguiente espacio está libre.

No hay otros movimientos disponibles.

Los datos están representados por una tabla como esta:

Images/06RI04A.png
A continuación se muestra un ejemplo de las visualizaciones y entradas esperadas:

Images/06RI04B.png
A continuación se muestra el plan de acción que se le propone realizar:

Intentar practicar (con lápiz y papel), para comprender el mecanismo del juego, dominar los diferentes movimientos posibles, así como las situaciones de bloqueo.

Buscar los subalgoritmos necesarios y determinar si son procedimientos o funciones.

Escribe el algoritmo principal, asumiendo que tiene a su disposición las funciones y procedimientos definidos previamente.

Escribir las funciones y procedimientos.

## 5 Taller de arte ASCII
Escribir un algoritmo para hacer dibujos en arte ASCII. El diseño está modelizado por una tabla de caracteres de diez líneas y cuarenta columnas. Inicialmente, esta tabla contiene solo caracteres de espacio. Un procedimiento debe llevar a cabo la visualización de la obra.

Cuando se inicia el programa, se muestra el dibujo y, a continuación, un menú ofrece realizar una de las siguientes funciones:

Dibujar un carácter.

Dibujar un rectángulo con un conjunto de caracteres.

Cambiar "el color" (es decir, el carácter), usando un bote de pintura (puede inspirarse en lo que se presentó en la sección que trata sobre la recursividad).

Cada una de las funciones mencionadas se debe realizar utilizando uno o más procedimientos.
