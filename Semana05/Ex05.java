import java.util.Scanner;


// FIZZBUZZ
public class Ex05 {
    public static void main(String[] args) {
        long tinicial = System.currentTimeMillis();
        int contador = 1;
        while (contador <= 100) {
            if (contador % 3 == 0 && contador % 5 == 0) {
                System.out.println("FIZZBUZZ");    
            } else if (contador % 3 == 0) {
                System.out.println("FIZZ");    
            } else if (contador % 5 == 0) {
                System.out.println("BUZZ");    
            } else {
                System.out.println(contador);
            }
            contador++;
        }


        long tfinal = System.currentTimeMillis();
        long total = tfinal - tinicial;
        System.out.println("TEMPO TOTAL DE EXECUCAO " + total);
        
    }
}