import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float x = in.nextFloat();
        float numerador = x;
        float denominador = 1;  // fatorial
        float soma = 1;
        for (int i = 1; i <= 10; i++) {
        
            System.out.println("Numerador " + numerador);
            numerador = numerador * x;

            denominador = denominador * i;
            System.out.println("Denominador " + denominador );

            soma = soma + numerador/denominador;
        }

        System.out.println("SOMA " + soma);
    }    
}
