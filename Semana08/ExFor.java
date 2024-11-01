public class ExFor {
    public static void main(String[] args) {
        
        // DE 1 A 10
        System.out.println("DE 1 A 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("\n PARES DE 100 A 120");
        // PARES DE 100 A 120
        for (int i = 100; i <= 120; i = i + 2) {
            System.out.println(i);
        }

        for (int i = 100; i <= 120; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


        System.out.println("\nIMPARES DE 50 A 30");
        for (int i = 49; i > 30; i = i - 2) {
            System.out.println(i);
        }

        for (int i = 50; i > 30; i--) {
            if (i % 2 == 1)
                System.out.println(i);
        }

        System.out.println("\n MULTIPLOS DE 3 ENTRE DOIS NUMEROS FORNECIDOS PELO USUARIO");
        int a = 2;
        int b = 20;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) System.out.println(i);
        }

        for ( ; a <= b; a++) {
            if (a % 3 == 0) System.out.println(a);
        }


        System.out.println("\nDIVISORES DE UM NUMERO N");
        int v = 124;
        System.out.println("divisores de " + v);
        for (int i = 1; i <= v; i++) {
            if (v % i == 0) {
                System.out.println(i);
            }
        }


        System.out.println("\nTABUADA");
        int t = 8;
        for (int i = 0; i <= 10; i++) {
            int resultado = i * t;
            System.out.println(i + " x " + t + " = " + resultado);
        }

    }
}
