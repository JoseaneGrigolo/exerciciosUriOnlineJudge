package modulo01;

import java.util.Locale;
import java.util.Scanner;
//1066
public class parImparPositivoNegativo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

        for (int i = 0; i < 5; i++) {
            num = sc.nextInt();
            if (num % 2 == 0) {
                par += 1;
            } else {
                impar += 1;
            }
            if (num > 0) {
                positivo += 1;
            } else if (num < 0) {
                negativo += 1;
            }
        }

        System.out.printf("%d valor(es) par(es)\n", par);
        System.out.printf("%d valor(es) impar(es)\n", impar);
        System.out.printf("%d valor(es) positivo(s)\n", positivo);
        System.out.printf("%d valor(es) negativo(s)\n", negativo);

        sc.close();
    }
}
