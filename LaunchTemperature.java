package day1;
import java.util.*;
class Temperature 
{
	double farenheit,celsius;
	double converTOFarenheit(Double celsius)
	{
		this.celsius=celsius;
		farenheit =(celsius*9/5)+32;
		return farenheit;
		
	}
	double converTOCelsius(Double farenheit)
	{
		this.farenheit=farenheit;
		celsius =(farenheit-32)*5/9;
		return celsius;
		
	}
	

}
class LaunchTemperature
{
	public static void main(String[] args)
	{
		double farenheit, celsius;
		System.out.println("enter temperature in celsius");
		Scanner scan= new Scanner(System.in);
		celsius=scan.nextDouble();
		Temperature t= new Temperature();
		System.out.println("converted temperature is");
		System.out.println(t.converTOFarenheit(celsius));
		System.out.println("enter temperature in farenheit");
		farenheit=scan.nextDouble();
		System.out.println("converted temperature is");
		System.out.println(t.converTOCelsius(farenheit));
	}
}
