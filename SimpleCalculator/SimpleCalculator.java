import java.util.Scanner;
public class SimpleCalculator
{
	public static void main(String args[])
	{
		int ch;
		double sum =0;
		Calculator ob = new Calculator();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("\nCALCULATOR");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Modulo Division");
			System.out.println("6.Exit");
			System.out.print("Select an operation : ");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1 :     ob.read();
				                  sum = ob.add();
				                  System.out.println("\nAddition = "+sum );
				                  break;
				
				case 2 :     ob.read();
				                  sum = ob.sub();
				                  System.out.println("\nSubtraction = "+sum );
				                  break;
				
				case 3 :     ob.read();
				                  sum = ob.mul();
				                  System.out.println("\nMultiplication = "+sum );
				                  break;
				
				case 4 :     ob.read();
				                  sum = ob.div();
				                  System.out.println("\nDivision = "+sum );
				                  break;
				
				case 5 :     ob.read();
				                  sum = ob.mod();
				                  System.out.println("\nModulo = "+sum );
				                  break;
	
				case 6 :      System.exit(1);

				default :    System.out.println("\nPlease enter a valid input.");	
			}
		}
	}
}