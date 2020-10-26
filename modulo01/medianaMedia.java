package modulo01;

import java.util.Scanner;

//1379
public class medianaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;

        while (a != 0 && b != 0) {
            c = 2 * a - b;
            System.out.println(c);
            a = sc.nextInt();
            b = sc.nextInt();
        }
        sc.close();
    }
}

