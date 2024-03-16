import java.io.IOException;
import java.util.Scanner;
import java.util.function.DoubleToLongFunction;

import static java.lang.System.*;

public class Beecrowd {


    /**
     Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
     
     Entrada
     O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

     Saída
     O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
     */


public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);

    System.out.println("Insira o código do lanche");
    int codLanche = input.nextInt();
    System.out.println("Insira a quantidade");
    int qtdLanche = input.nextInt();



    switch (codLanche){
        case 1:
        System.out.printf("Total: R$ %.2f%n", (4.00 * qtdLanche));
            break;
        case 2:
            System.out.printf("Total: R$ %.2f%n", (4.50 * qtdLanche));
            break;
        case 3:
            System.out.printf("Total: R$ %.2f%n", (5.00 * qtdLanche));
            break;
        case 4:
            System.out.printf("Total: R$ %.2f%n", (2.00 * qtdLanche));
            break;
        case 5:
            System.out.printf("Total: R$ %.2f%n", (1.50 * qtdLanche));
            break;}
}}
