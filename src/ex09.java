
import java.util.Scanner;

//Faça um programa que receba 4 valores e retorne o menor entre eles.

public class ex09 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o nome primeiro valor ");
        double primeiroValor = in.nextDouble();
        System.out.println("Insira o segundo valor");
        double segundoValor = in.nextDouble();
        if (primeiroValor > segundoValor) {
            System.out.println(primeiroValor);
        } else if (primeiroValor == segundoValor) {
            System.out.println("Os numeros são iguais");

        } else {
            System.out.println(segundoValor);
        }
    }
}
