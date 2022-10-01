import java.util.Scanner;

public class TestePilha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Qual e a capacidade da pilha? ");
        int capacidade = scanner.nextInt();


        Pilhas pilha = new Pilhas(capacidade);

        if(pilha.estaVazia()){
            System.out.println("Pilha esta vazia");
        }else {
            System.out.println("Pilha esta Cheia");
        }

        if(pilha.estaCheia()){
            System.out.println("Pilha esta Cheia");
        }else {
            System.out.println("Pilha nao esta Cheia");
        }

        int i = 10;

        while(!pilha.estaCheia()) {
            pilha.push(i++);
            System.out.println(pilha);
        }

        while (!pilha.estaVazia()) {
            System.out.println(pilha.pop());
        }
        System.out.println(pilha);
        scanner.close();
    }
}