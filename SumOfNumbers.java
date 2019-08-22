package day6;

import java.util.Scanner;

public class SumOfNumbers {
	int start,end;
	public int sumOfEvenNumbers(int start, int end) {
		 
		this.start= start;
		this.end=end;
		int sum=0;
		if(start % 2 ==0)
		{
			for(int i=start;i<=end;) {
			  sum=sum+i;
				i=i+2;
			}
		
		}
		
		else
		{
			for(int i=start+1;i<=end;) {
			  sum=sum+i;
				i=i+2;
			}
			
		}
		return sum;
	}
		public int sumOfOddNumbers(int start, int end) {
			 
			this.start= start;
			this.end=end;
			int number;
			int sum=0;
			if(start % 2 ==0)
			{
				for(int i=start+1;i<=end;) {
				  sum=sum+i;
					i=i+2;
				}
			
			}
			
			else
			{
				for(int i=start;i<=end;) {
				  sum=sum+i;
					i=i+2;
				}
				
			}
			return sum;
	  
		}
		
	
}
class LaunchSumOfNumbers {
	public static void main(String[] args) {
		System.out.println("Enter starting and ending numbers");
		Scanner scan = new Scanner(System.in);
		int start =scan.nextInt();
		int end = scan.nextInt();
		SumOfNumbers sum= new SumOfNumbers();
		System.out.println("Sum of even number from "+start+"to"+end+" is"+sum.sumOfEvenNumbers(start, end) );
		System.out.println("Sum of odd number from "+start+"to"+end+" is"+sum.sumOfOddNumbers(start, end) );
		
	}
	
}