/* Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio.
Ex.: 5!=5.4.3.2.1=120 */

package loops;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.println("Fatorial: ");
      int fatorial = scan.nextInt();
      
      int multiplicacao = 1;
      for(int i = fatorial; i >= 1; i--){
        multiplicacao *= i;
      }
        System.out.println(fatorial + "! = " + multiplicacao);
    }
}
