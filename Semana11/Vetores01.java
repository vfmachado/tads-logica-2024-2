public class Vetores01 {
    public static void main(String[] args) {
        
        // condicionais
        // if (valor_logico) { bloco de codigo }  // else   // switch-case
        // while (valor_logico) {  bloco de codigo }    // for e do... while

        int n1, n2, n3, n4, n5, n6, n8, n9, n10; // .. até o n100

        String nomes = "";
        
        nomes = nomes + "Jean\n";
        nomes = nomes + "Carlos\n";
        nomes = nomes + "Everton\n";
        nomes = nomes + "Jorge\n";
        nomes = nomes + "Francine\n";
        nomes = nomes + "Jaziel\n";


        float nota1, nota2, nota3;

        // VARIAS (+ DO QUE 1) VARIAVEIS DO MESMO TIPO QUE REPRESENTAM O MESMO CONJUNTO DE DADOS... FAZ MAS SENTIDO AGRUPARMOS.
        // colchetes para representar um vetor
        // vetor == array
        float [] notas;

        // TAMANHO DO VETOR
        // POSSO DEFINIR DE MANEIRA ESTATICA (EM TEMPO DE COMPILAÇÃO)
        notas = new float[5];
            // new => representa criação
            // criacao => referencia na memoria
            // por conta disso, preciso acessar sempre 1 UNICA DE CADA VEZ, POSICAO

        notas[0] = 10.0f;   // notas[0]  a gente da seguinte forma: "notas na posicao 0"
        // notas[0] = 10.0f; => NOTAS NA POSICAO ZERO RECEBE O VALOR 10.

        // posso definir em tempo de execucao
        // int tamnho = in.nextInt();
        // notas = new float[tamanho];

        float [][][] xyz;

        // se 1 float ocupa 4 bytes de memoria
        // e a gente aloca 1.000.000 de floats... 
        // 4 milhoes de bytes que sao 4 mbytes

        // float [][][][][][][][] oitoDimensoes;
    }
}
