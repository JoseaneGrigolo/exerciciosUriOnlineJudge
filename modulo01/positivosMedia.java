package modulo01;

import java.util.Locale;
import java.util.Scanner;

//1064
public class positivosMedia {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double num;
        int count = 0;
        double soma = 0;

        for (int i = 0; i < 6; i++) {
            num = sc.nextDouble();
            if (num > 0) {
                count += 1;
                soma += num;
            }
        }
        System.out.printf("%d valores positivos\n", count);
        System.out.printf("%.1f\n", soma / count);
        sc.close();
    }
}
