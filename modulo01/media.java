package modulo01;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

//1005
public class media {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double media = ((a * 3.5) + (b * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f\n", media);

        sc.close();
    }
}
