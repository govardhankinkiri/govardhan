package day8;

class Dog {
	String name;
	String colour;
	String breed;
	int cost;
	public Dog(String name, String colour, String breed, int cost) {
		super();
		this.name = name;
		this.colour = colour;
		this.breed = breed;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", colour=" + colour + ", breed=" + breed + ", cost=" + cost + "]";
	}
	void bark() {
		System.out.println("Dog barks");
	}
	void run() {
		System.out.println("Dog sleeps");
	}
	void sleep() {
		System.out.println("Dog eats");
	}
	
}
class Pen {
	String name;
	String colour;
	int cost;
	public Pen(String name, String colour, int cost) {
		super();
		this.name = name;
		this.colour = colour;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Pen [name=" + name + ", colour=" + colour + ", cost=" + cost + "]";
	}
	void write() {
		System.out.println("pen writes ");
	}
}
class Fan {
	String brand;
	String colour;
	int wings;
	int cost;
	public Fan(String brand, String colour, int wings, int cost) {
		super();
		this.brand = brand;
		this.colour = colour;
		this.wings = wings;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Fan [brand=" + brand + ", colour=" + colour + ", wings=" + wings + ", cost=" + cost + "]";
	}
	void starts() {
		System.out.println("Fan started");
	}
	void rotates() {
		System.out.println(" Fan rotates");
	}
	void stops() {
		System.out.println("Fan stops");
	}
	
	
}
public class CreationOfClasses {

	public static void main(String[] args) {
		Dog dog =new Dog("rocky", "red", "husky", 20000);
		System.out.println(dog.toString());
		dog.bark();
		dog.run();
		dog.sleep();
		Pen pen = new Pen("cello", "blue",10 );
		System.out.println(pen.toString());
		pen.write();
		Fan fan = new Fan("TroposAir", "black", 3, 27000);
		System.out.println(fan.toString());
		fan.starts();
		fan.rotates();
		fan.stops();
		
		
		
		

	}
}


