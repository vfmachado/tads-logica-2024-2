import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float[] transacoes = new float[0];

        while (true) {

            float transacao = in.nextFloat();

            float [] memoria = transacoes;
            transacoes = new float[transacoes.length+1];
            
            for (int i = 0; i < memoria.length; i++) {
                transacoes[i] = memoria[i];
            }    

            transacoes[transacoes.length -1] = transacao;
        
        
            float saldo = 0;
            System.out.println();
            for (int i = 0; i < transacoes.length; i++) {
                System.out.print(transacoes[i] + "  ");
                saldo = saldo + transacoes[i];
            }
            System.out.println();
            System.out.println("SALDO " + saldo);
        }
    }
}
