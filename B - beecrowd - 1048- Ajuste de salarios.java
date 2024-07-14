import java.io.IOException;
import java.util.Scanner;

/**
 * beecrowd | 1048 | Aumento de Salário
 *
 * A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:
 *
 * Salário                      Percentual de Reajuste
 * 0 - 400.00                   15%
 * 400.01 - 800.00              12%
 * 800.01 - 1200.00             10%
 * 1200.01 - 2000.00            7%
 * Acima de 2000.00             4%
 *
 * Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.
 *
 * Entrada
 * A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.
 *
 * Saída
 * Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste (ambos devem ser apresentados com 2 casas decimais) e o percentual de reajuste ganho.
 */

public class Main {
    public static void main(String[] args) throws IOException {


        Scanner input = new Scanner(System.in);
        Double Salario, Resultado, Reajuste;

        Salario = input.nextDouble();

        if (Salario <= 400.00) {
            Reajuste = (Salario * 0.15);
            Resultado = Salario + Reajuste;
            System.out.println("Novo salario: " + String.format("%.2f", Resultado) +
                    "\nReajuste ganho: " + String.format("%.2f", Reajuste) +
                    "\nEm percentual: " + "15 %");
        } else if (Salario >= 400.01 && Salario <= 800.00) {
            Reajuste = (Salario * 0.12);
            Resultado = Salario + Reajuste;
            System.out.println("Novo salario: " + String.format("%.2f", Resultado) +
                    "\nReajuste ganho: " + String.format("%.2f", Reajuste) +
                    "\nEm percentual: " + "12 %");
        } else if (Salario >= 800.01 && Salario <= 1200.00) {
            Reajuste = (Salario * 0.10);
            Resultado = Salario + Reajuste;
            System.out.println("Novo salario: " + String.format("%.2f", Resultado) +
                    "\nReajuste ganho: " + String.format("%.2f", Reajuste) +
                    "\nEm percentual: " + "10 %");
        } else if (Salario >= 1200.01 && Salario <= 2000.00) {
            Reajuste = (Salario * 0.07);
            Resultado = Salario + Reajuste;
            System.out.println("Novo salario: " + String.format("%.2f", Resultado) +
                    "\nReajuste ganho: " + String.format("%.2f", Reajuste) +
                    "\nEm percentual: " + "7 %");
        } else if (Salario >= 2000.01) {
            Reajuste = (Salario * 0.04);
            Resultado = Salario + Reajuste;
            System.out.println("Novo salario: " + String.format("%.2f", Resultado) +
                    "\nReajuste ganho: " + String.format("%.2f", Reajuste) +
                    "\nEm percentual: " + "4 %");
        } else {
            System.out.println("ERRO");
        }
    }
}
