/* Crie um vetor de 6 números inteiros e mostre-os na ordem inversa. */

package arrays;
public class OrdemInversa {
  
  public static void main(String[] args) {
      int[] vetor = {-5, -6, 15, 50, 8, 4};

      System.out.print("vetor: ");
      int i = 0;
      while(i < (vetor.length)){
          System.out.print(vetor[i] + " ");
          i++;
      }

      System.out.print("\nvetor invertido: ");
      for(int count = (vetor.length-1); count >= 0; count--){
        System.out.print(vetor[count] + " ");
      }

  }
}
