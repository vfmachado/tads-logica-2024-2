import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numerosInteiros;    // 
        Integer numeroInt2;

        System.out.println("MENOR INT POSSIVEL " + Integer.MIN_VALUE);
        System.out.println("MAIOR INT POSSIVEL " + Integer.MAX_VALUE);
        
        // short Short
        // byte  Byte
        // long  Long   // normalmente para contar tempo
        System.out.println("BYTE MAXIMO " + Byte.MAX_VALUE);


        // PAGARME int para dinheiro

        float nb8;  // altura, estatistica, peso, dinheiro, 
        double muitasCasasDecimais;
    
        // EM JAVA tem que colocar esse f no final da declaração do número
        // f => faz um cast para float
        nb8 = 12.12f;
        muitasCasasDecimais = 124.123141243124;

        // Float realNaoPrimitivo;
        // Double realComVariasCasasNaoPrimitivos;

        // cast => converte um tipo em outro
        // so preciso fazer de um tipo maior para um tipo menor
        double valorD = 12412.2412213123;
        int valorI = (int) valorD; 

        // FLAG 
        boolean verdadeiroOuFalso;
        // VALORES BOOLEANS SAO UTILIZADOS PARA CONTROLAR O FLUXO DO MEU CODIGO.
        verdadeiroOuFalso = true; // false


        char letra = 'A';
        String texto = "TEXTO";     // tipo nao primitivo para guardar valores

    }
}
