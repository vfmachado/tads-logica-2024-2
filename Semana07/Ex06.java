import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int numero = in.nextInt();

        int u, d, c, m;
        u = numero % 10;
        d = (numero / 10) % 10;
        c = (numero / 100) % 10;    // 1234     12 % 10     2
        m = numero / 1000;

        int invertido = u * 1000 + d * 100 + c * 10 + m;
        System.out.println(invertido);
    }
}
