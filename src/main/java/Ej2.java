/*
Retomar el algoritmo de la guerra de barcos, dividiéndolo en procedimientos y funciones:

Escribir un procedimiento initializarTablero() que inicialice el tablero de juego.

Escribir un procedimiento mostrarTablero() que, como su nombre indica, muestre el tablero de juego.

Escribir una función introducirEnteroEntreLimites(), que hace que el usuario introduzca un valor hasta que esté entre un valor mínimo y un valor máximo, pasados en los argumentos de esta función.

Escribir una función de disparar() que le permita al jugador elegir sus coordenadas de disparo y devuelva verdadero si el barco es alcanzado y falso en caso contrario.

Escribir el algoritmo principal que llama a estos procedimientos y sus funciones.
 */

import java.util.Scanner;


public class Ej2 {
    public static int[][] tablero;

    public static void main(String[] args) {

       Principal();
    }
public static void  Principal(){
    Scanner sc = new Scanner(System.in);
    int barcoX = (int) (Math.random() * 4);
    int barcoY = (int) (Math.random() * 4);
    int disparos = 0;
    int aciertos = 0;
    initializarTablero();
    mostrarTablero();
    while (aciertos == 0) {
        int x = introducirEnteroEntreLimites(sc, 0, 3, "Introduce la coordenada X del disparo:");
        int y = introducirEnteroEntreLimites(sc, 0, 3, "Introduce la coordenada Y del disparo:");
        disparos++;
        if (disparar(x, y, barcoX, barcoY)) {
            aciertos++;
            tablero[y][x] = 1;
        } else {
            tablero[y][x] = 2;
        }
        mostrarTablero();
    }
    System.out.println("Has acertado en " + disparos + " disparos.");

}
    public static void initializarTablero() {
        tablero = new int[4][4];
    }

    public static void mostrarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == 0) {
                    System.out.print(" - ");
                } else if (tablero[i][j] == 1) {
                    System.out.print(" X ");
                } else if (tablero[i][j] == 2) {
                    System.out.print(" O ");
                }
            }
            System.out.println();
        }
    }

    public static int introducirEnteroEntreLimites(Scanner sc, int min, int max, String mensaje) {
        int valor;
        do {
            System.out.println(mensaje);
            valor = sc.nextInt();
        } while (valor < min || valor > max);
        return valor;
    }

    public static boolean disparar(int x, int y, int barcoX, int barcoY) {
        return (x == barcoX && y == barcoY);
    }
}

