package modulo01;

import java.util.Scanner;

//1046
public class tempoDeJogo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horaInicio = sc.nextInt();
        int horaFim = sc.nextInt();
        int duracao = 0;

        if (horaInicio == horaFim) {
            duracao = 24;
        } else {
            duracao = 24 - (24 + horaInicio - horaFim) % 24;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);

        sc.close();

    }
}
