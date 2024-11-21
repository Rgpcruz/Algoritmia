

import java.util.Scanner;

public class ex14 {

//Faça um programa que utilize a estrutura ENQUANTO para ler 50 números e calcule e exiba a média aritmética
//deles.


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Insira codigo ");
        int codigo = in.nextInt();

        switch (codigo) {
            case 001 -> System.out.println("Parafuso");
            case 002 -> System.out.println("Porca");
            case 003 -> System.out.println("Prego");
            default -> System.out.println("Peso");
        }

    }
}
