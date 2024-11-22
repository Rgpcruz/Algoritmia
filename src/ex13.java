
import java.util.Scanner;

public class ex13 {

//Utilize a estrutura SE para fazer um programa que retorne o nome de um produto a partir do código do mesmo.
//Considere os seguintes códigos:
//• 001 - Parafuso;
//• 002 - Porca;
//• 003 - Prego;
//• Para qualquer outro código indicar “Não definido”.

    //fazer o mesmo com switch e case

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Insira codigo ");
        int codigo = in.nextInt();

        switch (codigo) {
            case 001 -> System.out.println("Parafuso");

            case 002 -> System.out.println("Porca");

            case 003 -> System.out.println("Prego");

            default -> System.out.println("Peso");

        }

    }
}
