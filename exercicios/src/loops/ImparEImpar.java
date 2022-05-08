/* Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares. */

package loops;
import java.util.Scanner;

public class ImparEImpar {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int qntNumeros;

    System.out.println("Quantidade de números: ");
    qntNumeros = scan.nextInt();

    int numero;
    int impares = 0;
    int pares = 0;

    int i = 0;
    do{
        System.out.println("Número: ");
        numero = scan.nextInt();
        i++;

        if(numero % 2 == 0){
          pares++;
        }else{
          impares++;
        }

    }while(i < qntNumeros);

    System.out.println("Quantidade de númeroos pares: " + pares);
    System.out.println("Quantidade de números ímpares: " + impares);
  }
}
