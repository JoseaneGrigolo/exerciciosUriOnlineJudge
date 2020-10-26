package modulo01;

import java.util.Locale;
import java.util.Scanner;

//1012
public class area {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double triangulo = (a * c) / 2;
        double pi = 3.14159;
        double circulo = pi * Math.pow(c, 2);
        double trapezio = c * (a + b) / 2;
        double quadrado = Math.pow(b, 2);
        double retangulo = a * b;


        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);

        sc.close();

    }
}
