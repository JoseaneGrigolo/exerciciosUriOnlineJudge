package modulo01;

import java.util.Locale;
import java.util.Scanner;
//1009
public class salarioComBonus {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double salary = sc.nextDouble();
        double total = sc.nextDouble();
        double sales = total * 0.15;

        double salaryFinal = salary + sales;

        System.out.printf("TOTAL = R$ %.2f\n", salaryFinal);

        sc.close();
    }
}
