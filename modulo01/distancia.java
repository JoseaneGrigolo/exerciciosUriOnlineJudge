package modulo01;

import java.util.Scanner;

//1016
public class distancia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int distanciaKm = sc.nextInt();
        int tempoY = distanciaKm * 2;
        System.out.printf("%d minutos\n", tempoY);

        sc.close();
    }
}
