import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float largura, comprimento, altura, volumeCaixa;
        int quantidadeCaixas;

        largura = in.nextFloat();
        comprimento = in.nextFloat();
        altura = in.nextFloat();
        volumeCaixa = in.nextFloat();

        quantidadeCaixas = (int) ((largura * comprimento * altura) / volumeCaixa);
        System.out.println("QUANTIDADE DE CAIXAS QUE CABEM " + quantidadeCaixas );

    }
}