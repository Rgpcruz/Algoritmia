
import java.util.Random;
import java.util.Scanner;

public class PL52 {

    static int menuJogos() {
        Scanner input = new Scanner(System.in);

        int op;
        do {
            System.out.println("Bem vindo ao programa!");
            System.out.println("Escolha uma das seguintes opções");
            System.out.println("1 - Jogo1");
            System.out.println("2 - Jogos2");
            System.out.println("3 - Fosforos");
            System.out.println("0 - Sair");
            op = input.nextInt();
        } while (op < 0 || op > 3);
        return op;
    }

    static int menuDificuldade() {
        Scanner input = new Scanner(System.in);
        int op;
        do {
            System.out.println("Escolha uma das seguintes opções");
            System.out.println("1 - Dificuldade 1");
            System.out.println("2 - Dificuldade 2");
            System.out.println("3 - Dificuldade 3");
            System.out.println("0 - Voltar ao menu anterior");
            op = input.nextInt();
        } while (op < 0 || op > 3);
        return op;
    }

    static void mainDificuldades() {
        int op = menuDificuldade();
        switch (op) {
            case 1:
                Jogo1();
                break;
            case 2:
                Dificuldade2();
                break;
            case 3:
                Dificuldade3();
                break;
            default:
                break;
        }
    }

    static int menuFosforos() {
        Scanner input = new Scanner(System.in);
        int op;
        do {
            System.out.println("Escolha uma das seguintes opções");
            System.out.println("1 - Fosforo PvP");
            System.out.println("2 - Fosforo PvE");
            System.out.println("0 - Voltar ao menu anterior");
            op = input.nextInt();
        } while (op < 0 || op > 2);
        return op;
    }

    static void mainFosforos() {
        int op = menuFosforos();
        switch (op) {
            case 1:
                fosforos();
                break;
            case 2:

                break;

            default:
                break;
        }
    }

    public static void main(String[] args) {

        int op = menuJogos();
        switch (op) {
            case 1:
                Jogo1();
                break;
            case 2:
                mainDificuldades();
                break;
            case 3:
                mainFosforos();
                ;
                break;

        }
    }

    public static void Jogo1() {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        int randomNumber = rnd.nextInt(1, 21);
        int numero = -1;
        int contador = 0;


        while (numero != randomNumber) {
            System.out.println("Introduza um numero entre 1 e 20");
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

    public static void Dificuldade2() {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        int randomNumber = rnd.nextInt(1, 21);
        int numero = -1;
        int contador = 3;

        //for (int i = 0; i < contador; i++) {
        while (numero != randomNumber && contador > 0) {
            System.out.println("Introduza um numero entre 1 e 20, tem apenas " + contador + " tentativas para adivinhar");
            numero = in.nextInt();
            if (numero < 1 || numero > 20) {
                System.out.println("Numero invalido, introduza de novo");
            } else {
                contador--;

                if (contador == 0) {
                    System.out.println("Esgotou as suas 3 tentativas, o número era: " + randomNumber);
                } else if (numero < randomNumber) {
                    System.out.println("Tente um numero maior, tem mais " + contador + "tentativas");
                } else if (numero > randomNumber) {
                    System.out.println("Tente um numero menor tem mais " + contador + "tentativas");
                } else if (numero == randomNumber) {
                    System.out.println("Acertou, o numero era: " + randomNumber + "em " + contador + "tentativas!");

                } else {
                    break;
                }


            }
        }
    }

    /*public static void Dificuldade3() {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        int randomNumber = rnd.nextInt(1, 21);
        int numero = -1;
        int contador = 0;

        System.out.println(randomNumber);

        while (numero != randomNumber) {
            System.out.println("Introduza um numero entre 1 e 20");
            numero = in.nextInt();
            if (numero < 1 || numero > 20) {
                System.out.println("Numero invalido, introduza de novo");
            }
                contador++;
                if (numero < randomNumber) {
                    int dif = randomNumber - numero;
                    if (dif < 2 || dif >2) {
                        System.out.println("Esta perto");
                    }else if (dif < 2 || dif >5){
                        System.out.println("Nem perto nem longe");
                    }else if (dif < 5 || dif >5) {
                        System.out.println("Está longe");

                } else if (numero > randomNumber) {
                    dif = numero - randomNumber;
                    if  (dif == 2 || dif >2) {
                        System.out.println("Esta perto");
                    }else if (dif < 2 || dif >5){
                        System.out.println("Nem perto nem longe");
                    }else if (dif < 5 || dif >5) {
                        System.out.println("Está longe");

                    }
                } else if (numero == randomNumber) {
                    System.out.println("Acertou, o numero era: " + randomNumber + "em " + contador + "tentativas!");
                }

            }
        }
    }}*/


    public static void Dificuldade3() {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        int randomNumber = rnd.nextInt(1, 21); // Gera um número entre 1 e 20
        int numero = -1;
        int contador = 0;

        System.out.println("Bem-vindo à Dificuldade 3!");
        System.out.println("Tente adivinhar o número entre 1 e 20.");

        while (numero != randomNumber) {
            System.out.print("Introduza um número: ");
            numero = in.nextInt();


            if (numero < 1 || numero > 20) {
                System.out.println("Número inválido! Por favor, insira um número entre 1 e 20.");
                continue;
            }

            contador++;

            int dif = Math.abs(randomNumber - numero);

            if (dif <= 2) {
                System.out.println("Está perto.");
            } else if (dif <= 5) {
                System.out.println("Nem perto nem longe.");
            } else {
                System.out.println("Está longe.");
            }

            if (numero == randomNumber) {
                System.out.println("Parabéns! Você acertou o número: " + randomNumber);
                System.out.println("Você precisou de " + contador + " tentativas.");
                break;
            }
        }


    }


    public static void fosforos() {

        //Jogo dos 21 fósforos: 2 utilizadores devem, alternadamente, retirar entre 1 e 4 fósforos de um total de 21, sendo
        //que o utilizador que ficar com o último fósforo perde. Deve criar a aplicação para que permita jogarem 2
        //utilizadores um contra o outro ou um utilizador contra o computador (começando em primeiro ou segundo lugar).

        //Condição para ganhar é Fosforo ==1
        //

        Scanner in = new Scanner(System.in);

        int totalFosforos = 21;
        int contador = 0;

        System.out.println("Jogadore 1, qual é o seu nome?");
        String j1 = in.nextLine();
        System.out.println("Olá " + j1);
        System.out.println("Jogador 2, qual é o seu nome?");
        String j2 = in.nextLine();
        System.out.println("Olá " + j2);
        System.out.println("Tem 21 Fosforos, ambos os utilizadores podem retirar, alternadamente 1 a 4 fosforos, o utilzador que retirar o ultimo fosforo perde");

        while (totalFosforos > 0) {

            System.out.println(j1 + "Quantos foforos deseja retirar?");
            int f1 = in.nextInt();
            if (f1 < 1 || f1 > 4) {
                System.out.println("Numero Invalido, tem de estar entre 1 e 4, incluidos");
                in.nextInt();
            } else {
                totalFosforos -= f1;
                contador++;


            }
            System.out.println(j2 + "Quantos foforos deseja retirar");
            int f2 = in.nextInt();
            if (f2 < 1 || f2 > 4) {
                System.out.println("Numero Invalido, tem de estar entre 1 e 4, incluidos");
                in.nextInt();
            } else {
                totalFosforos -= f2;
                contador++;

            }
        }
        if (contador % 2 == 0) {
            System.out.println("Ups " + j2 + " perdeu, boa sorte para a proxima");
        } else {
            System.out.println("Ups " + j1 + " perdeu, boa sorte para a proxima");
        }
    }
}








