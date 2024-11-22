import java.util.Scanner;

public class ExemploString {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String texto = args[0];
        char[] letras = texto.toCharArray();
        boolean[] acertos = new boolean[letras.length];

        for (int i = 0; i < acertos.length; i++) {
            acertos[i] = false;
        }


        for (int i = 0; i < letras.length; i++) {
            System.out.print(letras[i] + "  ");
        }
        System.out.println();

        char letra;

        while (true) {

            letra = in.next().charAt(0);
            boolean tem = false;    // flag
            int encontrei = 0;
            // tem a letra no texto?
            for (int i = 0; i < letras.length; i++) {
                
                if (letras[i] == letra) {
                    System.out.println("ENCONTREI NA POSICAO " + i);
                    tem = true;
                    acertos[i] = true;
                    encontrei++;
                } 
            }

            if (!tem)
                System.out.println("NAO ENCONTREI A LETRA " + letra);
                

            int quantidade = 0;
            for (int i = 0; i < acertos.length; i++) {
                if (acertos[i]) {
                    quantidade++;
                    System.out.print(letras[i] + "  ");
                } else {
                    System.out.print("_  ");
                }
            }
            if (quantidade == letras.length) break;

            System.out.println();

            // if (encontrei == 0)
            //     System.out.println("NAO ENCONTREI A LETRA " + letra);
        }
        

    }
}