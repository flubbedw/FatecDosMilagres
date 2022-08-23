import java.util.Scanner;

public class Aula01{
    public static void main (String [] args){
        int v1[]; //declarando uma variavel de ref para um vetor de inteiros
        v1 = new int[10]; // instanciando o vetor criado para 10 inteiros e associando à variavel de ref v1
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Vamos preencher o vetor: ");
        for(int i = 0; i<v1.length; i++){
            System.out.println("posicao " + (i+1) + " ");
            v1[i] = sc.nextInt();
        }

       sc.close();
    }
}