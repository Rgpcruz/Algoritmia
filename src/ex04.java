
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        // Crie um algoritmo que após ler dois números inteiros apresenta a sua diferença.
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o valor da base ");
        double numero1 = in.nextDouble();
        System.out.println("Insira o valor da altura ");
        double numero2 = in.nextDouble();

        double area = numero1 * numero2 /2;

        System.out.println("A Area é: " + area);


    }
}
