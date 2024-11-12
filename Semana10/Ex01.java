import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int inicial;
        int valor = 1;

        System.out.println("Informe o valor o inicial");
        inicial = in.nextInt();

        while (valor != 0) {
            System.out.println("Informe um valor");
            valor = in.nextInt();

            if (valor != 0) {
                if ( valor % inicial  == 0) {
                    System.out.println("é multiplo de " + inicial);
                } else if (inicial % valor == 0) {
                    System.out.println("é divisor de " + inicial);
                } else {
                    System.out.println("Nao eh nada de " + inicial);
                }
            }

            // 10 % 2  => 0        RESTO DA DIVISAO DE 10 POR 2 DA ZERO, LOGO, 10 É MULTIPLO DE 2
            // 2 % 10  => 2     COMO O RESTO NAO DA ZERO, ESSA RELACAO NAO FAZ SENTIDO PARA ESTE EXERICIO

            // de uma variavel, espaço de memória que tem um nome e um endereço

            // inicial = 5
            // valor = 10
            inicial = valor;

        }


    }
}
