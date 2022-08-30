import java.util.Scanner;
import java.util.Random;

class Lista1 {  
  public static void main(String args[]) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o tamanho da lista: ");
    int n = scanner.nextInt();
    int[] lista = new int[n];
    
    System.out.print("\ndigite o limite superior dos numeros: ");
  
    int limite = scanner.nextInt();
    
    for (int i = 0; i < n; i++) {
      lista[i] = random.nextInt(limite);
    }
    
    System.out.print("\ndigite o numero procurado: ");
    int x = scanner.nextInt();
    boolean achou = false;
    int i=0;
    while (i<n && !achou)
      if (lista[i]==x)
        achou =true;
      else
        i++;
    if (achou)
      System.out.println("valor encontrado na posiçao: " + i);
    else
      System.out.println("Valor não encontrado na lista");
      
  
    
  }
}
