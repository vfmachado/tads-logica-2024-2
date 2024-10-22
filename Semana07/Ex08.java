import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        
        float imc, altura, peso;
        String sexo;
        Scanner in = new Scanner(System.in);

        sexo = in.next();
        peso = in.nextFloat();
        altura = in.nextFloat();

        imc = peso / (altura * altura);
        System.out.println(imc);;
        
        if (imc < 18) {
            System.out.println("BAIXO PESO");
        } else if ((sexo.equals("masculino") && imc < 25 ) || (sexo.equals("feminino") && imc < 24) ) {
            System.out.println("PESO NORMAL");
        } else if (imc < 35) {
            System.out.println("SOBREPESO");
        } else if (imc < 40) {
            System.out.println("OBESIDADE MODERADA");
        } else {
            System.out.println("OBESIDADE GRAVE");
        }

    }
}
