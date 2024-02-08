/*1020 - Idade em Dias - beecrowd
Problema:
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.
---------------------------------------------------------------------
*/

import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        Scanner input = new Scanner(System.in);

        int idadeDias = input.nextInt();

        int ano = idadeDias / 365;
        int resultadoAno = idadeDias % 365;

        int mes = resultadoAno / 30;

        int dia = resultadoAno % 30;


        System.out.printf("%d ano(s)%n" + "%d mes(es)%n" + "%d dia(s)%n", ano, mes, dia);


    }

}
