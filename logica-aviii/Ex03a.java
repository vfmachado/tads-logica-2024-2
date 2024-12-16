public class Ex03a {
    public static void main(String[] args) {
        int [] v1 = { 1, 3, 5, 7, 9 };
        int [] v2 = { 2, 4, 6, 8, 10};

        int [] v3 = new int[10];

        for (int i = 0; i < v3.length; i++) {
            if (i < v1.length) {
                v3[i] = v1[i];
            } else {
                v3[i] = v2[i - v1.length];
            }
        }

        for (int i = 0; i < v3.length; i++) {
            for (int j = i + 1; j < v3.length; j++) {
                if (v3[i] > v3[j]) {
                    int temp = v3[i];
                    v3[i] = v3[j];
                    v3[j] = temp;
                }
            }
        }

        for (int i = 0; i < v3.length; i++) {
            System.out.println(v3[i]);
        }
    }
}
