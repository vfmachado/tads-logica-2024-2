
public class Ex06 {
    public static void main(String[] args) {
        
        int n = 5;

        for (int i = n; i >= 1; i--) {
            int asteriscos = 2 * i - 1;
            for (int ast = 0; ast < asteriscos; ast++) {
                System.out.print("*");
            }
            System.out.println();
        }
        



    }
}
