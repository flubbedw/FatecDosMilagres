import java.util.Random;
import java.util.Scanner;

public class Main {
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
    static void insertion (int v[]) {
        for(int i=1; i<v.length; i++) {
            int x = v[i];
            int j = i-1;
            for ( ; j>=0 && v[j]>x; j--) {
                v[j+1] = v[j];
            }
            v[j+1] = x;
        }
    }
    static boolean buscaSimples (int x, int[] v) {
        int cont=0;
        boolean achou=false;
        for (int i=0; i<v.length; i++){
            cont++;
            if (v[i] == x) achou = true;
        }
        System.out.println("busca simples realizou " + cont + " comparacoes");
        return achou;
    }
    static boolean buscaBinaria (int x, int[] v) {
        int ini=0, fim=v.length-1;
        int cont=0;
        boolean achou=false;
        while (ini <= fim && !achou) {
            cont++;
            int meio = (ini + fim)/2;
            if (x == v[meio]){
                achou = true;
            }
            else {
                cont++;
                if (x > v[meio]) ini = meio + 1;
                else fim = meio - 1;
            }
        }
        System.out.println("busca binaria realizou " + cont + " comparacoes");
        return achou;
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
                geraVetor(v);
                exibeVetor(v, "vetor gerado");
                System.out.print("digite o valor para busca: ");
                int x = scanner.nextInt();
                if (buscaSimples(x, v))
                    System.out.println("elemento encontrado na busca simples");
                else 
                    System.out.println("elemento nao encontrado na busca simples");
                insertion(v);
                exibeVetor(v, "vetor ordenado");
                if (buscaBinaria(x, v))
                    System.out.println("elemento encontrado na busca binaria");
                else
                    System.out.println("elemento nao encontrado na busca binaria");
            }
        } while (n>0);
    }
}
