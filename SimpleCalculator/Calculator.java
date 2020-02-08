import java.util.Scanner;
public class Calculator extends SimpleCalculator
{
	double n1,n2;
	public void read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		//First number
		n1 = sc.nextDouble();
		System.out.print("Enter the second number : ");
		//Second number
		n2 = sc.nextDouble();
	}
	public double add()
	{
		return (n1 + n2);
	}	
	public double sub()
	{
		return (n1 - n2);
	}
	public double mul()
	{
		return (n1 * n2);
	}
	public double div()
	{
		return (n1 / n2);
	}
	public double mod()
	{
		return (n1 % n2);
	}
}	