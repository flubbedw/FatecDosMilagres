import java.util.Random;
    public class Random1{
        public static void main(String[] args){
            int sena[] = new int[6];
            Random random = new Random();
        for (int i=0; i<6; i++){
            sena[i] = random.nextInt(60) + 1;
            
        }
        System.out.println("Vamos ficar ricos!!!!!!!");
        for (int i = 0; i < 6; i++){
            System.out.print(sena[i] +  " ");
        }
        System.out.println();
    } 
}
