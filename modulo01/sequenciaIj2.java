package modulo01;
//1096
public class sequenciaIj2 {
    public static void main(String[] args) {

        int j [] = {7, 6, 5} ;
        for (int i = 1; i <= 10; i++) {
            if(i%2 != 0){
                System.out.printf("I=%d J=%d\n", i, j[0]);
                System.out.printf("I=%d J=%d\n", i, j[1]);
                System.out.printf("I=%d J=%d\n", i, j[2]);
            }
        }

    }
}
