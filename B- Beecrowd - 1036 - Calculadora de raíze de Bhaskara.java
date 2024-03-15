import java.io.IOException;
import java.util.Scanner;
import java.util.function.DoubleToLongFunction;

public class Beecrowd {


    /**
     Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara.
     Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”,
     caso haja uma divisão por 0 ou raiz de numero negativo.

     Entrada
     Leia três valores de ponto flutuante (double) A, B e C.

     Saída
     Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular".
     Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente
     conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.
     */


public static void main(String[] args) throws IOException {

    Scanner input = new Scanner(System.in);

    double A = input.nextDouble();
    double B = input.nextDouble();
    double C = input.nextDouble();

    try {
        double discriminante = Math.pow(B, 2) - 4 * A * C;

        if (A == 0 || discriminante < 0) {
            throw new ArithmeticException();
        } else {
            double primeiraParte = (-B + Math.sqrt(discriminante)) / (2 * A);
            double segundaParte = (-B - Math.sqrt(discriminante)) / (2 * A);

            System.out.printf("R1 = %.5f%n", primeiraParte);
            System.out.printf("R2 = %.5f%n", segundaParte);
        }
    } catch (ArithmeticException e) {
        System.out.println("Impossivel calcular");
    }

}}
