package my.djnx.strategy;

public class Test {

	public static void main(String[] args) {
		Vehicle plane = new Plane();
		Vehicle car = new Car();
		
		plane.setName("Jumbo Jet");
		plane.setTopSpeed(700.0);
		car.setName("Tesla");
		car.setTopSpeed(250.0);
		printObjects(plane, car);
		
		// let the car fly
		car.setFlyingAbility(new ItFlys());

		printObjects(plane, car);
		

	}

	private static void printObjects(Vehicle plane, Vehicle car)	{
		System.out.println(plane.toString());
		System.out.println(car.toString());
	}
}
