import java.util.Random;

public class Megasena {
    public static void main (String []  args) {
        Random random = new Random();
        int  sena [] = new int [6];

        for(int i = 0; i<6; i++){
            sena[i]= random.nextInt(60) + 1;
        }
        System.out.println("Vamos ficar ricos!!!");
        for(int i=0; i<6; i++){
            System.out.println(sena[i] + " ");
        }
    }
}
