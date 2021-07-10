import java.util.Random;

public class BasicArray3{
    public static void main(String[] args){
        int[] randomArray = new int[1000];

        Random r = new Random();

        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = 10 + r.nextInt(90);
            System.out.print(randomArray[i] + " ");
        }
    }
}