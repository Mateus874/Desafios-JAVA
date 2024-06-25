import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
    Scanner input = new Scanner(System.in);
    int horaI = input.nextInt();
    int horaF = input.nextInt();
    
    if (horaF > horaI){
         int resultadoHoras1 = horaF - horaI;
         System.out.println("O JOGO DUROU " + resultadoHoras1 + " HORA(S)");
    }else{
        int resultadoHoras2 = (24 - horaI) + horaF;
         System.out.println("O JOGO DUROU " + resultadoHoras2 + " HORA(S)");
    }
    }
}
