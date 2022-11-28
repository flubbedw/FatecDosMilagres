import java.util.Random;

public class Prova02 {
    static Random random;
    static void geraVetor (int v[]) {
        for (int i=0; i<v.length; i++)
            v[i] = random.nextInt(11);
    }
    static void exibeVetor (int v[], String msg) {
        System.out.println("\n" + msg);
        for (int i=0; i<v.length; i++) 
            System.out.print(v[i] + " ");
        System.out.println();
    }
    static int partition (int[] A, int p, int r) { 
        int x = A[r];
        int i = p-1;
        for(int j = p; j <= r-1; j++) {
            if (A[j] <= x) {
                i = i + 1;
                int aux = A[i];
                A[i] = A[j]; 
                A[j] = aux;
            }
        }
        i = i + 1;
        int aux = A[r]; 
        A[r] = A[i]; 
        A[i] = aux;
        
        return i;
    }
    static void quicksort (int[] A, int p, int r) {
        // System.out.println("p = " + p + ", r = " + r) ;
        if (p < r) { 
            int q = partition(A, p, r);
            // System.out.println("q = " + q);
            quicksort(A, p, q-1);
            quicksort(A, q+1, r);
        }
    }
    public static void main(String[] args) {
        random = new Random();
        do {
            System.out.print("Gerando vetor...");
            if (8>0) {
                int v[] = new int[8];
                geraVetor(v);
                exibeVetor(v, "Vetor gerado");
                quicksort(v, 0, v.length-1);
                exibeVetor(v, "Vetor ordenado pelo quick");
                break;
            }
        } while (8>0);
    }
}