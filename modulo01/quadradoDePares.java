package modulo01;

import java.util.Scanner;

//1073
public class quadradoDePares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "^2 = " + (int) Math.pow(i, 2));
            }
        }
        sc.close();
    }
}

