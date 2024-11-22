
import java.util.Scanner;

public class ex20 {

//Crie um programa que permita converter um valor em dias para anos, semanas e dias.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insira o valor em dias: ");
        int dias = in.nextInt();



        if (dias < 365) {
            int semana = dias / 7;
            int diasSemana = dias % 7;
            System.out.printf("o Valor contem " + semana + " semanas e " + diasSemana + " dias");
        }else{
            int anoNovo = dias / 365;
            int semanaAno = dias % 365;
            int diasAno = semanaAno / 7;
            System.out.printf("o Valor contem " + anoNovo + " Ano "+semanaAno + " semanas e " + diasAno + " dias");
        }
        }
    }

