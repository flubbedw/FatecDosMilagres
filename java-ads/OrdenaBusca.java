import java.util.Scanner;
import java.util.Random;
import java.util.Date;

public class OrdenaBusca {
	static Scanner scanner;
	static Random random;

	public static void main(String args[]) {

	static void geraVetor (int[] v, int limite, int acrescimo) {
        Random random = new Random();
        for (int i = 0 ; i < v.length; i++) {
            v[i] = random.nextInt(limite) + acrescimo;
   	 }
	}

	static void exibeVetor (int[] v, String msg) {
        System.out.println ("\n" + msg);
        for (int i = 0; i < v.length; i++) {
            System.out.print (v[i] + " ");
        }
        System.out.println("\n");
	}

        static void insertion(int v[]){
            for(int i = 1; i<v.length; i++){
                int x = v[i];
                int j = i-1;
                for(int j = 1 - 1; j>=0&& v[j] > x; j --){
                    v[j+1]= v[j];
                }
                v[j+1] = x;
            }
        }
        
	    static boolean buscaSimples(int x,int[]v){
	        for(int i= 0; i<v.length; i++)
	            if(v[i] == x)
	            return true;
	        return false;
	    }
	    static boolean buscaBinaria(int x, int [] v){
	        int ini= 0, fim = v.length-1;
	    }
	}
}
