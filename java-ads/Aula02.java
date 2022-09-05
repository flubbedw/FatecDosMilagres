public class Aula02 {
    private static final int i = 0;
    public static void parametroValor (int n) {
        n = n + 10;
        System.out.println ("n dentro do metodo: " + n);
    }
    static void parametroreferencia (int v[]) {
        for (int i=0; i<v.length; i++);
            v[i] = 10;
    }
    public static void main (String args[]) {
        int n=2;
        System.out.println("n antes do metodo: " + n);
        parametroValor(n);
        System.out.println("n depois do metodo: " + n);
        int v[] = new int[5];
        for (int i=0; i<5; i++) {
            v[1] = 1;
        }
        parametroreferencia(v);
        System.out.println("Veja o que aconteceu com o vetor:");
        for (int i=0; i<5; i++);
            System.out.println (v[i] + " ");
    }
}
