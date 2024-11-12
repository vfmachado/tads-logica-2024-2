import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int idade, maior, menor, quantidade;
        float soma;

        idade = 1;
        soma = 0;
        quantidade = 0;
        menor = 9999;
        maior = -9999;

        while (idade != 0) {
            idade = in.nextInt();

            if (idade != 0) {
                quantidade++;
                soma = soma + idade;

                if (idade > maior || quantidade == 1) {
                    maior = idade;
                }

                if (idade < menor || quantidade == 1) {
                    menor = idade;
                }
            }
        }

        float media = soma / quantidade;
        System.out.println("MENOR " + menor);
        System.out.println("MAIOR " + maior);
        System.out.println("QUANTIDADE " + quantidade);
        System.out.println("MEDIA " + media);

    }    
}
