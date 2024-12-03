import java.util.Scanner;

public class VetoresCompleto {
    public static void main(String[] args) {
        
        System.out.println("Escolha a opcao \n" +
            "\n0. Preencher todo vetor" +
            "\n1. Mostrar vetor" +
            "\n2. Mostrar vetor ao contrario" +
            "\n3. Mostrar vetor com indice" +
            // MANTENDO OS VALORES  TANTO DIMINUINDO QUANTO AUMENTANDO
            "\n4. Redimensionar vetor" +
            // SETAR UM ELEMENTO NUMA POSICAO   INDICANDO A POSICAO E O VALOR
            "\n5. Adicionar elemento" +
            
            
            // DIMINUI O TAMANHO DO VETOR REMOVENDO TODOS ELEMENTOS QUE O USUARIO SELECIONOU
            // [0 0 0 4 0]
            // usuario escolheu remover 0
            // [4]

            // [4 2 3 4 5]
            // usuario escolheu remover 4
            // [2 3 5]
            
            "\n6. Remover elemento" +

            "\n7. Calcular media" +

            // EU JA FIZ COM VCS, MAS TENTEM FAZER POR CONTA =)
            "\n8. Ordernar vetor" +

            // TEM QUE INDICAR DE VOLTA A POSICAO EM QUE O ELEMENTO FOI ENCONTRADO OU MSG CASO NAO ENCONTRADO
            "\n9. Procurar elemento" +
            "\n10. Maior e menor elemento" +
            "\n11. Quantidade de valores pares" +
            "\n12. Quantidade de impares" +
            "\n13. Quantidade de primos" +

            // INSTANCIAR E CRIAR UM NOVO VETOR MENOR,
            // VERIFICAR SE ELE É SUBCONJUNTO 
            // [ 1 2 3 4 5 6]
            // [ 4 5 ]  => SIM
            // [ 0 1 2 3] => NAO
            "\n14. Subconjunto presente " +
            
            // TEM QUE SOBRESCREVER O VETOR ORIGINAL
            // 1 2 3 4 => 4 3 2 1
            "\n15. Inverter vetor " +

            // PALINDROMO
            "\n16. Dizer se o vetor é o mesmo de tras pra frente" +
            "\n17. Sair");
        

        System.out.println("1. Mostrar vetor");
        int [] vetor = { 10, 20, 30, 40, 50};

        int opcao;
        Scanner in = new Scanner(System.in);

        do {
            opcao = in.nextInt();

            if (opcao == 1) {
                for (int i = 0; i < vetor.length; i++) {
                    System.out.print(vetor[i] + "  ");
                }
                System.out.println();
            }

            if (opcao == 2) {
                // preciso começar no final vetor
                // qual é a ultima posicao de um vetor?
                    // tamanho -1
                    // vetor.length -1
                // [10, 20, 30, 40, 50]     TAMANHO 5
                //  0    1   2   3   4      POSICOES DE 0 A 4
                // vetor[i] => vetor na posicao i
                for (int i = vetor.length -1; i >= 0; i--) {
                    System.out.println("POS " + i + " => " + vetor[i]);
                }
                System.out.println();
            }
            
        } while (opcao != 15);
    }
}