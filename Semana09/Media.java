import java.util.Scanner;

public class Media {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float media = 0;
        int contador = 0;
        float nota = 0;

        while (contador < 5) {
            nota = in.nextFloat();
            media = media + nota;
            contador++;
        }

        media = media / contador;
        System.out.println(media);
   } 
}
