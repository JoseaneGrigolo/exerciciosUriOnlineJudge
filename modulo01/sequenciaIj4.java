package modulo01;

import java.util.Locale;
//1098
public class sequenciaIj4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        for (double i = 0; i <= 2; i += 0.2) {
            if (i == 0.0 || i == 1.0 || i > 1.9) {
                System.out.printf("I=%.0f J=%.0f\n", i, i + 1);
                System.out.printf("I=%.0f J=%.0f\n", i, i + 2);
                System.out.printf("I=%.0f J=%.0f\n", i, i + 3);

            } else {

                System.out.printf("I=%.1f J=%.1f\n", i, i + 1);
                System.out.printf("I=%.1f J=%.1f\n", i, i + 2);
                System.out.printf("I=%.1f J=%.1f\n", i, i + 3);
            }
        }
    }
}