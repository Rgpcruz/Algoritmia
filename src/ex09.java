
import java.util.Scanner;

//Faça um programa que receba 4 valores e retorne o menor entre eles.

public class ex09 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o primeiro valor ");
        double n1 = in.nextDouble();
        System.out.println("Insira o segundo valor");
        double n2 = in.nextDouble();
        System.out.println("Insira o terceiro valor ");
        double n3 = in.nextDouble();
        System.out.println("Insira o quarto valor");
        double n4 = in.nextDouble();

        if (n1 < n2 && n1 < n3 && n1 < n4) {
            System.out.println("O valor menor é :" + n1);
        } else if (n2 < n3 && n2 < n4) {
            System.out.println("O valor menor é :" + n2);
        } else if (n3 < n4) {
            ;
            System.out.println("O valor menor é :" + n3);
        } else {
            System.out.println("O valor menor é :" + n4);
        }
    }
}
