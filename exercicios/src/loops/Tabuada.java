/* Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer n�mero inteiro entre 1 a 10.
O usu�rio deve informar de qual numero ele deseja ver a tabuada.
A sa�da deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50 */

package loops;
import java.util.Scanner;

public class Tabuada {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Tabuada: ");
    int tabuada = scan.nextInt();

    if(tabuada > 10 | tabuada < 1) System.out.println("Digite um n�mero de 1 a 10.");
    else{
        for(int i = 1; i < 11; i++){
          System.out.println(tabuada + " x "+ i + " = " + tabuada * i);
        }
    }
  }
}
