import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        
        // exercicio do caixa eletronico
        // 189
        // 1 x 100
        // 1 x 50
        // 3 x 10
        // 1 x 5
        // 2 x 2

        Scanner in = new Scanner(System.in);
        int valor = in.nextInt();

        int n100, n50, n20, n10, n5, n2, n1;

        n100 = valor / 100;
        // valor = valor - n100 * 100;
        valor = valor % 100;

        n50 = valor / 50;
        valor = valor % 50;

        n20 = valor / 20;
        valor = valor % 20;

        n10 = valor / 10;
        valor = valor % 10;

        n5 = valor / 5;
        valor = valor % 5;
        
        n2 = valor / 2;
        valor = valor % 2;

        n1 = valor;

        System.out.println("NOTAS DE 100 = " + n100);
        System.out.println("NOTAS DE 50 = " + n50);
        System.out.println("NOTAS DE 20 = " + n20);
        System.out.println("NOTAS DE 10 = " + n10);
        System.out.println("NOTAS DE 5 = " + n5);
        System.out.println("NOTAS DE 2 = " + n2);
        System.out.println("NOTAS DE 1 = " + n1);
    }
}
