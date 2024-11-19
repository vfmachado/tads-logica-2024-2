import java.util.Scanner;

public class Vetores03 {
    public static void main(String[] args) {
        
        // faça um programa que leia 5 valores do tipo float do usuario e mostre na ordem e depois na ordem inversa
        Scanner in = new Scanner(System.in);
        float [] valores = new float[5];

        // valores[0] = in.nextFloat();
        // valores[1] = in.nextFloat();
        // valores[2] = in.nextFloat();
        // valores[3] = in.nextFloat();
        // valores[4] = in.nextFloat();
        
        // valores.length significa tamanho do vetor
        // sempre percorremos o vetor até tamanho-1
        // caso contrario teremos um erro chamado
        // IndexOutOfBoundsException
        for (int i = 0; i < valores.length; i++) {
            //  para cada valor de i (de 0 a 4) vou ler um valor do tipo float e associar na posicao i 
            valores[i] = in.nextFloat();
        }

        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + "  ");
        }
        System.out.println();

        for (int i = valores.length-1; i >= 0; i--) {
            System.out.print(valores[i] + "  ");
        }
        System.out.println();
    }

}
