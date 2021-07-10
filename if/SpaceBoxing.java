import java.util.Scanner;
public class SpaceBoxing{
    public static double CalculateWeight(int planetNumber, double EarthWeight){
        double newWeight = -1;

        if (planetNumber == 1){
            newWeight = EarthWeight * 0.78;
        } else if (planetNumber == 2){
            newWeight = EarthWeight * 0.39;

        } else if (planetNumber == 3){
            newWeight = EarthWeight * 2.65;

        } else if (planetNumber == 4){
            newWeight = EarthWeight * 1.17;

        } else if (planetNumber == 5){
            newWeight = EarthWeight * 1.05;

        } else if (planetNumber == 6){
            newWeight = EarthWeight * 1.23;

        }
        return newWeight;
    }

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        double EarthWeight, newWeight;
        int planetNumber;

        System.out.print("Please enter your current earth weight: ");
        EarthWeight = keyboard.nextDouble();
        
        System.out.println("I have information for the following planets:");
        System.out.println("\t1. Venus\t2. Mars\t3. Jupiter");
        System.out.println("\t4. Saturn\t5. Uranus\t6. Neptune\n");


        System.out.print("Which planet are you visiting?");
        planetNumber = keyboard.nextInt();

        newWeight = CalculateWeight(planetNumber, EarthWeight);

        if (newWeight == -1){
            System.out.println("You've introduced an incorrect planet.");

        } else {
            System.out.println("Your weight would be " + newWeight + " pounds on that planet.");
    
        }
    }
}