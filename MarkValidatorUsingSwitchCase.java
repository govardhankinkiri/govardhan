package day3;

import java.util.Scanner;

public class MarkValidatorUsingSwitchCase

{

	int marks;

 boolean isPass(int marks)

 {

	  this.marks=marks;

	  if(marks>=40)

	  {

		  return true;

	  }

	  else

	  {

		  return false;

		  

	  }

 }

 public  char markGrade(int marks)

	  {



		switch (marks) {

		case 100:
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
		case 92:
		case 91:
			
		return 'A';
		 
		case 76:
		case 77:
		case 78:
		case 79:
		case 80:
		case 81:
		case 82:
		case 83:
		case 84:
		case 85:
		case 86:
		case 87:
		case 88:
		case 89:
		case 90:
		 
		return 'B';
		
		case 61:
		case 62:
		case 63:
		case 64:
		case 65:
		case 66:
		case 67:
		case 68:
		case 69:
		case 70:
		case 71:
		case 72:
		case 73:
		case 74:
		case 75:
			
	    return 'c';
			
 		default:

        return 'D';

		}

 }

	



}

class LaunchMarkValidatorUSingSwitchCase

{

public static void main (String[] args)

	{

		

		System.out.println("enter marks");

		Scanner scan=new Scanner(System.in);

		int marks=scan.nextInt();

		MarkValidatorUsingSwitchCase m=new MarkValidatorUsingSwitchCase();

	    String result = String.valueOf(m.isPass(marks));
	    if(result == "true") 
	    {
		   System.out.println("student Grade :"  +m.markGrade(marks));
	    }
	   else 
	   {
		      System.out.println("Student Fail");
	   

	}

}
}
