public class Ex05 {
    public static void main(String[] args) {
        
        int [] v1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int [] v2 = new int[10];

        v2[0] = v1[0];

        for (int i = 1; i < 10; i++) {
            v2[i] = v2[i - 1] + v1[i];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(v2[i]);
        }
    }
}
