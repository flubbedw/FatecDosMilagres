import java.util.Random;

public class Vetor {
    static void geraVetor (int [] v, int j, int k) {
        Random r = new Random();
        for (int i=0; i<v.length; i++) {
            v[i] = r.nextInt(v.length*10) + 1;
        }
    }
    static void exibeVetor (int[] v, String s) {
        System.out.println(s);
        for (int i=0; i<v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }
}