import java.util.ArrayList;

public interface List {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(10);    // por baixo dos panos o vetor é redimensionado
        numeros.add(15);

        System.out.println(numeros.get(1));

        System.out.println(numeros.contains(10));
        System.out.println(numeros.indexOf(10));
    }
}
