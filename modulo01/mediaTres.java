package modulo01;

import java.util.Locale;
import java.util.Scanner;

//1040 - não aceita double
public class mediaTres {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        float n4 = sc.nextFloat();
        float exame = 0;

        float media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        if (media >= 5.0 && media <= 6.9) {
            exame = sc.nextFloat();
        }
        System.out.printf("Media: %.1f\n", media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            System.out.printf("Nota do exame: %.1f\n", exame);
            double mediaFinal = (media + exame) / 2;
            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", mediaFinal);
        } else {
            System.out.println("Aluno reprovado.");
        }
        sc.close();

    }
}
