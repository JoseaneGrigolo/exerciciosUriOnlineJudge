package modulo01;

import java.util.Locale;
import java.util.Scanner;

//1080
public class maiorEposicao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        int maior = 0;
        int posicao = 0;
        int x = 0;

        for (int i = 0; i < 100; i++) {
            n = sc.nextInt();
            if (n > x) {
                maior = n;
                posicao = i + 1;
                x = n;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);

        sc.close();
    }
}
