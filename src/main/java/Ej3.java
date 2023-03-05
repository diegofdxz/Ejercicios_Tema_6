/*
3. Una tabla y funciones
Escriba una función que cree una tabla que tenga una dimensión de diez números enteros e inicialice aleatoriamente los valores de esta tabla, con valores entre un límite mínimo y un límite máximo, que se pasan como argumentos.


Cree una función que devuelva el mayor valor de una tabla (esta tabla no tiene necesariamente diez celdas, etc.).

Escriba un algoritmo que llame a estas dos funciones.

 */

public class Ej3 {
    public static void main(String[] args) {
        Principal();

    }
    public static void tabla(int min, int max) {
        int[] tabla = new int[10];
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        for (int i = 0; i < tabla.length; i++) {
            System.out.println(tabla[i]);
        }
    }
    public static int mayor(int[] tabla) {
        int mayor = tabla[0];
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] > mayor) {
                mayor = tabla[i];
            }
        }
        return mayor;
    }
    public static void Principal() {
        tabla(1, 10);
        int[] tabla = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("El mayor de la tabla es: " + mayor(tabla));
    }
}
