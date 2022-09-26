
package principiante4;

public class principiante4 {

    public static void main(String[] args) {
    
        int[] array = new int[20];;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 + 1);
            System.out.print("[" + array[i] + "]");
        }
        int max = 0;
        int rep;
        int masrep = 0;
        
        for (int i = 0; i < array.length; i++) {
            rep = 0;
            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j]){
                    rep ++;
                }
            }
            if(rep > max){
                masrep = array[i];
                max = rep;
            }
        }
        System.out.println("\n El numero que se repite tres veces es: " + masrep);

    }
}
