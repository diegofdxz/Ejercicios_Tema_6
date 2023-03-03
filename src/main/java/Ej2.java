/*
2. Micro guerra de barcos (versión 2)
Requisito previo: Ejercicio 8 del capítulo Las tablas

Retomar el algoritmo de la guerra de barcos, dividiéndolo en procedimientos y funciones:

Escribir un procedimiento initializarTablero() que inicialice el tablero de juego.

Escribir un procedimiento mostrarTablero() que, como su nombre indica, muestre el tablero de juego.

Escribir una función introducirEnteroEntreLimites(), que hace que el usuario introduzca un valor hasta que esté entre un valor mínimo y un valor máximo, pasados en los argumentos de esta función.

Escribir una función de disparar() que le permita al jugador elegir sus coordenadas de disparo y devuelva verdadero si el barco es alcanzado y falso en caso contrario.

Escribir el algoritmo principal que llama a estos procedimientos y sus funciones.
 */import java.util.Scanner;
public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tablero = new int[4][4];
        int barcoX = (int) (Math.random() * 4);
        int barcoY = (int) (Math.random() * 4);
        int disparos = 0;
        int aciertos = 0;
        while (aciertos == 0) {
            System.out.println("Introduce la coordenada X del disparo:");
            int x = sc.nextInt();
            System.out.println("Introduce la coordenada Y del disparo:");
            int y = sc.nextInt();
            disparos++;
            if (x == barcoX && y == barcoY) {
                aciertos++;
                tablero[y][x] = 1;
            } else {
                tablero[y][x] = 2;
            }
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
        System.out.println("Has acertado en " + disparos + " disparos.");
    }


}