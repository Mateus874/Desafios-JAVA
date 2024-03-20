import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class Main {
    /*
        Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.

        Entrada
        A entrada contem três números inteiros.

        Saída
        Imprima a saída conforme foi especificado.
        7 21 -14
     */

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(in);

        // System.out.println("Digite 2 valores com uma casa decimal (x e y)");
            int x = input.nextInt();
            int y = input.nextInt();
            int z = input.nextInt();

        //Populando o array da lista
            int[] listaNumeros1 = {x, y, z};
            int[] listaNumeros2 = {x, y, z};

        //Ordenação dos números com as colections
            Arrays.sort(listaNumeros1);

        //imprimindo com o foreach
            for ( int ordenada1 : listaNumeros1) {
                System.out.println(ordenada1);
            }
           System.out.printf("%n");
      
        //Mostras na sequencia que foram lidos
            for (int ordenada2 : listaNumeros2){
            System.out.println(ordenada2);
        }}}
