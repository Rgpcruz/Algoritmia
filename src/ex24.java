
import java.util.Scanner;

public class ex24 {

    //Ler N números, determinar o maior, o menor e a média dos N números lidos.


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Diga quantos numeros vai introduzir: ");
        int nTotal = in.nextInt();
        if (nTotal <= 0) {
            System.out.println("O número total deve ser maior que zero.");
            return;
        }

        double somaNum = 0;
        int maximo = -99999;
        int minimo = 99999;
        for (int i = 1; i <= nTotal; i++) {
            System.out.print("Insira um numero: ");
            int num = in.nextInt();
            somaNum = somaNum + num;

            if (num > maximo) {
                maximo = num;}
            if (num < minimo) {
                minimo = num;
            }

        }
        double mediaNum = somaNum / nTotal;
        System.out.printf("O numero maximo é: " + maximo + " o valor minimo é: " + minimo + "a media de numeros é: " + mediaNum);
    }


}



