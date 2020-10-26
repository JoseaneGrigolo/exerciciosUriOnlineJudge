package modulo01;

import java.util.Scanner;

//1061
public class tempoDeUmEvento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Obtendo valor em linha
        String info1 = sc.nextLine();
        String info2 = sc.nextLine();
        String info3 = sc.nextLine();
        String info4 = sc.nextLine();
        //Gerando array, quebrando por espaços e :
        String array1[] = info1.split(" ");
        String array2[] = info2.split(" : ");
        String array3[] = info3.split(" ");
        String array4[] = info4.split(" : ");
        //Distribuindo var e transformando
        int diaI = Integer.parseInt(array1[1]);
        int hI = Integer.parseInt(array2[0]);
        int mI = Integer.parseInt(array2[1]);
        int sI = Integer.parseInt(array2[2]);
        //Distribuindo var e transformando
        int diaF = Integer.parseInt(array3[1]);
        int hF = Integer.parseInt(array4[0]);
        int mF = Integer.parseInt(array4[1]);
        int sF = Integer.parseInt(array4[2]);
        //Convertendo tudo para segundos
        int segTotalI = hI * 3600 + mI * 60 + sI;
        int segTotalF = hF * 3600 + mF * 60 + sF;

        if (segTotalF > segTotalI) {
            System.out.println(diaF - diaI + " dia(s)");
            System.out.println((segTotalF - segTotalI) / 3600 + " hora(s)");
            System.out.println(((segTotalF - segTotalI) % 3600) / 60 + " minuto(s)");
            System.out.println(((segTotalF - segTotalI) % 3600) % 60 + " segundo(s)");
        } else {
            System.out.println((diaF - diaI) - 1 + " dia(s)");
            segTotalF += 86400;
            System.out.println((segTotalF - segTotalI) / 3600 + " hora(s)");
            System.out.println(((segTotalF - segTotalI) % 3600) / 60 + " minuto(s)");
            System.out.println(((segTotalF - segTotalI) % 3600) % 60 + " segundo(s)");

        }
        sc.close();

    }
}
