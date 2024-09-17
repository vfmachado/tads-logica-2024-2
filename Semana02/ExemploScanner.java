import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // calcula a quantidade de carne que preciso comprar os cachorros grandes e pequenos

        // quantidade de dogs grandes e dogs pequenos;
        // para cada grande => 200grs
        // para cada pequenos => 50grs
        byte grandes, pequenos;
        int total;

        System.out.println("Quantos grandes e pequenos");
        grandes = in.nextByte();
        pequenos = in.nextByte();

        total = grandes * 200 + pequenos * 50; 
        /*
            +   => soma
            -   => subtracao
            /   => divisao
            *   => mult

            %   => resto

            as operacoes seguem o tipo do dado
            int a = 5;
            int b = 2;
            int c = a / b;  => 2
            float d = (float)a  / b;

            int resto = a % b;      => resto da divisao de 5 por 2 => 1
            int resto = 10 % 4 ;    2;


        */

        System.out.println("FOI DIGITADO " + grandes + "  " + pequenos);
        System.out.println("TOTAL NECESSARIO PARA ALIMENTAR OS DOGS " + total);

    }
}
