package modulo01;

import java.util.Scanner;

//1072
public class intervaloDois {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x;
        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.printf("%d in\n", in);
        System.out.printf("%d out\n", out);

        sc.close();

    }
}
