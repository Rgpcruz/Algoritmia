

import java.util.Random;
import java.util.Scanner;

import AlgoFunctions.Soma;
import AlgoFunctions.sub;

import javax.naming.ldap.Rdn;

public class ex41 {
//Lotaria
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduza um numero maior que 1000 e menor que 9999, introduzindo um digito de cada vez, da direita para a esquerda");
        System.out.println("Introduza o primeiro numero:");
        int n1 = in.nextInt();
        System.out.println("Introduza o segundo numero:");
        int n2 = in.nextInt();
        System.out.println("Introduza o terceiro numero:");
        int n3 = in.nextInt();
        System.out.println("Introduza o quarto numero:");
        int n4 = in.nextInt();
        if (n4<1){
            System.out.println("O  numero tem de ser supeior a 1000");
        }

        Random rnd = new Random();
        int np1 = rnd.nextInt(0,9);
        int np2 = rnd.nextInt(0, 9);
        int np3 = rnd.nextInt(0, 9);
        int np4 = rnd.nextInt(1, 9);

        if (n4==np4 && n3==np3 && n2==np2 && n1==np1) {
            System.out.println("Ganohu o primeiro premio");
        } else if (n1==np1 && n3==np3 && n2==np2) {
            System.out.println("Ganohu o segundo premio");
        } else if (n1==np1 && n2==np2) {
            System.out.println("Ganohu o terceiro premio");
        }else{
            System.out.println("Não foi premiado");
        }

    }
    }


