import java.util.Scanner;

public class VariosIfs {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // classificacao por faixa etaria
        /*
            idade

            < 9     infantil
            >=9 e < 14    juvenil
            >=14 e < 18    adolescente
            >= 18 e < 40    adulto
            >= 40 e < 60    adulto+
            >= 60   idoso 

            
            'E' em valores lógicos
            && 

            true   &&   true        => true
            true   &&   false       => false
            false  &&   false       => false
        */


       int idade = in.nextInt();

        if (idade < 9) {
            System.out.println("INFANTIL");
        } else if (idade < 14) {
            System.out.println("JUVENIL");
        } else if (idade < 18) {
            System.out.println("ADOLESCENTE");
        } else if (idade < 40) {
            System.out.println("ADULTO");
        } else if (idade < 60) {
            System.out.println("ADULTO+");
        } else {
            System.out.println("IDOSO");
        }
        

        // quando o meu bloco de codigo é uma linha ou outro bloco, as chaves podem ser omitidasß

    }
}