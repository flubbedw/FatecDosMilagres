import java.util.*;

public class Ordena {
	static Scanner scanner;

	public static void main(String args[]) {
		scanner = new Scanner(System.in);
		int tamanho;	

		do{
			System.out.print("Digite o tamanho do vetor, 0 encerra: ");
            tamanho = scanner.nextInt();
            System.out.print("\n");

			int vet1[] = new int[tamanho];
			if(tamanho > 0){
			geraVetor(vet1, vet1.length, 1);
			exibeVetor(vet1, "Vetor gerado: ");
            
			Date d = new Date();
			long tempo = d.getTime();
			bubbleSort(vet1);
			long fim = new Date().getTime();
            exibeVetor(vet1, "Vetor ordenado: ");

			System.out.println("O bubble demorou " + (fim - tempo) + " milissegundos.");
			    
			}
		}while (tamanho > 0);

		scanner.close();

	}

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
        System.out.println();
	}

	static void bubbleSort(int v[]){
		for(int i = 1; i < v.length-1; i++){
			for(int j = 0; j < v.length - i; j ++){
				if(v[j] > v[j+1]){
					int aux = v[j];
					v[j] = v[j+1];
					v[j+1] = aux;
				}
			}
		}
	}
}