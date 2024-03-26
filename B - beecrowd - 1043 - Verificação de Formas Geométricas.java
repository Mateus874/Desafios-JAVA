import java.io.IOException;
import java.util.Scanner;

public class Beecrowd {
    /*
    Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:

    Perimetro = XX.X

    Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem

    Area = XX.X

    Entrada
    A entrada contém três valores reais.

    Saída
    O resultado deve ser apresentado com uma casa decimal.
     */

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        float A = input.nextFloat();
        float B = input.nextFloat();
        float C = input.nextFloat();

        if (A + B > C && B + C > A && A + C > B) {
            float perimetroTriangulo = A + B + C;
            System.out.printf("Perimetro = %.1f\n", perimetroTriangulo);
        } else {
            float areaTrapezio = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f\n", areaTrapezio);
        }
    }
}
