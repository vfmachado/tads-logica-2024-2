import java.util.Scanner;

public class Matriz {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // um vetor de floats que permite que eu guarde multiplos valores indexados atraves de um indice
        float [] notas;

        // declarando e inicializando
        float [] n1 = { 1, 2, 3, 4, 5};

        notas = new float[10];    // inicializar separadamente com tamanho 10

        float [] n2 = new float[5]; // declarar e inicializar com determinado tamanho


        // consigo guardar as 4 notas de uma turma com 20 alunos?
        float [] notasAlunos = new float[4 * 20];   // tamanho = 80
        // primeiro aluno
        notasAlunos[0] = 8.0f;
        notasAlunos[1] = 8.0f;
        notasAlunos[2] = 8.0f;
        notasAlunos[3] = 8.0f;

        notasAlunos[4] = 8.0f;
        notasAlunos[5] = 8.0f;
        notasAlunos[6] = 8.0f;
        notasAlunos[7] = 8.0f;


        int quantAlunos = 3;
        int quantNotas = 4;
        float [][] alunos = new float[quantAlunos][quantNotas];
        // vai gerar uma tabela
        // nesse exemplo, cada linha representa um aluno, cada coluna a nota
        // cada aluno tem 4 notas
            // 10  10  9   8
            // 7   7   9   8
            // 5   10  7   8
            // 0   0   10  10


            /*  linha,coluna
             *         0,0      0,1     0,2     0,3
             *         1,0      1,1     1,2     1,3
             *         2,0      2,1     2,2     2,3
             *         3,0      3,1     3,2     3,3
             *         4,0      4,1     4,2     4,3  
             *         5,0      5,1     5,2     5,3 
             */


        // 10  10  9   8    => vetor        

        for (int linha = 0; linha < alunos.length; linha++) {
            System.out.println("Informe as notas do aluno " + (linha+1));
            for (int coluna = 0; coluna < alunos[linha].length; coluna++) {
                float nota = in.nextFloat();
                alunos[linha][coluna] = nota;
            }
        }
        // para cada dimensao do vetor, um for
        for (int linha = 0; linha < alunos.length; linha++) {
            for (int coluna = 0; coluna < alunos[linha].length; coluna++) {
                System.out.print(alunos[linha][coluna] + "  ");
            }
            System.out.println();
        }

        // TANTO VETORES QUANTO MATRIZES, TRATAM VARIOS VALORES DE UM MESMO TIPO
        // IDEALMENTE, REPRESENTANDO A MESMA COISA

        //  REFERENCIA POSICIONAL
        // SIGNIFICA UTILIZAR A POSICAO COMO REFERENCIA ENTRE VETORES, MATRIZES DIFERENTES;

        String [] nomes;
        float [][] ns;
        // entende que a primeira posicao do vetor de nomes, representa a primeira linha do vetor de notas;



    }

}