
import java.util.Scanner;

public class ex14 {

//nao gosto de while

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        double xxx;
        double total = 0;

        while (i<=50) {
            System.out.println("Insira 1 numero ");
            int numero = in.nextInt();
            total += numero;
            i++;
        }
        xxx = total / i;
        System.out.printf("A média é:" + xxx
        );

    }

}
