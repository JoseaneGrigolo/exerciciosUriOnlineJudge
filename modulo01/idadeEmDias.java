package modulo01;

import java.util.Scanner;

//1020
public class idadeEmDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idadeDias = sc.nextInt();
        //365 30
        int anos = idadeDias / 365;
        int resto = idadeDias % 365;
        int meses = resto / 30;
        int dias = resto % 30;

        System.out.printf("%d ano(s)\n", anos);
        System.out.printf("%d mes(s)\n", meses);
        System.out.printf("%d dia(s)\n", dias);

        sc.close();

    }
}
