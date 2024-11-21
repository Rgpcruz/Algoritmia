import java.util.Scanner;


public class ex10 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Insira o valor ");
        double valor = in.nextDouble();
        if (valor % 2 == 0) {
            System.out.println("o numero é par");
        } else {
            System.out.println("o numero é impar");
        }

    }
}