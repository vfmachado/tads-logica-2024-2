public class ExemploRelacionais {
    public static void main(String[] args) {
        
        boolean a = true;
        boolean b = false;

        // AND  verdadeiro quando ambos valores logicos sao verdadeiros
        System.out.println(a && b); // false

        // OR   verdadeiro quanto pelo menos um valor lógico é verdadeiro
        System.out.println(a || b); // true

        // XOR verdadeiro quando apenas um valor lógico é verdadeiro
        // ou ou  
        System.out.println(a ^ b); // true

        // BITWISE AND
        System.out.println(5 & 3); // BITWISE AND
        
        // BITWISE OR
        System.out.println(5 | 3); // BITWISE OR

        // BITWISE XOR
        System.out.println(5 ^ 3); // BITWISE XOR

        /*
            1 0 1         
            0 1 1

        &   0 0 1       = 1
        
        |   1 1 1       = 7
        
        ^   1 1 0       = 6
        
        */
    }
}