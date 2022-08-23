import java.util.Random;
import java.util.Scanner;

public class BuscaSimples {
    public static void main (String [] args){
        Random random = new Random();
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite o tamanho da lista: ");
        int n = sc.nextInt();
        int lista [] = new int[n];

        System.out.println("Digite o limite superior dos numeros ");
        int limite = sc.nextInt();

        for(int i = 0; i<n; i++){
            lista [i] = random.nextInt(limite);
        }

        System.out.println("Digite o numero procurado ");
        int x = sc.nextInt();
        
        boolean achou = false;
        int i = 0;
        while (i<n && !achou){
            if(lista[i] == x)
                achou = true;
            else
                i++;
        }

        if(achou)
            System.out.println("Valor encontrado");
        else
        System.out.println("Valor  NAO encontrado");


        sc.close();
    }
}
