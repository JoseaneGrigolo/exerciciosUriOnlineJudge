package modulo01;

import java.util.Scanner;
//1078
public class tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.printf(i + " x " + n + " = %d\n", i*n);
        }
        sc.close();
    }
}
