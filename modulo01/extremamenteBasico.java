package modulo01;

//1001

import java.util.Scanner;

public class extremamenteBasico {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = a + b;

        System.out.printf("X = %d\n", x);

        sc.close();
    }
}
