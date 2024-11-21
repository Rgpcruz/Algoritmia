
import java.util.Scanner;

public class ex17 {

//Adapte o exercício anterior considerando que se a média obtida for maior que 8 deverá ser atribuída 10 para a
//média.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double numero;
        double total = 0;
        double media;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um numero inteiro");
            numero = in.nextDouble();
            if (numero % 2 == 0) {
                total += numero;
            } else {
                System.out.println("Introduza um numero valido");
            }
        }
        media = total / 20;
        if (media >= 8) {
            System.out.printf("A média do aluno é 10");
        } else {
            System.out.printf("A média do aluno é: " + media);
        }
    }
}
