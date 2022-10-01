public class ExemplosSimples {
    static void imprime1aN (int i) {
        System.out.println(i);
        if (i>1)
            imprime1aN(i-1);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n=10;
        imprime1aN(n);
    }

}
