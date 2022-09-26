package principiantes.pkg2;

import java.util.Scanner;

public class Principiantes2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo1 = new int[10], arreglo2 = new int[10];
        int cont = 0;
        System.out.println("Introduzca los valoes del arreglo 1.");
        for (int i = 0; i < 10; i++) {
            arreglo1[i] = entrada.nextInt();
        }
        System.out.println("Introduzca los valoes del arreglo 2.");
        for (int i = 0; i < 10; i++) {
            arreglo2[i] = entrada.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (arreglo1[i] == arreglo2[i]) {
                cont++;
            }
        }
        if (cont == 10) {
            System.out.println("> Los arreglos son iguales.");
        } else {
            System.out.println("> Los arreglos NO son iguales.");
        }
    }
}
