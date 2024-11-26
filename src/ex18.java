
import java.util.Scanner;

public class ex18 {

//Dado um conjunto de n números inteiros inseridos pelo utilizador, faça um algoritmo que calcule a média dos
//valores maiores que 4.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double mediaFinal = 0;
        double soma = 0;
        int contadorValido = 0;

        System.out.print("Digite a quantidade de numeros que vai introduzir: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Introduza o " + (i+1)+  " numero ");
            int num = in.nextInt();
            if (num < 5) {
                System.out.println("Numero não é inteiro ou maior que 4, introduza um numero valido");
                i--;
            } else {
                soma += num;
                contadorValido++;
            }
        }
        mediaFinal = soma / contadorValido;
        System.out.printf("A média dos valores é: " + mediaFinal);
    }
}






