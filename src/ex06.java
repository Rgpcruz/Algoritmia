
import java.util.Scanner;
//Faça um programa que receba o valor do quilo de um produto e a quantidade de quilos do produto consumidacalculando o valor final a ser pago.

public class ex06 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o preço do KG ");
        double numero1 = in.nextDouble();
        System.out.println("Insira a quantidade consumida (em kg) ");
        double numero2 = in.nextDouble();

        double valor = numero2 * numero1 ;

        System.out.println("A valor a ser pago é: " + valor);


    }
}