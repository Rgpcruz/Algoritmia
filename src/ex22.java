

import java.util.Scanner;

public class ex22 {

//Crie um programa que permita converter um valor em Megabytes para Bytes.
//1 megabyte = 1024 bytes
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insira o valor em Megabytes, para que seja convertido em bytes: ");
        int valorMegabytes = in.nextInt();
        int valorbytes = valorMegabytes * 1024;
        System.out.printf("o valor em megabytes é: " + valorbytes);
    }
}

