
package edd.examen.u1.conteo;

public class EDDExamenU1Conteo {
    //Las variables deben ser estáticas para poder llamarlas mas adelante
    static int [] list;    
    static boolean numero(int num){
        //Se guardan los datos del arreglo acá, pero sin estar repetidos
        for (int i = 0; i < list.length; i++) {
            //si el dato a comparar ya existe, entonces
            if (list[i] == num) {
                return false;
            }
        }
        //Se guarda en la lista
        return true;
    }

    public static void main(String[] args) {
        
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            //Se crea la variable que almacenará los numeros aleatorios
            array[i] = (int) (Math.random() * 100 + 1);
            System.out.print("[" + array[i] + "]");            
        }
           
        list = new int[array.length];
        //Se cran dos for que recorran el arreglo para ir comparando los valores
        for (int i = 0; i < array.length; i++) {
            // Se genera un contador para saber cuantas veces se repite un numero
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                // Se comparan ambos arreglos
                if (array[i] == array[j]) {
                   //Si ambos elementos son iguales, el contador aumenta 1
                    count++;
                    if (numero(array[i])) {
                        list[i] = array[i];
                    }

                }
            }
            if (list[i] != 0) {
                System.out.println("[ " + list[i] + " ] " + "[ " + count + " ] ");
            }

        }
    }
}

