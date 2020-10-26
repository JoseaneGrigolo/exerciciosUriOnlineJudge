package modulo01;

import java.util.Locale;
import java.util.Scanner;
//1021
public class notasEmoedas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        int aux = 0;

        System.out.println("NOTAS:");
        aux = (int) n / 100;
        System.out.printf("%d nota(s) de R$ 100.00\n", aux);
        n = n % 100.0;

        aux = (int) n / 50;
        System.out.printf("%d nota(s) de R$ 50.00\n", aux);
        n = n % 50.0;

        aux = (int) n / 20;
        System.out.printf("%d nota(s) de R$ 20.00\n", aux);
        n = n % 20.0;

        aux = (int) n / 10;
        System.out.printf("%d nota(s) de R$ 10.00\n", aux);
        n = n % 10.0;

        aux = (int) n / 5;
        System.out.printf("%d nota(s) de R$ 5.00\n", aux);
        n = n % 5.0;

        aux = (int) n / 2;
        System.out.printf("%d nota(s) de R$ 2.00\n", aux);
        n = n % 2.0;

        n = n * 100.0;
        System.out.println("MOEDAS:");

        aux = (int) n / 100;
        System.out.printf("%d moeda(s) de R$ 1.00\n", aux);
        n = n % 100.0;

        aux = (int) n / 50;
        System.out.printf("%d moeda(s) de R$ 0.50\n", aux);
        n = n % 50.0;

        aux = (int) n / 25;
        System.out.printf("%d moeda(s) de R$ 0.25\n", aux);
        n = n % 25.0;

        aux = (int) n / 10;
        System.out.printf("%d moeda(s) de R$ 0.10\n", aux);
        n = n % 10.0;

        aux = (int) n / 5;
        System.out.printf("%d moeda(s) de R$ 0.05\n", aux);
        n = n % 5.0;

        aux = (int) n / 1;
        System.out.printf("%d moeda(s) de R$ 0.01\n", aux);
        n = n % 1.0;

        sc.close();

    }
}
