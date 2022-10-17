import java.util.*;

public class Prova01 {
    static Scanner scanner = new Scanner(System.in);

    public static void main (String args[]) {
        System.out.println("Insira o tamanho do vetor: ");
        int n = scanner.nextInt();
        int v[] = new int[n];

        if (v.length > 0) {
            geraVetor(v, v.length, 1);
            vetorMedia(v);
        }
    }

    static void geraVetor (int[] v, int limite, int acrescimo) {
        System.out.println("\nInsira os valores para inserção: ");
        for (int i = 0 ; i < v.length; i++) {
            System.out.print("posição " + (i+1) + ": ");
            v[i] = scanner.nextInt();
        }
    }
    static void vetorMedia (int[] v) {
        float aux = 0;
        int acima = 0;
        for (int i = 0; i < v.length; i++) {
            aux += v[i];
        }
        aux /= v.length;

        for (int j = 0; j < v.length; j++) {
            if (v[j] > aux) {
                acima++;
            }
        }
        System.out.println("A média dos valores é: " + aux);
        System.out.println("Existem " + acima + " valores acima da média");
	}
}