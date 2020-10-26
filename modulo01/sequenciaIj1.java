package modulo01;
//1095
public class sequenciaIj1 {
    public static void main(String[] args) {

        int j = 60;
        for (int i = 1; i <= 60; i++) {
            System.out.printf("I=%d J=%d\n", i, j);
            i = i + 2;
            j = j - 5;
            if (j < 0) {
                break;
            }

        }

    }
}

