public class Recursao {
    static int fatorial (int n) {
        if (n==0 || n==1)
            return 1;
        return n * fatorial(n-1);
    }
    static long fib (int n) {
        if (n==0 || n==1)
            return 1;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        for (int i=0; i<20; i++)
        System.out.println("fatorial de " + i + " = " + fatorial(i));
        for (int i=0; i<20; i++)
            System.out.println("fibonacci " + i + ": " + fib(i));
    }
}