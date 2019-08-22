package day5;
import java.util.*;
class Factorial
{
	int number;
	int calculateFactorial(int number)
	{
		this.number=number;
		int product=1;
		for(int i=1;i<=number;i++)
		{
			product=product*i;
		}
		return product;
	}

 }
class LaunchFactorial
{
	public static void main(String[] args)
	{
		System.out.println("enter the number");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		Factorial f= new Factorial();
		System.out.println("Factorial  of "+number+" is "+f.calculateFactorial(number));

 	}
}
