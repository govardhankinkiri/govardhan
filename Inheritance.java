
package day7;

public class Inheritance  {
	public void takeoff() {
		System.out.println("plane is tookoff");
	}
	public void fly() {
		System.out.println("plane is flying");
	}
    public void land() {
    	System.out.println("plane is landed");
    }

}
class PassengerPlane extends Inheritance  {
	public void fly() {
		System.out.println("Passenger plane is flying at medium heights ");
		}
	void carry() {
		System.out.println("Passenger plane carring passengers");
	}
}

class CargoPlane extends Inheritance  {
	public void fly() {
		System.out.println("Cargo plane is flying at lower heights ");
		}
	void carry() {
		System.out.println("Cargo plane carrying goods");
	}
}
class FighterPlane extends Inheritance  {
	public void fly() {
		System.out.println("Fighter plane is flying at higher heights ");
		}
	void carry() {
		System.out.println("Fighter plane carrying weapons");
	}
}
class LaunchInhertiance {
   public static void main(String[] args) {
	

	CargoPlane cp = new CargoPlane();
	PassengerPlane pp = new PassengerPlane();
	FighterPlane fp = new FighterPlane();
	cp.takeoff();
	cp.carry();
	cp.fly();
	cp.land();
	pp.takeoff();
	pp.carry();
	pp.fly();
	pp.land();
	fp.takeoff();
	fp.carry();
	fp.fly();
	fp.land();
   }
}