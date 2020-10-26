package modulo01;

//1097
public class sequenciaIj3 {
    public static void main(String[] args) {

        //J inicia em 7 e I em 1, primeira sequencia
        int x = 7;

        //soma 2 ao i, pois queremos 1, 3, 5, 7, 9
        for (int i = 1; i <= 10; i += 2) {

            //inicia em 7 e vai diminuindo
            for (int j = x; j >= x - 2; j--) {
                System.out.printf("I=%d J=%d\n", i, j);
            }
            //somamos 2 para proxima sequencia 9, 11, 13, 15
            x = x + 2;
        }
    }
}
