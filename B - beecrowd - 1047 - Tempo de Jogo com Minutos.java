import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int entradaI, minutoI, entradaf, minutoF;

        entradaI = input.nextInt();
        minutoI = input.nextInt();

        entradaf = input.nextInt();
        minutoF = input.nextInt();

        int inicioEmMinutos = entradaI * 60 + minutoI;
        int fimEmMinutos = entradaf * 60 + minutoF;
        int duracaoEmMinutos;

        if (inicioEmMinutos < fimEmMinutos) {
            duracaoEmMinutos = fimEmMinutos - inicioEmMinutos;
        } else {
            duracaoEmMinutos = (24 * 60 - inicioEmMinutos) + fimEmMinutos;
        }

        int duracaoHoras = duracaoEmMinutos / 60;
        int duracaoMinutos = duracaoEmMinutos % 60;

        System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
    }
}
