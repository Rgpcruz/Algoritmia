import java.util.Random;
import java.util.Scanner;
// Crie um programa que irá gerar um número aleatório entre 1 e 50 permitindo de seguida ao utilizador fazer
//sucessivas tentativas até acertar nesse número. Em cada tentativa errada é mostrado ao utilizador uma das
//mensagens: “Tente um número maior” ou “Tente um número menor”. Quando o utilizador acertar no número
//deve ser mostrado o número de tentativas gastas pelo utilizador.

public class PL51 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        int randomNumber = rnd.nextInt(1, 51);
        int numero = -1;
        int contador = 0;

        System.out.println(randomNumber);

        while(numero != randomNumber) {
        System.out.println("Introduza um numero entre 1 e 50");
        numero = in.nextInt();
        if (numero < 1 || numero > 50) {
            System.out.println("Numero invalido, introduza de novo");
        } else {
            if (numero < randomNumber) {
                System.out.println("Tente um numero maior");
            } else if (numero > randomNumber) {
                System.out.println("Tente um numero menor");
            } else if (numero == randomNumber) {
                System.out.println("Acertou, o numero era: " + randomNumber + "em " + contador + "tentativas!");
            }
            contador++;
        }
    }
    }
}
/*
        System.out.println("Introduza um numero entre 1 e 50");
        int numero = in.nextInt();
        int contador = 0;
        if (numero < 1 || numero > 50) {
            System.out.println("Numero invalido, introduza de novo");
        }
       {
            do {
                if (numero < randomNumber) {
                    System.out.println("Tente um numero maior");
                    contador++;
                } else if (numero > randomNumber) {

                    System.out.printf("Tente um numero menor");
                    contador++;
                }else{
                    break;
                }
                numero = in.nextInt();
            } while (numero != randomNumber);
        } contador++;
        System.out.printf("Acertou, o numero era: " + randomNumber + "em " + contador + "tentativas!");
    }
}
*/





