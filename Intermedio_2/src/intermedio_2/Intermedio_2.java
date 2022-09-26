/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermedio_2;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Intermedio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[] ,  numero;
        boolean creciente = true;
        
        arreglo = new int[15];
        
        do{
            System.out.println("Rellene el arreglo: ");
            for (int i = 0; i < 10; i++) {
                System.out.println(i + ". Digite un numero: ");
                arreglo[i] = sc.nextInt();
            }
            
            for (int i = 0; i < 10; i++) {
                if (arreglo[i] < arreglo[i + 1]) {
                    creciente = true;
                }
                if (arreglo[i] >arreglo[i + 1]) {
                    creciente = false;
                    break;
                }
            }
            
        }while(creciente == false);
        numero = sc.nextInt();
        int i =0;
        while(i<100 && arreglo[i]< numero)
    }
    
}
