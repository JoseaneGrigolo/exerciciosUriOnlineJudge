package modulo01;

import java.util.Locale;
import java.util.Scanner;

//1038
public class lanche {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int qtdade = sc.nextInt();
        double total = 0;

        if (codigo == 1) {
            total = qtdade * 4.00;
        } else if (codigo == 2) {
            total = qtdade * 4.50;
        } else if (codigo == 3) {
            total = qtdade * 5.00;
        } else if (codigo == 4) {
            total = qtdade * 2.00;
        } else {
            total = qtdade * 1.50;
        }
        System.out.printf("Total: R$ %.2f\n", total);

        sc.close();
    }
}
