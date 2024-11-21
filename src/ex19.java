
import java.util.Scanner;

public class ex19 {

//Crie um programa que permita converter um valor em horas para segundos e mostre o valor em segundos.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a horas que deseja converter em segundos");
        double horas = in.nextDouble();
        double segundos = horas * 3600;
        System.out.printf("As horas: " + horas + "tem um total de " + segundos + " segundos");
    }}

