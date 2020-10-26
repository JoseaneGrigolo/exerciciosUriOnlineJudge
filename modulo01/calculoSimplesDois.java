package modulo01;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
//1010
public class calculoSimplesDois {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Obtendo valor em linha
        String val1 = sc.nextLine();
        String val2 = sc.nextLine();

        //Gerando array, quebrando por espaços
        String array1[] = val1.split(" ");
        String array2[] = val2.split(" ");

        //Distribuindo var e transformando
        int codigo1 = Integer.parseInt(array1[0]);
        int numPecas1 = Integer.parseInt(array1[1]);
        double valorUnit1 = Double.parseDouble(array1[2]);
        int codigo2 = Integer.parseInt(array2[0]);
        int numPecas2 = Integer.parseInt(array2[1]);
        double valorUnit2 = Double.parseDouble(array2[2]);

        //Total
        double valor = numPecas1 * valorUnit1 + numPecas2 * valorUnit2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor);

        sc.close();
    }

}
