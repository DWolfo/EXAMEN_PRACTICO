
package eddexam;

import static java.lang.System.arraycopy;
import java.util.Scanner;
import java.util.Arrays;

public class EDDExam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//Arreglo aleatorio
        System.out.println("El arreglo inicial es: ");
        int[] array = new int[15];;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 + 1);
            System.out.print("[" + array[i] + "]");
        }
        System.out.println("\n ¿A partír de qué posición desea copiar el arreglo?");
        int posInicial = sc.nextInt();
        System.out.println("¿Hasta dónde desea copiar el arreglo?");
        int posFinal = sc.nextInt();
        
        System.out.println("El arreglo copia es: ");
        int [] array2 = new int [14];
        array2 = Arrays.copyOfRange(array, posInicial, posFinal+1);
        for(int arr : array2){
            System.out.print("[" + arr + "]");
        }
        
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] % 2 == 0) {
                System.out.print("\n Numeros pares del arrego copia: ");
                System.out.print("[" + array2[i] + "]");
            }
        }
        
    }
}
