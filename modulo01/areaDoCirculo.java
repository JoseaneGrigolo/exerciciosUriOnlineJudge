package modulo01;

import java.util.Locale;
import java.util.Scanner;

//1002
public class areaDoCirculo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double raio = sc.nextDouble();
        double area = pi * Math.pow(raio, 2);

        System.out.printf("A=%.4f\n", area);

        sc.close();
    }

}
