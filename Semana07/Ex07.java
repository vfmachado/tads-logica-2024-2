import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        float salario, valorEmprestimo, valorParcela;
        int parcelas;

        salario = in.nextFloat();
        valorEmprestimo = in.nextFloat();
        parcelas = in.nextInt();

        valorParcela = valorEmprestimo / parcelas;

        if (salario * 0.3f > valorParcela) {
            System.out.println("PODE SER CONCEDIDO O EMPRESTIMO");
        } else {
            System.out.println("NAO EH POSSIVEL CONCEDER O EMPRESTIMO");
        }

    }
}
