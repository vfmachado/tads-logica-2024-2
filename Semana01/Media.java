import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // int a;
        // int b;
        // int c;
        int numero1, numero2, numero3, media;

        System.out.println("Informe 3 numeros");
        numero1 = in.nextInt();
        numero2 = in.nextInt();
        numero3 = in.nextInt();
        
        media = (numero1 + numero2 + numero3) / 3;

        // System.out.println("A MEDIA RESULTA EM " + media);
        System.out.print("A MEDIA RESULTA EM ");
        System.out.println(media);

    }
}