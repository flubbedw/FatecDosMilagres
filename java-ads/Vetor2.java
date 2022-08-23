import java.util.Scanner;

public class Vetor2 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();
        double [] vDouble = new double[tamanho];

        for(int i = 0; i<vDouble.length; i++){
            vDouble[i] = Math.random();
            System.out.println(vDouble[i]);
        }

        int [] v10 = new int[tamanho];
        System.out.println("Numeros de 0 a 9: ");
        for(int i = 0; i<vDouble.length; i++){
            v10 [i] = (int)(vDouble[i] * 10);
            System.out.println(v10[i]);
        }
        sc.close();
        
        
    }
}
