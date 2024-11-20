import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        // Crie um algoritmo que após ler dois números inteiros apresenta a sua diferença.
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o primeiro numero ");
        double numero1 = in.nextDouble();
        System.out.println("Insira o segundo numero ");
        double numero2 = in.nextDouble();

        double sub = numero1 - numero2;

        System.out.println("A Soma é: " + sub);


    }
}

