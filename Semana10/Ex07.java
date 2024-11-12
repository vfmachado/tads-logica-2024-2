
public class Ex07 {

    public static void main(String[] args) {
        
        int n = 555;

        for (int divisor = 1; divisor <= n; divisor++) {

            if (n % divisor == 0) {
                System.out.print(n + " divisivel por " + divisor);

                boolean primo = true;
                for (int i = 2; i < divisor; i++) {
                    if (divisor % i == 0) {
                        primo = false;
                    }
                }

                if (primo) {
                    System.out.println(" => PRIMO");
                } else {
                    System.out.println(" => NAO PRIMO");
                }
            }

        }

    }

}
