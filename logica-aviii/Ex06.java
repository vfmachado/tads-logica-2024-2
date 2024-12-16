public class Ex06 {
    public static void main(String[] args) {
        
        int n = 10;
        int [] v1 = { 1 };

        for (int i = 0; i < n; i++) {
            
            int [] v2 = new int[v1.length + 1];
            v2[0] = v1[0];
            v2[v2.length - 1] = v1[v1.length - 1];

            for (int j = 1; j < v2.length - 1; j++) {
                v2[j] = v1[j - 1] + v1[j];
            }

            v1 = v2;

            for (int j = 0; j < v1.length; j++) {
                System.out.print(v1[j] + " ");
            }
            System.out.println();
        }

    }
}
