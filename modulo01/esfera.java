package modulo01;

import java.util.Locale;
import java.util.Scanner;

//1011
public class esfera {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double pi = 3.14159;
        double volumeEsfera = (4 / 3.0) * pi * Math.pow(r, 3);

        System.out.printf("VOLUME = %.3f\n", volumeEsfera);
        sc.close();

    }
}
