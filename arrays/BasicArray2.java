import java.util.Random;
public class BasicArray2{
    public static void main(String[] args){

        //Declarar un array
        int[] intArray = new int[10];
        Random r = new Random();
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = 1+ r.nextInt(100);
            System.out.println("Slot " + i + " contains a " + intArray[i]);
        }


    }
}