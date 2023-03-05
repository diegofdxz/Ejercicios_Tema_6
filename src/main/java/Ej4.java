/*
El objetivo de este juego es cruzar dos rebaños de ovejas. Inicialmente, las ovejas están en la siguiente configuración:
 >>> <<<
El objetivo es llegar al final a la siguiente configuración:
 <<< >>>
 Para lograrlo, debes respetar las siguientes reglas:

Una oveja puede avanzar un paso, siempre que el espacio frente a ella esté libre.

Una oveja puede saltar sobre otra oveja yendo en la dirección opuesta, si el siguiente espacio está libre.

No hay otros movimientos disponibles.
Los datos están representados por una tabla como esta:
0 1 2 3 4 5 6
> > >   < < <

a continuación, se muestra un ejemplo de las visualizaciones y entradas esperadas:

 0 1 2 3 4 5 6
|>|>|>| |<|<|<|
¿Qué oveja quieres mover?
2
|>|>| |>|<|<|<|
 */
import java.util.Scanner;
public class Ej4 {
    public static void main(String[] args) {
        Principal();
    }

    public static int[][] inicializarTablero() {
        int[][] tablero = new int[1][7];
        tablero[0][0] = 1;
        tablero[0][1] = 1;
        tablero[0][2] = 1;
        tablero[0][3] = 0;
        tablero[0][4] = 2;
        tablero[0][5] = 2;
        tablero[0][6] = 2;
        return tablero;
    }

    public static void mostrarTablero(int[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == 0) {
                    System.out.print("   ");
                } else if (tablero[i][j] == 1) {
                    System.out.print(" > ");
                } else if (tablero[i][j] == 2) {
                    System.out.print(" < ");
                }
            }
            System.out.println("");
        }
    }

    public static void moverOveja(int[][] tablero, int oveja) {
        if (oveja < 0 || oveja > 6) {
            System.out.println("Oveja no válida");

        } else if (tablero[0][oveja] == 0) {
            System.out.println("No hay oveja en esa posición");
        } else if (tablero[0][oveja] == 1) {
            if (oveja == 6) {
                System.out.println("No puedes mover la oveja más allá del final");
            } else if (tablero[0][oveja + 1] == 0) {
                tablero[0][oveja] = 0;
                tablero[0][oveja + 1] = 1;
            } else if (tablero[0][oveja + 1] == 2) {
                if (oveja == 5) {
                    System.out.println("No puedes mover la oveja más allá del final");
                } else if (tablero[0][oveja + 2] == 0) {
                    tablero[0][oveja] = 0;
                    tablero[0][oveja + 2] = 1;
                } else {
                    System.out.println("No puedes saltar sobre otra oveja");
                }
            } else {
                System.out.println("No puedes saltar sobre otra oveja");
            }
        } else if (tablero[0][oveja] == 2) {
            if (oveja == 0) {
                System.out.println("No puedes mover la oveja más allá del final");
            } else if (tablero[0][oveja - 1] == 0) {
                tablero[0][oveja] = 0;
                tablero[0][oveja - 1] = 2;
            } else if (tablero[0][oveja - 1] == 1) {
                if (oveja == 1) {
                    System.out.println("No puedes mover la oveja más allá del final");
                } else if (tablero[0][oveja - 2] == 0) {
                    tablero[0][oveja] = 0;
                    tablero[0][oveja - 2] = 2;
                } else {
                    System.out.println("No puedes saltar sobre otra oveja");
                }
            } else {
                System.out.println("No puedes saltar sobre otra oveja");
            }
        }


    }
    public static boolean ganas (int[][] tablero){
        if (tablero[0][0] == 2 && tablero[0][1] == 2 && tablero[0][2] == 2 && tablero[0][3] == 0 && tablero[0][4] == 1 && tablero[0][5] == 1 && tablero[0][6] == 1) {
            return true;
        } else {
            return false;

        }
    }
    public static void Principal(){
        Scanner sc = new Scanner(System.in);
        inicializarTablero();
        int[][] tablero = inicializarTablero();
        mostrarTablero(tablero);
        do {
            System.out.println("¿Qué oveja quieres mover? (-1 para salir, 7 para reiniciar)");
            int oveja = sc.nextInt();
            if (oveja == -1) {
                break;
            }else if (oveja == 7){
                Principal();
            }
            moverOveja(tablero, oveja);
            mostrarTablero(tablero);
        } while (!ganas(tablero));
        System.out.println("¡Has ganado!");

        }



}