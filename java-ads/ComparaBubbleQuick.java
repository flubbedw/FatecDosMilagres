import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class ComparaBubbleQuick {
    static Scanner scanner;
    static Random random;

    static void geraVetor (int v[]) {
        for (int i=0; i<v.length; i++)
            v[i] = random.nextInt(10 * v.length);
    }
    static void exibeVetor (int v[], String msg) {
        System.out.println("\n" + msg);
        for (int i=0; i<v.length; i++) 
            System.out.print(v[i] + " ");
        System.out.println();
    }
    static void bubble (int v[]) {
        for (int i=1; i<v.length; i++) 
            for (int j=0; j < v.length - i; j++)
                if (v[j] > v[j+1]) {
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
    } 
    static int partition (int[] A, int p, int r) { 
        int x = A[r];     // O pivô é o último elemento do vetor
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
        System.out.println("p = " + p + ", r = " + r) ;
        if (p < r) { 
            int q = partition(A, p, r);
            System.out.println("q = " + q);
            quicksort(A, p, q-1);
            quicksort(A, q+1, r);
        }
    }
    public static void main(String[] args) {
        random = new Random();
        scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("digite o tamanho do vetor: ");
            n = scanner.nextInt();
            if (n>0) {
                int v[] = new int[n];
                //--- teste do bubble
                // geraVetor(v);
                // //exibeVetor(v, "vetor gerado");
                // long ini = new Date().getTime();
                // bubble(v);
                // long fim = new Date().getTime();
                // //exibeVetor(v, "vetor ordenado pelo bubble");
                // System.out.println("\npara o vetor de tamanho " + n + " o bubble demorou " + (fim - ini) + " milissegundos");
                //--- 1o teste do quick
                geraVetor(v);
                //exibeVetor(v, "vetor gerado");
                long ini = new Date().getTime();
                quicksort(v, 0, v.length-1);
                long fim = new Date().getTime();
                //exibeVetor(v, "vetor ordenado pelo quick");
                System.out.println("\npara o vetor de tamanho " + n + " o quick demorou " + (fim - ini) + " milissegundos");
                // //--- 2o teste do quick usa o vetor ordenado do primeiro teste
                // ini = new Date().getTime();
                // quicksort(v, 0, v.length-1);
                // fim = new Date().getTime();
                // //exibeVetor(v, "vetor ordenado pelo quick");
                // System.out.println("\npara o vetor ordenado, quick demorou " + (fim - ini) + " milissegundos");
            }
        } while (n>0);
    }
}
