package modulo01;

import java.util.Scanner;
//1013
public class oMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maiorAB = (a + b + Math.abs(a - b))/2;
        int maiorABC = (maiorAB + c + Math.abs(maiorAB - c))/2;
        System.out.printf("%d eh o maior\n", maiorABC);

        sc.close();

    }
}
