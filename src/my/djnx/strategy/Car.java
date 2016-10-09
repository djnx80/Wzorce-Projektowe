package my.djnx.strategy;

public class Car extends Vehicle{
	
	public Car(){
		super();
		setSound("szzzzz");
		flyingType = new CantFly();
	}

	@Override
	public String toString() {
		return "Car [getName()=" + getName() + ", getTopSpeed()=" + getTopSpeed() + ", getSound()=" + getSound() + ", tryToFly()=" + tryToFly() + "]";
	}
	
}