import java.util.Random;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random aleat = new Random();

        int sorteado = aleat.nextInt(6);
        int digitado; 
        
        System.out.println("(VC EH PAR) Escolha um numero");
        digitado = in.nextInt();

        // se a soma dos numeros for par, o usuario ganhou
        // caso contrario (else) - o computador ganhou

        int soma = sorteado + digitado;
        int resto = soma % 2;
        boolean par = resto == 0;
        
        System.out.println("O computador jogou " + sorteado);
        if (par) {
            System.out.println("Vc ganhou");
        } else {
            System.out.println("PC ganhou");
        }

        // if ( (sorteado + digitado) % 2 == 0) {}
    }
}