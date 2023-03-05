/*
Escribir un algoritmo para hacer dibujos en arte ASCII. El diseño está modelizado por una tabla de caracteres de diez líneas y cuarenta columnas. Inicialmente, esta tabla contiene solo caracteres de espacio. Un procedimiento debe llevar a cabo la visualización de la obra.

Cuando se inicia el programa, se muestra el dibujo y, a continuación, un menú ofrece realizar una de las siguientes funciones:

Dibujar un carácter.

Dibujar un rectángulo con un conjunto de caracteres.

Cambiar "el color" (es decir, el carácter), usando un bote de pintura (puede inspirarse en lo que se presentó en la sección que trata sobre la recursividad).

Cada una de las funciones mencionadas se debe realizar utilizando uno o más procedimientos
 */
import java.util.Scanner;
public class Ej5 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Principal();
    }
    public static char[][] TablaDibujo(char x) {
        char[][] tabla = new char[10][40];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = x;
            }
        }
        return tabla;
    }
    public static void mostrarTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println("");
        }
    }
    public static void DibujarCaracter(char[][] tablero, char caracter, int x, int y) {
        tablero[x][y] = caracter;
    }
    public static void DibujarRectangulo(char[][] tablero, char caracter, int x, int y, int ancho, int alto) {
        for (int i = x; i < x + alto; i++) {
            for (int j = y; j < y + ancho; j++) {
                tablero[i][j] = caracter;
            }
        }
    }
    public static void CambiarColor(char[][] tablero, char caracter, int x, int y) {
        char color = tablero[x][y];
        if (x < 0 || x > 9 || y < 0 || y > 39) {
            System.out.println("Fuera de rango");
        } else if (tablero[x][y] == caracter) {
            System.out.println("Ya es el color");
        } else {
            tablero[x][y] = caracter;
            if (x - 1 >= 0 && tablero[x - 1][y] == color) {
                CambiarColor(tablero, caracter, x - 1, y);
            }
            if (x + 1 <= 9 && tablero[x + 1][y] == color) {
                CambiarColor(tablero, caracter, x + 1, y);
            }
            if (y - 1 >= 0 && tablero[x][y - 1] == color) {
                CambiarColor(tablero, caracter, x, y - 1);
            }
            if (y + 1 <= 39 && tablero[x][y + 1] == color) {
                CambiarColor(tablero, caracter, x, y + 1);
            }
        }
    }
    public static void Principal() {
        System.out.println("Bienvenido al programa de dibujo");
        char[][] tablero = TablaDibujo(' ');
        System.out.println("El tablero se ha creado");
        System.out.println("1. Dibujar un carácter");
        System.out.println("2. Dibujar un rectángulo con un conjunto de caracteres");
        System.out.println("3. Cambiar el color");
        System.out.println("4. Salir");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el caracter");
                    char caracter = sc.next().charAt(0);
                    System.out.println("Introduce la coordenada x");
                    int x = sc.nextInt();
                    System.out.println("Introduce la coordenada y");
                    int y = sc.nextInt();
                    DibujarCaracter(tablero, caracter, x, y);
                    mostrarTablero(tablero);
                    break;
                case 2:
                    System.out.println("Introduce el caracter");
                    char caracter2 = sc.next().charAt(0);
                    System.out.println("Introduce la coordenada x");
                    int x2 = sc.nextInt();
                    System.out.println("Introduce la coordenada y");
                    int y2 = sc.nextInt();
                    System.out.println("Introduce el ancho");
                    int ancho = sc.nextInt();
                    System.out.println("Introduce el alto");
                    int alto = sc.nextInt();
                    DibujarRectangulo(tablero, caracter2, x2, y2, ancho, alto);
                    mostrarTablero(tablero);
                    break;
                case 3:
                    System.out.println("Introduce el caracter");
                    char caracter3 = sc.next().charAt(0);
                    System.out.println("Introduce la coordenada x");
                    int x3 = sc.nextInt();
                    System.out.println("Introduce la coordenada y");
                    int y3 = sc.nextInt();
                    CambiarColor(tablero, caracter3, x3, y3);
                    mostrarTablero(tablero);
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
            System.out.println("1. Dibujar un carácter");
            System.out.println("2. Dibujar un rectángulo con un conjunto de caracteres");
            System.out.println("3. Cambiar el color");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
        }

    }

}
