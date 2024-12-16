public class Ex02 {
    public static void main(String[] args) {
        
        int [] vetor = { 1, 2, 3, 4, 5, 4, 3, 5, 1, 1 };
        int menor, qtdMenor = 0;
        int maior, qtdMaior = 0;

        menor = vetor[0];
        maior = vetor[0];

        for (int i = 0; i < 10; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
                qtdMenor = 1;
            } else if (vetor[i] == menor) {
                qtdMenor++;
            }

            if (vetor[i] > maior) {
                maior = vetor[i];
                qtdMaior = 1;
            } else if (vetor[i] == maior) {
                qtdMaior++;
            }
        }

        System.out.println("Menor: " + menor + " (" + qtdMenor + " vezes)");
        System.out.println("Maior: " + maior + " (" + qtdMaior + " vezes)");
    }
}
