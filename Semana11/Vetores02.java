public class Vetores02 {
    public static void main(String[] args) {
        // DECLARACAO
        int [] vetores;
        int v[];    // tbm pode inverter a ordem do colchetes

        int v1, v2, v3[];   // apenas v3 é vetor
        int [] v4, v5, v6;  // os 3 sao vetores

        // INICIALIZACAO
        v = new int[10];

        // tambem podemos declarar e ja inicializar o tamanho do vetor
        int [] vet = new int[10];

        // INICIALIZAR => SIGNIFICA DEFINIR O TAMANHO DO VETOR
        // TODAS AS LINGUAGENS QUE EU JA TRABALHEI, TRABALHAM COM TAMANHO ESTATICO
        // O QUE ELAS FAZEM POR BAIXO DOS PANOS, EH CRIAR UM NOVO VETOR E REATRIBUIR A VARAIVEL.

        int [] valores = new int[5];
        // se eu quiser colocar mais valores nesse vetor?
        valores = new int[10];

        int [] outroMasMesmoVetor = valores;

        valores[0] = 100;
        System.out.println(outroMasMesmoVetor[0]);
    }
}
