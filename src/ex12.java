
import java.util.Scanner;

public class ex12 {

//Utilize a estrutura SE para fazer um programa que retorne o nome de um produto a partir do código do mesmo.
//Considere os seguintes códigos:
//• 001 - Parafuso;
//• 002 - Porca;
//• 003 - Prego;
//• Para qualquer outro código indicar “Não definido”.

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Insira codigo ");
        double codigo = in.nextDouble();

        if (codigo == 001) {
            System.out.println("Parafuso");
        }else if (codigo == 002) {
            System.out.println("Porca");
        }else if (codigo == 003) {
            System.out.println("Prego");
        } else {
            System.out.println("Não definido");

        }

    }
}
