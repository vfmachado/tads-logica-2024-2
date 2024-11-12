import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int altura = in.nextInt();
        int quantidade = in.nextInt();

        int anterior = 0;
        boolean ganhou = true;
        for (int i = 0; i < quantidade; i++) {
            int cano = in.nextInt();

            if (i != 0) {
                
                if (cano > anterior) {
                    if (cano - anterior > altura) {
                        ganhou = false;
                    }    
                } else { 
                    if (anterior - cano > altura) {
                        ganhou = false;
                    }  
                }
            }
            anterior = cano;
        }

        System.out.println("GANHOU ? " + ganhou);

    }   
}
