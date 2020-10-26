package modulo01;

import java.util.Locale;
import java.util.Scanner;

public class paresCincoNumeros {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;
        int count = 0;
        for(int i = 0; i < 5; i++){
            num = sc.nextInt();
            if(num%2==0){
                count += 1;

            }
        }
        System.out.printf("%d valores pares\n", count);
        sc.close();
    }
}
