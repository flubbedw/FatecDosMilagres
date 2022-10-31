import java.util.Scanner;
import java.util.Random;
import java.util.Date;

public class Ordena3 {
	static Scanner scanner;

	public static void main(String args[]) {
		scanner = new Scanner(System.in);
		int tamanho, opcao;
		long inicio, fim;
		

		do{
			System.out.print("Digite o tamanho do vetor (<= 0 encerra): ");
			tamanho = scanner.nextInt();
			System.out.print("\n");
			
			if(tamanho > 0) {
			int vet1[] = new int[tamanho];
			geraVetor(vet1, vet1.length*10, 1);
			exibeVetor(vet1, "Vetor gerado: ");
			opcao = menu();
			switch(opcao) {
			
			case 1:
				inicio = new Date().getTime();
				bubbleSort(vet1);
				fim = new Date().getTime();
				exibeVetor(vet1, "Vetor ordenado: ");
	
				System.out.println("O bubble sort demorou " + (fim - inicio) + " milissegundos.\n\n\n");
				break;
			
			
			case 2:
				inicio = new Date().getTime();
				insertionSort(vet1);
				fim = new Date().getTime();
				exibeVetor(vet1, "Vetor ordenado: ");
				
				System.out.println("O insertion sort demorou " + (fim - inicio) + " milissegundos.\n\n\n");
				break;
				
				
			case 3:
				inicio = new Date().getTime();
				selectionSort(vet1);
				fim = new Date().getTime();
				exibeVetor(vet1, "Vetor ordenado: ");
				
				System.out.println("O selection sort demorou " + (fim - inicio) + " milissegundo\n\n\n");
				break;
				

			case 4:
				inicio = new Date().getTime();
				quicksort(vet1, 0, vet1.length-1);
				fim = new Date().getTime();
				exibeVetor(vet1, "Vetor ordenado: ");
					
				System.out.println("O quick sort demorou " + (fim - inicio) + " milissegundos.\n\n\n");
				break;

				default:
					System.out.println("Opcao invalida!!!\n\n");
				}
			
			}
			    
			
		}while(tamanho > 0);

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
        System.out.println("\n");
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
	
	static void insertionSort(int v[]) {
		for(int i = 1; i < v.length; i++) {
			int x = v[i];
			
			for(int j = i - 1; j >= 0 && v[j] > x; j--) {
				v[j+1] = v[j];
				v[j] = x;
			}
		}
	}
	
	static void selectionSort(int v[]) {
		for(int i = 0; i < v.length-1; i++) {
			int min = i;
			for(int j = i+1; j < v.length; j++) {
				if(v[j] < v[min]) {
					min = j;
					int x = v[i];
					v[i] = v[min];
					v[min] = x;
				}
			}
		}
	}

	static int partition (int A[], int p, int r) {
        int x = A[r];
        int i = p-1;
        for(int j = p; j <= r-1; j++) {
            if (A[j] <= x) {
                i = i + 1;
                int aux = A[i];
                A[i] = A[j]; 
                A[j] = aux;
            }
        }
        i = i + 1;
        int aux = A[r]; 
        A[r] = A[i]; 
        A[i] = aux;
        return i;
    }

	static void quicksort (int[] A, int p, int r) {
        if (p < r) { 
            int q = partition(A, p, r);
            quicksort(A, p, q-1);
            quicksort(A, q+1, r);
        }
    }
	
	static int menu(){
		System.out.print("Digite o numero referente a opcao desejada:\n"
					   + "1 --> Bubble Sort;\n"
					   + "2 --> Insertion Sort;\n"
					   + "3 --> Selection Sort;\n"
					   + "4 --> Quick Sort. ");
		
		int resultado = scanner.nextInt();
		return resultado;
	}
}