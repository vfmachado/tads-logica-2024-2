import java.util.Scanner;

public class Simulado03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escolha uma opcao " +
            "\n\t1. Depositar" +
            "\n\t2. Sacar"+
            "\n\t3. Sair"
        );
        float saldo = 0;
        int opcao;

        opcao = 0;
        while (opcao != 3) {
            opcao = in.nextInt();
            if (opcao == 1) {
                System.out.println("Qual valor a ser depositado");
                float valor = in.nextFloat();
                saldo = saldo + valor;
            } else if (opcao == 2) {

                System.out.println("Quanto deseja sacar?");
                float valor = in.nextFloat();

                if (valor > saldo) {
                    System.out.println("impossivel sacar esta quantia");
                } else {
                    saldo = saldo - valor;
                }
            }
            System.out.println("SALDO ATUAL " + saldo);
        }

    }
}
