package modulo01;

import java.util.Locale;
import java.util.Scanner;
//1051

public class impostoDeRenda {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();
        double imposto = 0;
        double diferenca = 0;

        if (valor <= 2000.00) {
            System.out.println("Isento");

        } else if (valor >= 2000.01 && valor <= 3000.00) {
            System.out.printf("R$ %.2f\n", (valor - 2000.00) * 0.08);

        } else if (valor >= 3000.01 && valor <= 4500.00) {
            imposto = 1000.00 * 0.08;
            diferenca = valor - 3000.00;
            imposto += diferenca * 0.18;
            System.out.printf("R$ %.2f\n", imposto);

        } else {
            imposto = 1000.00 * 0.08 + 1500.00 * 0.18;
            diferenca = valor - 4500.00;
            imposto += diferenca * 0.28;
            System.out.printf("R$ %.2f\n", imposto);
        }
        sc.close();
    }
}
