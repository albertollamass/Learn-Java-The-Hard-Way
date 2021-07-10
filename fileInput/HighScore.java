import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class HighScore
{
	public static void main( String[] args ) throws Exception
	{
		PrintWriter fileout;
		Scanner keyboard = new Scanner(System.in);
		fileout = new PrintWriter( new FileWriter("score.txt") );
		
        System.out.println("You got a high score!");

        System.out.print("Please enter your score: ");
        fileout.println(keyboard.nextInt());

        System.out.print("Please enter your name: ");
        fileout.println(keyboard.next());

        System.out.println("Data stored into score.txt.");
		
		fileout.close();
	}
}