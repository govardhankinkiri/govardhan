package day3;
import java.util.Scanner;
class Markvalidator 
{
	int mark;
 boolean isPass(int mark)
 {
	  this.mark=mark;
	  if(mark>=40)
	  {
		  return true;
	  }
	  else
	  {
		  return false;
		  
	  }
 }
 void markGrade(int m)
	  {
	 	 
	 String result = String.valueOf(isPass(mark));
		switch (result) {
		case "true":{

			if (mark>90) 
				{
				System.out.println( "Grade A");
				break;
			     }
			else if(mark>75)
				{
				System.out.println( "Grade B");
				break;
			    }
			else if(mark>60)
				{
				System.out.println( "Grade c");
				break;
			    }
		}
 		default:
         
			System.out.println( "Grade D");
		}
 }
	

}
class LaunchMarkValidator1
{
public static void main (String[] args)
	{
		
		System.out.println("enter marks");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Markvalidator m=new Markvalidator();
		if(m.isPass(n)==true)
		{
			m.markGrade(n);
			
		}
		else
		{
			System.out.println("student is fail");
			
		}
		
		
	}
}