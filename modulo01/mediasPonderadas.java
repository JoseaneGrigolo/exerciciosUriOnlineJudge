package modulo01;

import java.util.Locale;
import java.util.Scanner;

//1079
public class mediasPonderadas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double a, b, c;
        for (int i = 0; i < n; i++) {
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            System.out.printf("%.1f\n", (a * 0.2) + (b * 0.3) + (c * 0.5));
        }

        sc.close();

    }
}
