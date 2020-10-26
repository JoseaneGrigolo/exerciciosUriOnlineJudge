package modulo01;

import java.util.Locale;
import java.util.Scanner;

//1044
public class triangulo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if ((a < b + c) && (b < a + c) && (c < b + a)) {
            double perimetroTriangulo = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimetroTriangulo);
        } else {
            double areaTrapezio = ((a + b) / 2) * c;
            System.out.printf("Area = %.1f\n", areaTrapezio);
        }

        sc.close();
    }
}
