
public class ControleLaco {
 
    public static void main(String[] args) {
        

        /*

        triangulo com N linhas
        *
        * *
        * * *
        * * * *
        * * * * *

        */
        int n = 5;
        int asteriscos = 1;
        while (n > 0) {
            
            int i = 0;
            while (i < asteriscos) {
                System.out.print("* ");
                i++;
            }

            asteriscos++;
            System.out.println();

            n--;
        }

            

    }

}
