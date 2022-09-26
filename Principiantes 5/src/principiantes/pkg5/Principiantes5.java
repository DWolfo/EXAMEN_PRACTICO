package principiantes.pkg5;

public class Principiantes5 {

    public static void main(String[] args) {
        int[] arreglo = new int[15];
        for (int i = 0; i < arreglo.length; i++) {
            if (i % 2 == 0) {
                arreglo[i] = (int) (Math.random() * 100);
                if (arreglo[i] % 2 == 1) {
                    i--;
                }
            } else {
                arreglo[i] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] +"]");
        }
    }

}
