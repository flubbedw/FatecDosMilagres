import java.util.Random;
import java.util.Scanner;

public class Cases{
    static Scanner scanner;
    
    
    static void geraVetor(int[] v, int limite, int acrescimo){
        Random random = new Random();
        for (int i=0; i<v.length; i++)
           v[i] = random.nextInt(limite) + acrescimo;
}
    static void exibeVetor(int[] v, String msg){
        System.out.println("\n" + msg);
        for(int i=0; i<v.length; i++)
           System.out.print(v[i] + " ");
        System.out.println();
    
}
    static int menu(){
        System.out.println ("Escolha a sua acao:");
        System.out.println (" 1 - Jogar na Megasena");
        System.out.println (" 2 - Jogar dados");
        System.out.println (" 3 - Sair");
       return scanner.nextInt();
    }
    
     static void estatisticas (int[] lancamentos, int[] contagem){
        for (int i=0; i<lancamentos.length; i++){
            contagem[lancamentos[i]}++;
        }
     }
     static boolean buscaSimples (int[] v, int x){
        for (int i=0; i<v.length; i++){
            if (v[i] == x){
                return true;
            }
        }
        return false;
     }
     public static void main(String[] args){
        scanner = new Scanner(System.in);
        int opcao;
     do{
        opcao = menu();
        System.out.println();
        
        switch (opcao){
            case 1:
               int sena[] = new int[6];
                geraVetor (sena, 60, 1);
                exibeVetor(sena, "Vamos ficar ricos!!!!!");
                break;
        
            case 2:
                System.out.println("Digite a quantidade de lancamentos: ");
                int numLancamentos = scanner.nextInt();
                int[] lancamentos = new int[numLancamentos];//instancia
                geraVetor(lancamentos, 6, 1);
                exibeVetor(lancamentos, "Rolam os dados");
                int[] contagem = new int[7];
                estatisticas (lancamentos, contagem);
                exibeVetor(contagem, "Estatisticas de lancamentos");
                break;
            case 3:
                System.out.println("Obrigado(a), volte sempre!");
                break;
            
            default:
                System.out.println("Opcao invalida!");
        }
     }while (opcao !=3);
        
        scanner.close();
        
        }
}
