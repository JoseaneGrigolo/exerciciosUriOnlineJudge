package modulo01;

import java.util.Locale;
import java.util.Scanner;

//1010
public class calculoSimples {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1 = sc.nextInt();
        int numPecas1 = sc.nextInt();
        double valorUnit1 = sc.nextDouble();

        int codigo2 = sc.nextInt();
        int numPecas2 = sc.nextInt();
        double valorUnit2 = sc.nextDouble();

        double valor = (numPecas1 * valorUnit1) + (numPecas2 * valorUnit2);

        System.out.printf("VALOR A PAGAR = R$ %.2f\n", valor);

        sc.close();
    }
}
