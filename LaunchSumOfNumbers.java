package Day4;
import java.util.Scanner;
class SumOFNumbers 
{
	int start,end;
	int sumOfEvenNumbers(int start,int end)
	{
		this.start=start;
		this.end=end;
		int sum=0;
		if(start%2==0)
		{
			for(int i=start;i<=end;)
			{
				sum=sum+i;
				i=i+2;
				
			}
		}
			
		else
		{
			for(int i=start+1;i<=end;)
			{
				sum=sum+i;
				i=i+2;
				
			}
		}
		return sum;
		
	}
	int sumOfOddNumbers(int start,int end)
	{
		this.start=start;
		this.end=end;
		int sum=0;
		if(start%2==0)
		{
			for(int i=start+1;i<=end;)
			{
				sum=sum+i;
				i=i+2;
				
			}
		}
			
		else
		{
			for(int i=start;i<=end;)
			{
				sum=sum+i;
				i=i+2;
				
			}
	
		}
		return sum;
	}
}
class LaunchSumOfNumbers
{
	public static void main(String[] args)
	{
		System.out.println("enter starting number");
		Scanner scan=new Scanner(System.in);
		int start =scan.nextInt();
		System.out.println("enter ending number");
		int end = scan.nextInt();
		SumOFNumbers n=new SumOFNumbers();
		System.out.println("Sum of even numbers is " +n.sumOfEvenNumbers(start, end));
		System.out.println("Sum of odd numbers is " +n.sumOfOddNumbers(start, end));
		
		
		
		
		
	}
}


