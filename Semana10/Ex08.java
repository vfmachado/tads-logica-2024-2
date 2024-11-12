
public class Ex08 {
    public static void main(String[] args) {
        
        // 1011     8 + 2 + 1 = 11
        int n = 11;
        String binario = "";
        int resto;
        int valor;

        valor = n;
        while (valor > 0) {
            resto = valor % 2;
            valor = valor / 2;

            binario = resto + binario;
            System.out.println("RESTO " + resto);

        }

        System.out.println(binario);
        
        /*
                        resultado       resto       binario
            11 / 2          5              1              1
            5 / 2           2              1             11
            2   / 2         1              0            011
            1 / 2           0              1           1011
        */
    }    
}
