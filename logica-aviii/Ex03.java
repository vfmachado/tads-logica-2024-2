public class Ex03 {
    public static void main(String[] args) {
        int [] v1 = { 1, 3, 5, 7, 9 };
        int [] v2 = { 2, 4, 6, 8, 10};

        int [] v3 = new int[10];

        int p1 = 0;
        int p2 = 0;

        for (int i = 0; i < 10; i++) {
            if (v1[p1] < v2[p2]) {
                v3[i] = v1[p1];
                p1++;
            } else {
                v3[i] = v2[p2];
                p2++;
            }

            if (p1 == 5) {
                for (int j = p2; j < 5; j++) {
                    i++;
                    v3[i] = v2[j];
                }
                break;
            }

            if (p2 == 5) {
                for (int j = p1; j < 5; j++) {
                    i++;
                    v3[i] = v1[j];
                }
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(v3[i]);
        }
    }
}
