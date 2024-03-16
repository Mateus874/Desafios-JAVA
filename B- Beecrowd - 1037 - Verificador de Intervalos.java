import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
public static void main(String[] args) throws IOException {

    Scanner input = new Scanner(in);

    float A = input.nextFloat();

    if (A >= 0 && A <= 25){
        System.out.println("Intervalo [0,25]");
    } else if (A >= 25 && A <= 50){
        System.out.println("Intervalo (25,50]");
    } else if (A >= 50 && A <= 75) {
        System.out.println("Intervalo (50,75]");
    } else if (A >= 75 && A <= 100) {
        System.out.println("Intervalo (75,100]");
    }else{
        System.out.println("Fora de intervalo");
    }


}}
