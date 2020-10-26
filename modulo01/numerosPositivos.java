package modulo01;

import java.util.Locale;
import java.util.Scanner;

//1060
public class numerosPositivos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double num;
        int count = 0;

        for(int i = 0; i < 6; i++){
            num = sc.nextDouble();
            if(num > 0){
                count += 1;
            }
        }
        System.out.printf("%d valores positivos\n", count);
        sc.close();
    }
}
