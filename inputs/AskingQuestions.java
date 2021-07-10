import java.util.Scanner;

public class AskingQuestions{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int age;
        String height;
        double weight;

        System.out.println("How old are you?");
        age = keyboard.nextInt();

        System.out.println("How tall are you?");
        height = keyboard.next();

        System.out.println("How much do you weight?");
        weight = keyboard.nextDouble();

        System.out.println("So you're " + age + " old, " + height + " tall and "+weight+ " heavy.");


    }
}