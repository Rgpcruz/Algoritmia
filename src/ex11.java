import java.util.Scanner;

public class ex11 {

//Faça um programa que receba 3 valores que representarão os lados de um triângulo e verifique se os valores
//formam um triângulo e classifique esse triângulo como:
//• Equilátero (3 lados iguais);
//• Isósceles (2 lados iguais);
//• Escaleno (3 lados diferentes).
//De notar que para formar um triângulo:
//• Nenhum dos lados pode ser igual a zero;
//• Um lado não pode ser maior do que a soma dos outros dois;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o lado1 ");
        double lado1 = in.nextDouble();
        System.out.println("Insira o lado2 ");
        double lado2 = in.nextDouble();
        System.out.println("Insira o lado3 ");
        double lado3 = in.nextDouble();

        if (lado1 <= 0 && lado2 <= 0 && lado3 <= 0) {
            System.out.println("Nenhum dos lados pode ser mneor que 0");
        }
        if (lado1 > (lado2 + lado3) || (lado2 > (lado3 + lado1) || lado3 > (lado1 + lado2))) {
            System.out.println("Um lado não pode ser maior do que a soma dos outros dois");
        }
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println(" o triangulo é equilatero");
        } else if (lado1 == lado2 || lado1 == lado3) {
            System.out.println("o Triangulo é isosceles");

        } else {
            System.out.println("o triangulo é escaleno");

        }
    }
}
