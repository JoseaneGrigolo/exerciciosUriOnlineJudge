package modulo01;

import java.util.Scanner;

//1019
public class conversaoDeTempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int horas = n / 3600;
        int resto = n % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
        sc.close();
    }
}
