import java.util.Scanner;

public class ex25 {
//Elabore uma função que dado um ano verifique se ele é ou não bissexto.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Introduza um ano: ");
        int ano = in.nextInt();
        if (ano < 0) {
            System.out.println("O ano deve ser maior que 0");
        } else {
            if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
                System.out.printf("O ano é bissexto");
            } else {
                System.out.printf("O ano não é bisexto");
            }
        }

    }
}
