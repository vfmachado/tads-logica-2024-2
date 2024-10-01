import java.util.Scanner;

public class ExemploCondicao {
    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);
        // int String char double float

        int valor = 10;

        // verificar se o valor esta entre [5 e 15]
        // if (valor >= 5) {
        //     if (valor <= 15) {
        //         System.out.println("O VALOR ESTA NO INTERVALO [5, 15]")
        //     } else {
        //         System.out.println("NAO ESTA NO INTERVALO");
        //     }
        // } else {
        //     System.out.println("NAO ESTA NO INTERVALO");
        // }

        // AND &&
        // VALOR MAIOR OU IGUAL 5 EEEEEE VALOR MENOR OU IGUAL A 15
        // AND && RESULTA EM VERDADEIRO/TRUE QUANADO AMBOS VALORES LOGICOS SAO VERDADEIROS
        if (valor >= 5 && valor <= 15) {
                System.out.println("O VALOR ESTA NO INTERVALO [5, 15]")
        } else {
            System.out.println("NAO ESTA NO INTERVALO");
        }
        

        // VALOR ESTA FORA DO INTERVALO <5 OU >15
        // OR ||   DOIS PIPES (DUAS BARRAS RETAS)
        if (valor < 5 || valor > 15) {
            // fora do intervalo
        }

        // if ( (a < b && a < c) || b == c )

        /*
            >       >=      <       <=      ==      !=
            
            !   nao
                boolean aberto = true;
                !aberto;

                boolean ganhou = false;
                if (!ganhou) { o jogo continua }

                if (ganhou)
                System.out.println("ganhou");
        */
     }
}