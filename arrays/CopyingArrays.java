import java.util.Random;

public class CopyingArrays{
    
    public static void main(String[] args){
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        Random r = new Random();

        for (int i = 0; i < array1.length; i++){
            array1[i] = 1 + r.nextInt(10);
        }

        for (int i = 0; i < array2.length; i++){
            array2[i] = array1[i];
        }
    }
}