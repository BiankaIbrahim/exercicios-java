/*Faça um programa que leia 5 números
e informe o maior número
e a média desses números. */

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
        System.out.println("Número: ");
        numero = scan.nextInt();
        cont++;
        
        soma += numero;

        if(numero > maior) maior = numero;

     }while(cont < 5); 
     
     System.out.println("Maior número: "+ maior);
     System.out.println("Media:: "+ soma/5);
  }
}
