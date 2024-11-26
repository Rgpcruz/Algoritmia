

import java.util.Random;
import java.util.Scanner;

public class InterfaceS4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int operatorMenu;
        int saldoUtilizador;
        int valorGanho = 0;

        do {

            System.out.printf("Introduza o seu nome: ");
            String nome = in.nextLine();
            System.out.printf("Bem vindo " + nome + "! \n");
            System.out.printf("Quando deseja depositar " + nome + "? \n");
            saldoUtilizador = in.nextInt();
            System.out.printf( nome + " , o seu saldo é: " + saldoUtilizador + "euros \n ");
            System.out.println("Bem Vindo");
            System.out.println("Escolha uma das seguintes opções");
            System.out.println("1-Lotaria");
            System.out.println("2-Raspadinhas");
            System.out.println("3-Saldo");
            System.out.println("0-Sair");
            operatorMenu = in.nextInt();

            switch (operatorMenu) {
                case 1:
                    saldoUtilizador = saldoUtilizador - 5;
                    do {
                        System.out.println("Introduza um numero maior que 1000 e menor que 9999, introduzindo um digito de cada vez, da direita para a esquerda");
                        System.out.println("Introduza o primeiro numero:");
                        int n1 = in.nextInt();
                        System.out.println("Introduza o segundo numero:");
                        int n2 = in.nextInt();
                        System.out.println("Introduza o terceiro numero:");
                        int n3 = in.nextInt();
                        System.out.println("Introduza o quarto numero:");
                        int n4 = in.nextInt();
                        if (n4 < 1) {
                            System.out.println("O  numero tem de ser supeior a 1000");
                        }


                        int np1 = rnd.nextInt(0, 9);
                        int np2 = rnd.nextInt(0, 9);
                        int np3 = rnd.nextInt(0, 9);
                        int np4 = rnd.nextInt(1, 9);
                        int premio = rnd.nextInt(10, 100);
                        if (n4 == np4 && n3 == np3 && n2 == np2 && n1 == np1) {
                            System.out.println("Ganohu o primeiro premio");
                        } else if (n1 == np1 && n3 == np3 && n2 == np2) {
                            System.out.println("Ganohu o segundo premio");
                        } else if (n1 == np1 && n2 == np2) {
                            System.out.println("Ganohu o terceiro premio");
                        } else {
                            System.out.println("Não foi premiado");
                        }


                        valorGanho += premio;
                        break;


                    } while (operatorMenu != 0);

                case 2:


                    int operadorRasp;
                    do {
                        System.out.println("1-Raspadinha1");
                        System.out.println("2-Raspadinha2");
                        System.out.println("0-Voltar ao menu anterior");
                        operadorRasp = in.nextInt();
                        switch (operadorRasp) {

                            case 1:
                                saldoUtilizador = saldoUtilizador - 2;
                                System.out.println("Digite o seu numero de 1 a 10");
                                int num1 = in.nextInt();
                                if (num1 < 1 || num1 > 10) {
                                    System.out.println("O numero deve ser entre 1 a 10");
                                }

                                int valorTotal = 0;
                                for (int i = 0; i < 5; i++) {

                                    int numeroPremiado = rnd.nextInt(0, 10);
                                    if (numeroPremiado == num1) {

                                        int numeroRandom = rnd.nextInt(0, 100);
                                        valorTotal += numeroRandom;
                                    }


                                }
                                System.out.println("Ganhou " + valorTotal + "euros");

                                valorGanho += valorTotal;

                                break;

                            case 2:
                                saldoUtilizador = saldoUtilizador - 2;
                                int contador = 0;

                                int numUtilizador = rnd.nextInt(1, 10);
                                int valorPremio = rnd.nextInt(10);
                                int valorAleatorio;
                                for (int i = 0; i < 10; i++) {
                                    valorAleatorio = rnd.nextInt(10);
                                    if (valorAleatorio == numUtilizador) {
                                        contador++;
                                    }

                                }
                                if (contador >= 3) {
                                    System.out.println("Ganhou " + valorPremio + "Euros");
                                } else {
                                    System.out.println("Não ganhou");
                                }

                                valorGanho += valorPremio;

                                break;
                            case 0:
                                System.out.println("0-Voltar ao menu anterior");

                            default:
                                System.out.println("Tente de novo");
                                break;

                        }
                    } while (operadorRasp != 0);

                    break;

                case 3:
                    int operatorUser;
                    do {
                        System.out.println("1-Saldo");
                        System.out.println("2-Ganhos");
                        System.out.println("0-Sair");
                        operatorUser = in.nextInt();
                        switch (operatorUser) {
                            case 1:
                                System.out.println("Ainda tem disponiveis: " + saldoUtilizador);
                                break;

                            case 2:
                                System.out.println("Os seus ganhos são: " + valorGanho);

                        }


                    } while (operatorUser != 0);
            }
        }while (operatorMenu != 0);
    }
}





