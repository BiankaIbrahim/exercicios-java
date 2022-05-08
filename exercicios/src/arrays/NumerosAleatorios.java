/* Faça um programa que leia 20 números inteiros aleatórios entre 0 e 100 e armazene em um vetor. Ao final mostre os números e seus sucessores. */

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

        System.out.print("Números Aleatórios: ");
        for (int num : numAleatorios) {
           System.out.print(num + " ");  
        }

        System.out.print("\nSucessores dos Números Aleatórios: ");
        for (int num : numAleatorios) {
           System.out.print((num+1) + " ");  
        }
    }
}
