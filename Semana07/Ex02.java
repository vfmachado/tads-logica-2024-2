import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a == 90 || b == 90 || c == 90 ) {
            System.out.println("RETO");
        } else if (a > 90 || b > 90 || c > 90 ) {
            System.out.println("OBSTUSANGULO");
        } else {
            System.out.println("ACUTANGULO");
        }

    }   
}
