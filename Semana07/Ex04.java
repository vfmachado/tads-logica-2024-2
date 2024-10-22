import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float salario;
        String nome;
        int pontuacao;

        nome = in.next();
        salario = in.nextFloat();
        pontuacao = in.nextInt();

        if (pontuacao >= 90 && pontuacao <= 100) {
            salario = salario * 1.2f;
            System.out.println("Excelente desempenho! Bonificação de 20% do salário.");
        } else if (pontuacao >= 70) {
            salario = salario * 1.1f;
            System.out.println("Bom desempenho! Bonificação de 10% do salário.");
        } else if (pontuacao >= 50) {
            salario = salario * 1.05f;
            System.out.println("Desempenho médio. Bonificação de 5% do salário.");
        } else {
            System.out.println("Desempenho abaixo do esperado. Sem bonificação.");
        }

        System.out.println("SALARIO " + salario);
    }
}
