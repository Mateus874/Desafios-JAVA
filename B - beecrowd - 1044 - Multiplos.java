import java.util.Scanner;
/*
    Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
     "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos
      entre si.

    Entrada
    A entrada contém valores inteiros.

    Saída
    A saída deve conter uma das mensagens conforme descrito acima.
*/

public class Beecroowd {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Pergunta se o número é multiplo
    int A = input.nextInt();
    //Pergunta de qual número é
    int B = input.nextInt();

      int resto = A % B;

          if(A % B == 0 || B % A == 0){
              System.out.println("Sao Multiplo");
          } else{
              System.out.println("Nao sao Multiplos");
          }
      
          }
}
