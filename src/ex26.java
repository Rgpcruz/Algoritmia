
import java.util.Scanner;

public class ex26 {

//Escreva um programa que converta um valor binário para decimal.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Introduza o numero binario que pretende converter em decimal ");
        int numBinario = in.nextInt();
        int decimal = 0;

        for (int i = 0; numBinario > 0; i++) {
            decimal += Math.pow(2, i) * (numBinario % 10);
            numBinario /= 10;

        }
        System.out.println(decimal);


    }

}
