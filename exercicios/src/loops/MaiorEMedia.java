/*Fa�a um programa que leia 5 n�meros
e informe o maior n�mero
e a m�dia desses n�meros. */

package loops;
import java.util.Scanner;

public class MaiorEMedia {
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);

     int numero;
     int cont = 0;
     int maior = 0;
     float soma = 0;

     do{
        System.out.println("N�mero: ");
        numero = scan.nextInt();
        cont++;
        
        soma += numero;

        if(numero > maior) maior = numero;

     }while(cont < 5); 
     
     System.out.println("Maior n�mero: "+ maior);
     System.out.println("Media:: "+ soma/5);
  }
}
