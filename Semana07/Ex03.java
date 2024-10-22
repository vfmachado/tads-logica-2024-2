import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1, y1, x2, y2, x3, y3, x4, y4;

        x1 = in.nextInt();
        y1 = in.nextInt();
        x2 = in.nextInt();
        y2 = in.nextInt();
        
        x3 = in.nextInt();
        y3 = in.nextInt();
        x4 = in.nextInt();
        y4 = in.nextInt();

        if (x3 > x2 || x4 < x1 || y3 > y2 || y4 < y1) {
            System.out.println("FORA");
        } else {

            // dentro
            // 3 > 1 && 4 < 2

        }
    


    }   
}
