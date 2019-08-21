package day4;

import java.util.Scanner;

public class MarkValidatorUsingIfElse {
	int marks;
	public boolean isPass(int marks) {
		
		this.marks= marks;
		if(marks>=40) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public char markGrade(int marks) {
	
			if(marks>90)
			{
				return 'A';
			}
			else if(marks>75){
				return 'B';
			}
			else if(marks>60)
			{
				return 'C';
			}
			else 
			{
				return 'D';
			}
			
		
	}

}
class LaunchMarkValidator {
	public static void main(String[] args) {
		
	    System.out.println("enter marks");
		Scanner scan = new Scanner(System.in);
		int marks = scan.nextInt();
		MarkValidatorUsingIfElse m = new MarkValidatorUsingIfElse();
	    String result = String.valueOf(m.isPass(marks));
	    if(result == "true") 
	    {
		      System.out.println("Strudent Grade is :"+m.markGrade(marks));
	    }
	   else 
	   {
		      System.out.println("Student Fail");
	   }
	
	
   }
}
