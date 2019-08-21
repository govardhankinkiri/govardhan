package day2;

import java.util.Scanner;

public class Temperature {
	double celsius,farenheit;

	public double convertToFarenheit(double celsius) {
		this.celsius=celsius;
		farenheit = (celsius*9)/5 +32;
		return farenheit;
	}
	public double convertToCelsius(double farenheit) {
		this.farenheit=farenheit ;
		celsius= (farenheit-32)*5/9;
		return celsius;
	}
}
	class LaunchTemperature {
		public static void main(String[] args) {
			Temperature t = new Temperature();
			System.out.println("enter the value of temperature which you want convert celsius to farenheit ");
			Scanner scan =new Scanner(System.in);
			double celsius =scan.nextDouble();
			System.out.println("converted temperature is "+t.convertToFarenheit(celsius));
			System.out.println("enter the value of temperature which you want convert farenheit to celsius : ");
			double farenheit =scan.nextDouble();
			System.out.println("converted temperature is " +t.convertToCelsius(farenheit));
			
		}
		
}


