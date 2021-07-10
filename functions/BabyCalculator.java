import java.util.Scanner;

public class BabyCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		double a, b, c;
		String op;

		do
		{
			System.out.print("> ");
			a  = keyboard.nextDouble();
			op = keyboard.next();
			b  = keyboard.nextDouble();

			if ( op.equals("+") )
				c = a + b;
			else if (op.equals("*"))
				c = a * b;
			else if (op.equals("-"))
				c = a - b;
			else if (op.equals("/"))
				c = a / (b*1.0);
			else
			{
				System.out.println("Undefined operator: '" + op + "'.");
				c = 0;
			}
			if ( a == 0)
				System.out.println("Bye,now.");
			else
				System.out.println(c);

		} while ( a != 0 );
	}
}

