

import java.util.Scanner;

public class ex15 {

//Faça um programa que utilize a estrutura ENQUANTO para ler 50 números e calcule e exiba a média aritmética
//deles.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        double xxx;
        double total = 0;

        for (i = 1; i <= 50; i++) {
            System.out.println("Insira 1 numero ");
            int numero = in.nextInt();
            total += numero;
            i++;
        }
        xxx = total / i;
        System.out.printf("A média é:" + xxx
        );

    }

}
