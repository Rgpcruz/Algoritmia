
import java.util.Scanner;

public class ex16 {

//Dado uma série de 20 valores inteiros, faça um algoritmo que calcule e escreva a média aritmética destes valores.

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
        System.out.printf("A média dos 20 valores é: " + media);
    }

}
