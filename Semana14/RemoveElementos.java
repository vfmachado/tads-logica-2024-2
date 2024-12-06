public class RemoveElementos {
    public static void main(String[] args) {
        
        int [] v = { 1, 2, 3, 1, 4, 5, 1};
        int remover = 1;

        int tamanho = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] != remover) {
                tamanho++;
            }
        }

        int [] novo = new int[tamanho];

        int n = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] != remover) {
                novo[n] = v[i];
                n++;
            }
        }

        for (int i = 0; i < novo.length; i++) {
            System.out.print(novo[i] + "  ");
        }
        System.out.println();
    }
}
