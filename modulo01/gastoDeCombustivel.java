package modulo01;

import java.util.Locale;
import java.util.Scanner;

//1017
public class gastoDeCombustivel {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempoHoras = sc.nextInt();
        int mediaKm = sc.nextInt();
        double qtdadeLitros = (mediaKm * tempoHoras) / 12.0;

        System.out.printf("%.3f\n", qtdadeLitros);
        sc.close();

    }
}
