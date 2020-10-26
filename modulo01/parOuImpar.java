package modulo01;

import java.util.Scanner;

//1074
public class parOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int valores;

        for (int i = 0; i < n; i++) {
            valores = sc.nextInt();
            if (valores % 2 == 0 && valores > 0) {
                System.out.println("EVEN POSITIVE");
            } else if (valores % 2 == 0 && valores < 0) {
                System.out.println("EVEN NEGATIVE");
            } else if (valores % 2 != 0 && valores > 0) {
                System.out.println("ODD POSITIVE");
            } else if (valores % 2 != 0 && valores < 0) {
                System.out.println("ODD NEGATIVE");
            } else {
                System.out.println("NULL");
            }
        }
        sc.close();
    }
}
