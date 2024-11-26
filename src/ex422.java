

import java.util.Random;
import java.util.Scanner;


//O segundo tipo de raspadinhas tem um número principal aleatório entre 1 e 10 e um valor de prémio
//previamente atribuídos e sorteados (1 a 10€). Caso nos 9 números sorteados apareçam 3 vezes o número
//principal a raspadinha é premiada.

public class ex422 {
    //Lotaria
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int contador = 0;

        int numUtilizador = rnd.nextInt(1, 10);
        int valorPremio = rnd.nextInt(10);
        int valorAleatorio;
        for (int i = 0; i < 10; i++) {
            valorAleatorio = rnd.nextInt(10);
            if (valorAleatorio == numUtilizador) {
                contador++;
            }

        }if(contador >=3){
            System.out.println("Ganhou "+valorPremio + "Euros");
        }else {
            System.out.println("Não ganhou");
        }

}
}



















