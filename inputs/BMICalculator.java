import java.util.Scanner;

public class BMICalculator{
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        double height, weight, BMI;

        System.out.print("Your height in m: ");
        height = keyboard.nextDouble();

        System.out.print("Your weight in kg: ");
        weight = keyboard.nextDouble();

        BMI = weight / (height * height);
        

        System.out.println("Your BMI is " + BMI );
    }
}