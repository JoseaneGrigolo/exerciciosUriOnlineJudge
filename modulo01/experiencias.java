package modulo01;

import java.util.Locale;
import java.util.Scanner;

//1094
public class experiencias {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int quantia;
        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;
        int soma = 0;
        char tipo;

        for (int i = 0; i < n; i++) {
            quantia = sc.nextInt();
            soma += quantia;
            tipo = sc.next().charAt(0);
            if (tipo == 'C') {
                coelhos += quantia;
            } else if (tipo == 'R') {
                ratos += quantia;
            } else if (tipo == 'S') {
                sapos += quantia;
            }
        }
        System.out.printf("Total: %d cobaias\n", soma);
        System.out.printf("Total de coelhos: %d\n", coelhos);
        System.out.printf("Total de ratos: %d\n", ratos);
        System.out.printf("Total de sapos: %d\n", sapos);

        System.out.println("Percentual de coelhos: " + String.format("%.2f", (double)(coelhos*100.00)/soma) + " %");
        System.out.println("Percentual de ratos: " + String.format("%.2f", (double)(ratos*100.00)/soma) + " %");
        System.out.println("Percentual de sapos: " + String.format("%.2f", (double)(sapos*100.00)/soma) + " %");

        sc.close();

    }
}
