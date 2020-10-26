package modulo01;

import java.util.Locale;
import java.util.Scanner;

//1045
public class tiposDeTriangulos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double aux;

        if (b > a) {
            aux = a;
            a = b;
            b = aux;
        }
        if (c > a) {
            aux = a;
            a = c;
            c = aux;
        }

        double a2 = Math.pow(a, 2);
        double bc2 = Math.pow(b, 2) + Math.pow(c, 2);

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (a2 > bc2) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (a2 < bc2) {
                System.out.println("TRIANGULO ACUTANGULO");
            } else {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (a == b && a == c && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || a == c || b == c) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        sc.close();
    }
}
