
import java.util.Scanner;

public class ex21 {

//Crie um programa que permita converter um valor em bytes para bits.
//1 byte = 8 bits

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insira o valor em bytes, para que seja convertido em bits: ");
        int valorBytes = in.nextInt();
        int valorBits = valorBytes * 8;
        System.out.printf("o valor em bits sao: " + valorBits);
    }
}


