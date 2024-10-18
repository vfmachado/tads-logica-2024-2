import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random aleatorio = new Random();

        /*
             FACA UM JOGO PEDRA PAPEL TESOURA, ONDE O COMPUTADOR SORTEIA A CADA RODADA UMA DAS TRES OPCOES E O USUARIO ESCOLHE UMA OPCAO. DEVE SER UMA MELHOR DE 3 JOGADAS, NO FINAL, INDICAR QUEM FOI O VENCEDOR
        */
       System.out.println("VOCE VAI JOGAR PEDRA, PAPEL, TESOURA CONTRA O COMPUTADOR" + "\nSEREMOS JUSTOS E SORTEAREMOS ALEATORIAMENTE UM VALOR PARA O COMPUTADOR" +
       "\nESCOLHA: " +
       "\n\t1. PEDRA" +
       "\n\t2. PAPEL" +
       "\n\t3. TESOURA");

        // 3 RODADAS
        int usuario;
        int computador;
        int rodada;
        int usuarioGanhou;
        int computadorGanhou;
        usuario = in.nextInt();
        computador = aleatorio.nextInt(3) + 1;  // 1 a 3
                                // 0  1  2 
        if (usuario == computador) {
            // empatou
        } else if ((usuario == 1 && computador == 3) || // pedra > tesoura
                (usuario == 3 && computador == 2) ||
                (usuario == 2 && computador == 1)
        )  {
            // usuario ganhou
        } else {
            // computador ganhou
        }

    }
}