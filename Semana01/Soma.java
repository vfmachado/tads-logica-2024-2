
import java.util.Scanner;
/*
    javac Soma.java
    java Soma
*/
// CLASSE SOMA - serve para somar 2 numeros inteiros e mostrar o resultado
public class Soma {
    public static void main(String[] args) {
        
        // declara a utilizacao do Scanner;
        Scanner in;

        // inicializar o Scanner
        // nome da variavel recebe uma nova instancia de Scanner
        // System.in => leitura padrao do sistema, teclado
        in = new Scanner(System.in);

        System.out.print("JAVA ");      // print => mostra um texto
        System.out.println("FUNCIONAAA"); // println => mostra um texto e quebra a linha
        System.out.println();
        System.out.println("TES\nTE");
       
        // VARIAVEL = algo que pode mudar  e guarda informacao

        // declaracao 
        // tipo  nome
        int idade;

        // atribuicao
        idade = 33;

        idade = 2024 - 1991;


        // declarar e inicializar a variavel "ao mesmo tempo"
        String nome = "Vinicius";

        // + entre textos e variaveis serve para CONCATENAR (juntar)
        // nome e idade são variaveis que sao avaliadas (nao é uma operacao de atribuicao)
        System.out.println(nome + " tem " + idade  + " anos");
        

        int numero, dobro;

        System.out.print("Digite um numero: ");
        numero = in.nextInt();
        dobro = numero * 2;

        System.out.println("O DOBRO DE " + numero + " EH " + dobro);

        // FAÇA UM PROGRAMA QUE RECEBA 3 NUMEROS, E MOSTRE A MEDIA DELES;
    }
}