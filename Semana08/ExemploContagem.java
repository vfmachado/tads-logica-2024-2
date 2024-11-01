public class ExemploContagem {
    public static void main(String[] args) {
        int n = 0;
        while (n < 10) {
            System.out.println(n);
            n++;
        }

        // for executa em 4 passos
        // (1) inicializa (2) testa   (3) executa   (4) interage (passo/incremento)
        //         1      2   <-  4
        for (int i = 0; i < 10; i++) {
            // 3
            System.out.println(i);
        }
        // i++;
        // i = i + 1;

        // ESCOPO - onde a variavel EXISTE
        // a variavel "i" só existe dentro do for

        // DENTRO DOS PARAMETROS DO FOR
        // TUDO É OPCIONAL
        for ( ; n > 0; n--) {
            System.out.println(n);
        }

       
    }
}
