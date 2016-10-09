package my.djnx.strategy;

public class Plane extends Vehicle{

	public Plane(){
		super();
		setSound("wziuum");
		flyingType = new ItFlys();
	}

	@Override
	public String toString() {
		return "Plane [getName()=" + getName() + ", getTopSpeed()=" + getTopSpeed()
				+ ", getSound()=" + getSound() + ", tryToFly()=" + tryToFly() + "]";
	}

}