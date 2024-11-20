
import java.util.Scanner;
//Faça um programa que receba um valor que é o valor pago, um segundo valor que é o preço do produto e retorne
//o troco a ser dado.

public class ex05 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o valor pago ");
        double numero1 = in.nextDouble();
        System.out.println("Insira o preço do produto ");
        double numero2 = in.nextDouble();

        if (numero2 > numero1) {
            System.out.println("Ainda falta pagar: " + (numero2- numero1));
        }
        else if (numero1 == numero2) {
            System.out.println("Valor certo, Obrigado");
        }
        else  {

            System.out.println("A valor troco é: " + (numero1 - numero2));
        }


    }
}
