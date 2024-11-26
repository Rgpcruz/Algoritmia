
import java.util.Scanner;

import AlgoFunctions.Soma;
import AlgoFunctions.sub;

import javax.xml.transform.Source;

public class ex31 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int operatorMenu;

        do {


            System.out.println("Bem Vindo");
            System.out.println("Escolha uma das seguintes opções");
            System.out.println("1-Calculadora");
            System.out.println("2-Lista de numeros");
            System.out.println("3-Dizer Olá");
            System.out.println("4-Calendário");
            System.out.println("0-Sair");
            operatorMenu = in.nextInt();

            switch (operatorMenu) {

                case 1:

                    int operadorCalc;
                    do {
                        System.out.println("1-Soma");
                        System.out.println("2-Subtração");
                        System.out.println("3-Multiplicacao");
                        System.out.println("4-Divisao");
                        System.out.println("0-Voltar ao menu anterior");
                        operadorCalc = in.nextInt();
                        switch (operadorCalc) {

                            case 1:
                                System.out.println("1-Somar");

                                System.out.println("Introduza primeiro valor");
                                int n1 = in.nextInt();
                                System.out.println("Introduza segundo valor");
                                int n2 = in.nextInt();
                                int resultadoSoma = Soma.soma(n1, n2);
                                System.out.println("O resultado da Soma é: " + resultadoSoma);

                                break;
                            case 2:
                                System.out.println("2-Subtrair");

                                System.out.println("Introduza primeiro valor");
                                int s1 = in.nextInt();
                                System.out.println("Introduza segundo valor");
                                int s2 = in.nextInt();
                                int resultadoSub = sub.sub(s1, s2);
                                System.out.println("O resultado da subtração é: " + resultadoSub);

                                break;
                            case 0:
                                System.out.println("0-Voltar ao menu anterior");

                            default:
                                System.out.println("Tente de novo");
                                break;
                            case 3:
                                System.out.println("3-Multiplicação");
                                System.out.println("Introduza primeiro valor");
                                int m3 = in.nextInt();
                                System.out.println("Introduza segundo valor");
                                int m4 = in.nextInt();
                                System.out.println("O valor da multiplicação é: " + (m3*m4));
                                break;
                            case 4:
                                System.out.println("4-Divisao");
                                System.out.println("Introduza primeiro valor");
                                int d5 = in.nextInt();
                                System.out.println("Introduza segundo valor");
                                int d6 = in.nextInt();
                                System.out.println("O valor da divisão é: " + (d5/d6));
                                break;
                        }


                    } while (operadorCalc != 0);
                case 2:

                    System.out.println("Insira o limite Superior");
                    int limiteSuperior = in.nextInt();
                    System.out.println("Insira o limite Inferior");
                    int limiteInferior = in.nextInt();
                    if (limiteSuperior >= limiteInferior) {
                        for (int i = limiteInferior; i <= limiteSuperior; i++) {
                            System.out.println(i);
                        }
                    }else{
                        if (limiteSuperior <= limiteInferior) {
                            for (int i = limiteInferior; i >= limiteSuperior; i--) {
                                System.out.println(i);
                            }
                        }
                    }
                    break;
                case 0:
                    System.out.println("Sair do programa");
                    break;
                default:
                    System.out.println("Tente de novo");
                    break;

            }
        } while (operatorMenu != 0);
    }
}




