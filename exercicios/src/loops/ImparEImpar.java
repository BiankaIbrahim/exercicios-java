/* Fa�a um programa que pe�a N n�meros inteiros,
calcule e mostre a quantidade de n�meros pares
e a quantidade de n�meros impares. */

package loops;
import java.util.Scanner;

public class ImparEImpar {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int qntNumeros;

    System.out.println("Quantidade de n�meros: ");
    qntNumeros = scan.nextInt();

    int numero;
    int impares = 0;
    int pares = 0;

    int i = 0;
    do{
        System.out.println("N�mero: ");
        numero = scan.nextInt();
        i++;

        if(numero % 2 == 0){
          pares++;
        }else{
          impares++;
        }

    }while(i < qntNumeros);

    System.out.println("Quantidade de n�meroos pares: " + pares);
    System.out.println("Quantidade de n�meros �mpares: " + impares);
  }
}
