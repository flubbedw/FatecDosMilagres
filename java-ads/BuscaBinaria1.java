import java.util.Random;
import java.util.Scanner;
import java.util.Date;

public class BuscaBinaria1 {
	
	static Scanner scanner;
	static Random random;
	
	static void geraVetor(int v[]) {
		for (int i =0; i<v.length; i++) {
			v[i] = random.nextInt(10*v.length);
		}
	}
	
	static void exibeVetor(int v[], String msg) {
		System.out.println("\n" + msg);
		for (int i =0; i<v.length; i++) {
			System.out.print(v[i] + " | " );
		}
		System.out.println();
	}
	
	static void bubble(int v[]) {
		for (int i= 0 ; i <v.length; i++) {
			for(int j= 0 ; j<v.length-1; j++) {
				if(v[j] > v[j+1]) {
					int aux = v[j];	
					v[j] = v[j+1];
					v[j+1] = aux;
				}
			}
		}
	}
	
	static void insertion (int v[]) {
		int aux, j;
		for (int i = 1; i<v.length; i++) {
			aux = v[i];
			j = i - 1;
			while (j >= 0 && v[j] > aux) {
				v[j+1]  = v[j];
				j--;
			}
			v[j+1] = aux;
		}
	}
	
	static void selection (int v[]) {
		int posicao_menor, aux;
		for (int i = 0; i < v.length; i++) {
			posicao_menor = i;
			for (int j = i+1; j < v.length; j++) {
				if(v[j] < v[posicao_menor]) {
					posicao_menor = j;
				}
			}
			aux = v[posicao_menor];
			v[posicao_menor] = v[i];
			v[i] = aux;
		}
	}
	
	static boolean buscaBinaria(int x, int v[]) {
		//devolver uma posição onde x aparece ou -1, caso contrário;
		int ini = 0,  fim = v.length-1;
		while(ini <= fim) {
			int meio = (ini + fim)/2;
			//System.out.println("ini: " + ini + " fim: " + fim + " meio: " + meio );
			if (v[meio] == x) {
				return true;
			} else if (x > v[meio]) {
				ini = meio + 1;
			} else {
				fim = meio - 1;
			}
		}
		//System.out.println("ini: " + ini + " fim: " + fim );
		return false;
	}
	
	static boolean buscaSimples (int x, int v[]) {
		int i =0;
		while(i<v.length) {
			if(v[i] == x) {
				return true;
			} else {
				i++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
        w
    }