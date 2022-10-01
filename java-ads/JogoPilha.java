import java.util.Random;

public class JogoPilha {
    public static void main(String[] args) {
        Pilhas p = new Pilhas (12);
        Random random = new Random();
        do {
            if  (random.nextInt() % 2 == 0) {
                if (!p.estaCheia())
                p.push(random.nextInt(10));
                else
                    System.out.println("Buuuuummmmm");
            }
            else {
                if (!p.estaVazia())
                    System.out.println(p.pop() + " foi desempilhado");
                else
                    System.out.println ("queenn");
            }
            System.out.println(p);
            System.out.println("vetor: ");
            //for  (int i=0; i<p.dados.length; i++)
            //    System.out.print(p.dados[i] + " ");
        }while (!p.estaVazia());
    }
}