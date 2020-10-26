package modulo01;

import java.util.Scanner;

//1042
public class sortSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));

        int aux;
        if (a != min && a != max) {
            aux = a;
        } else if (b != min && b != max) {
            aux = b;
        } else {
            aux = c;
        }

        System.out.printf("%d\n%d\n%d\n\n", min, aux, max);
        System.out.printf("%d\n%d\n%d\n", a, b, c);

        sc.close();

    }
}
