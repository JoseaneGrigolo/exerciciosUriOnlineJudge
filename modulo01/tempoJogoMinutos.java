package modulo01;

import java.util.Scanner;

//1047
public class tempoJogoMinutos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horaInicio = sc.nextInt();
        int minInicio = sc.nextInt();
        int minI = horaInicio * 60 + minInicio;

        int horaFim = sc.nextInt();
        int minFim = sc.nextInt();
        int minF = horaFim * 60 + minFim;

        int duracao = (24 * 60 - minI) + minF;
        int horas = duracao / 60;
        int minutos = duracao % 60;

        if (horas >= 24 && minutos >= 1) {
            horas = horas % 24;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);

        sc.close();

    }
}
