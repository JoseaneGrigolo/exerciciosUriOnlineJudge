package modulo01;

import java.util.Locale;
import java.util.Scanner;

//1008
public class salario {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int numeroHoras = sc.nextInt();
        double valorHora = sc.nextDouble();
        double salario = numeroHoras * valorHora;

        System.out.printf("NUMBER = %d\n", numero);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        sc.close();
    }
}
