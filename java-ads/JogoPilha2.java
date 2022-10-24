import java.util.Scanner;
import java.util.Random;

public class JogoPilha2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a capacidade da pilha: ");
        int capacidade = sc.nextInt();
        Pilhas p = new Pilhas (capacidade);
        Random random = new Random();
        do {
            if  (random.nextInt(2) == 0) {
                if (!p.estaCheia())
                    p.push(random.nextInt(10));
            }
            else {
                if (!p.estaVazia())
                    System.out.println(p.pop() + " saiu");
            }
            System.out.println(p);
            sc.close();
         }while (!p.estaVazia());
    }
}