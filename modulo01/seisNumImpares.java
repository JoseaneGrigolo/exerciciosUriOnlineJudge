package modulo01;

import java.util.Scanner;

//1070
public class seisNumImpares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 0; i < 12; i++) {
            if (x % 2 != 0)
                System.out.println(x);
            x = x + 1;
        }
        sc.close();

    }
}
