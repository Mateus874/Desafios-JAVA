import java.io.IOException;
import java.util.Scanner;
public class Beecrowd {


/**
 Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor
 número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As
 moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

 Entrada
 O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

 Saída
 Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

 Obs: Utilize ponto (.) para separar a parte decimal.
 */


public static void main(String[] args) throws IOException {

    Scanner input = new Scanner(System.in);

    float entrada = input.nextFloat();

    //Notas As notas consideradas são de 100, 50, 20, 10, 5, 2

    int Notas100 = (int) (entrada / 100.00);
    float RestanteDe100 = (float) (entrada % 100.00);

    int Notas50 = (int) (RestanteDe100 / 50.00);
    float RestanteDe50 = (float) (RestanteDe100 % 50.00);

    int Notas20 = (int) (RestanteDe50 / 20.00);
    float RestanteDe20 = (float) (RestanteDe50 % 20.00);

    int Notas10 = (int) (RestanteDe20 / 10.00);
    float RestanteDe10 = (float) (RestanteDe20 % 10.00);

    int Notas5 = (int) (RestanteDe10 / 5.00);
    float RestanteDe5 = (float) (RestanteDe10 % 5.00);

    int Notas2 = (int) (RestanteDe5 / 2.00);
    float RestanteDe2 = (float) (RestanteDe5 % 2.00);


    //Moedas 1, 0.50, 0.25, 0.10, 0.05 e 0.01

    int Notas1 = (int) (RestanteDe2 / 1);
    float RestanteDe1 = (float) (RestanteDe2 % 1);

    int Notas050 = (int) (RestanteDe1 / 0.50);
    float RestanteDe050 = (float) (RestanteDe1 % 0.50);

    int Notas025 = (int) (RestanteDe050 / 0.25);
    float RestanteDe025 = (float) (RestanteDe050 % 0.25);

    int Notas010 = (int) (RestanteDe025 / 0.10);
    float RestanteDe010 = (float) (RestanteDe025 % 0.10);

    int Notas005 = (int) (RestanteDe010 / 0.05);
    float RestanteDe005 = (float) (RestanteDe010 % 0.05);

    int Notas001 = (int) Math.round(RestanteDe005 / 0.01);
    

    //teste cedulas

    System.out.println("NOTAS:");
    System.out.println(Notas100 + " nota(s) de R$ 100.00");
    System.out.println(Notas50 + " nota(s) de R$ 50.00");
    System.out.println(Notas20 + " nota(s) de R$ 20.00");
    System.out.println(Notas10 + " nota(s) de R$ 10.00");
    System.out.println(Notas5 + " nota(s) de R$ 5.00");
    System.out.println(Notas2 + " nota(s) de R$ 2.00");

    //teste Moedas

    System.out.println("MOEDAS:");
    System.out.println(Notas1 + " moeda(s) de R$ 1.00");
    System.out.println(Notas050 + " moeda(s) de R$ 0.50");
    System.out.println(Notas025 + " moeda(s) de R$ 0.25");
    System.out.println(Notas010 + " moeda(s) de R$ 0.10");
    System.out.println(Notas005 + " moeda(s) de R$ 0.05");
    System.out.println(RestanteDe005 + " TESTE ");
    System.out.println(RestanteDe001 + " TESTE ");
    System.out.println(RestanteDe001 + " moeda(s) de R$ 0.01");


/*
        NOTAS:
        5 nota(s) de R$ 100.00
        1 nota(s) de R$ 50.00
        1 nota(s) de R$ 20.00
        0 nota(s) de R$ 10.00
        1 nota(s) de R$ 5.00
        0 nota(s) de R$ 2.00
        MOEDAS:
        1 moeda(s) de R$ 1.00
        1 moeda(s) de R$ 0.50
        0 moeda(s) de R$ 0.25
        2 moeda(s) de R$ 0.10
        0 moeda(s) de R$ 0.05
        3 moeda(s) de R$ 0.01
*/

}

}
