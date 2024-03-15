import java.io.IOException;
import java.util.Scanner;
public class Beecrowd {


    /**
     Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A,
     e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A
     for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

     Entrada
     Quatro números inteiros A, B, C e D.
     */


    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();

        int PAR = A % 2;

        if (B > C && D > A && C + D > A + B && C >= 0 && D >= 0 && PAR == 0){
            System.out.println("Valor correto");
        } else {
            System.out.println("errado");
        }

    }}
