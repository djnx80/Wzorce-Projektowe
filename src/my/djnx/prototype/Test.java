package my.djnx.prototype;

public class Test {

	public static void main(String[] args) {
		
		// Handles routing makeCopy method calls to the 
		// right subclasses of Animal
		
		CloneFactory vehicleMaker = new CloneFactory();
		
		// Creates a new Sheep instance
		
		Car car = new Car();
		
		// Creates a clone of Sally and stores it in its own memory location
		
		Car clonedCar = (Car) vehicleMaker.getClone(car);
		
		// These are exact copies of each other
		
		System.out.println(car);
		
		System.out.println(clonedCar);
		
		System.out.println("Car HashCode: " + System.identityHashCode(System.identityHashCode(car)));
		
		System.out.println("Car (klon) HashCode: " + System.identityHashCode(System.identityHashCode(clonedCar)));
	
	}

}
