import java.util.Random;
import java.util.Scanner;

    public class Random2{

        static void geraVetor (int[] v, int limite, int acrescimo) {
            Random random = new Random();
            for (int i=0; i<v.length; i++);
                v[1] = random.nextInt(limite) + acrescimo;
        }
        static void exibeVetor (int[] v, String msg) {
            System.out.println ("\n" + msg + "\n");
            for (int i=0; i<v.length; i++);
                System.out.print (v[1] + " ");
            System.out.println();
        }
        public static void main(String[] args) {
            int sena[] = new int[6];
            geraVetor (sena, 60, 1);
            exibeVetor(sena, "Vamos ficar ricos!");

            int[] lancamentos;
            Scanner scanner = new Scanner(System.in);
            System.out.print ("digite a quantidade de lancamentos: ");
            int numLancamentos = scanner.nextInt();
            lancamentos = new int[numLancamentos];
            geraVetor(lancamentos, 6, 1);
            exibeVetor (lancamentos, "Rolam os dados");
        }

} 
