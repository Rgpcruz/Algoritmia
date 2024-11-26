import com.sun.security.jgss.GSSUtil;

import java.util.Random;
import java.util.Scanner;


//Raspadinhas
//a. O primeiro tipo de raspadinhas contém um número principal e 5 números aleatórios (de 1 a 10), cada
//um com um valor monetário associado. Caso o número principal seja igual a um ou mais dos números
//aleatórios (de 1 a 10) o prémio é a soma dos montantes dos valores iguais ao número principal
//Exemplo: Número principal: 3
//1º número: 5 (100€)
//2º número: 7 (1€)
//3º número: 3 (1€)
//4º número: 5 (10€)
//5º número: 3 (10€)
//Prémio: 11€
//b. O segundo tipo de raspadinhas tem um número principal aleatório entre 1 e 10 e um valor de prémio
//previamente atribuídos e sorteados (1 a 10€). Caso nos 9 números sorteados apareçam 3 vezes o número
//principal a raspadinha é premiada.


public class ex42 {
    //Lotaria
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o seu numero de 1 a 10");
        int num1 = in.nextInt();
        if (num1 < 1 || num1 > 10) {
            System.out.println("O numero deve ser entre 1 a 10");
        }

        Random rnd = new Random();
        int valorTotal = 0;
        for (int i = 0; i < 5; i++) {

            int numeroPremiado = rnd.nextInt(0, 10);
            if (numeroPremiado == num1) {

                int numeroRandom = rnd.nextInt(0, 100);
                valorTotal += numeroRandom;
            }


        }System.out.println("Ganhou " + valorTotal + "euros");
    }
}











