package day9;
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
	
	
}

public class CreationOfObjects {
	public static void main(String[] args) {
		Dog d1 = new Dog("pinky", "brown", "husky", 20000);
		Dog d2 = new Dog("rocky", "red", "goldenretriever",25000 );
		System.out.println(d1.toString());
		System.out.println(d2.toString());

	}

}
