import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Ordena2 {
    static void bubbleSort (int [] v, j) {
        for (int i=1; j<v.length; i++)
            for (int j=0; j<v.length-i; j++)
                if (v[j+1]) {
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
        }
    static void exibeVetor (String s) {
        Scanner sc = new Scanner (System.in);
        int n=0;
        do {
            System.out.print("digite o tamanho do vetor, 0 encerra: ");
            n = sc.nextInt();
            int[] v = new int[n];
            if (n>0) {
                Vetor.geraVetor(v, v.length*10, 1);
                //Vetor.exibeVetor(v, "vetor gerado");
                Date d = new Date();
                long ini = d.getTime();
                bubbleSort(v);
                long fim = new Date().getTime();
                //Vetor.exibeVetor(v, "vetor ordenado");
                System.out.println("o bubble demorou " + (fim-ini) + " milissegundos");
            }
        } while (n>0);
        sc.close();
    }