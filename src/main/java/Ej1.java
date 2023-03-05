/*
1. Es el mayor
Escriba una función que tome dos valores reales como argumentos y devuelva el mayor de los dos.


 */
public class Ej1 {

    public static int mayor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
/*
Escriba otra función que también tome dos valores reales como argumentos, pero que devuelva:

0 si los dos valores son iguales;

1 si el primer valor es el mayor;

el texto -1 en caso contrario.
 */
    public static int mayor2(int a, int b) {
        if (a > b) {
            return 1;
        } else if (a == b) {
            return 0;
        } else {
            return -1;
        }
    }
   // Escribir un algoritmo principal que llame a estas dos funciones.
    public static void main(String[] args) {
        System.out.println(mayor(5, 6));
        System.out.println(mayor2(5, 6));
    }


}
