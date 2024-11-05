public class Simulado05 {
    public static void main(String[] args) {
        
        double soma = 0;
        double impares = 1;
        double divisao;
        
        for (int i = 0; i < 1000000000; i++) {
            divisao = 1 / impares;
            
            if (i % 2 == 0)
                soma = soma + divisao;
            else
                soma = soma - divisao;
            
            impares = impares + 2;
        }

        soma = soma * 4;
        System.out.println("APROXIMACAO " + soma);
    }
}
