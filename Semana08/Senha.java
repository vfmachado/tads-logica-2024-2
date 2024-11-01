import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String senha = "1234";
        String tentativa;

        do {
            System.out.println("DIGITE A SENHA");
            tentativa = in.next();
        } while (!tentativa.equals(senha));

    } 
}
