

import java.util.Scanner;
//O preço de um automóvel é calculado pela soma do preço de fábrica com o preço dos impostos (45% do preço
//de fábrica) e a percentagem do revendedor (28% do preço de fábrica). Faça um algoritmo que leia o nome do
//automóvel e o preço de fábrica e escreva o nome do automóvel e o preço final.
public class ex07 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o nome do automovel ");
        String nome = in.nextLine();
        System.out.println("Insira o preço de fábrica");
        double preco = in.nextDouble();
        double imposto = (preco * 0.45) ;
        double percentagemRevendedor = (preco * 0.28);
        double valorfinal = preco + imposto + percentagemRevendedor ;

        System.out.println("O nome do automovel é: " + nome + " e o preço final é : " + valorfinal);


    }
}