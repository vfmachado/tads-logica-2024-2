import java.util.Scanner;


//  SEQUENCIA DE FIBONACCI (JA CAIU EM VARIAS ENTREVISTAS DE EMPREGO)
// 1 1 2 3 5 8 13 21 34 55 ...
// O PROXIMO ELEMENTO É A SOMA DOS DOIS ANTERIORES

public class Ex06 {
    public static void main(String[] args) {
        
        int v1 = 1;
        int v2 = 1;
        int v3 = 0;

        System.out.println(v1);
        System.out.println(v2);
        while (v3 <  1000) {
            v3 = v1 + v2;
            System.out.println(v3);
            v1 = v2;
            v2 = v3;
        }


    }
}