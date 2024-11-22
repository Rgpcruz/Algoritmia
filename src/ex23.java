


import java.util.Scanner;

public class ex23 {

    //Crie um programa para multiplicar dois números sem recurso ao operador multiplicação.


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        int n1 = in.nextInt();
        System.out.print("Insira o segundo valor: ");
        int n2 = in.nextInt();
        int resultado = 0;
        for (int i = 0; i < n2; i++) {
            resultado +=n1;
        }
        System.out.printf("O valor da multiplicação é: " + resultado);
    }
}

