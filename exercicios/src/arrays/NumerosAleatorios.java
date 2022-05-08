/* Fa�a um programa que leia 20 n�meros inteiros aleat�rios entre 0 e 100 e armazene em um vetor. Ao final mostre os n�meros e seus sucessores. */

package arrays;
import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numAleatorios = new int[20];

        for(int i=0; i < numAleatorios.length; i++ ){
            int numeros = random.nextInt(100);
            numAleatorios[i] = numeros;
        }

        System.out.print("N�meros Aleat�rios: ");
        for (int num : numAleatorios) {
           System.out.print(num + " ");  
        }

        System.out.print("\nSucessores dos N�meros Aleat�rios: ");
        for (int num : numAleatorios) {
           System.out.print((num+1) + " ");  
        }
    }
}
