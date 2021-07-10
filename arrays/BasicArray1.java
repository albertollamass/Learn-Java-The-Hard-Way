public class BasicArray1{
    public static void main(String[] args){

        //Declarar un array
        int[] intArray = new int[10];

        for(int i = 0; i < intArray.length; i++){
            intArray[i] = -113;
            System.out.println("Slot " + i + " contains a " + intArray[i]);
        }


    }
}