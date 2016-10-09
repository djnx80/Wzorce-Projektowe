package my.djnx.factory;

public abstract class Vehicle {

	private String name;
	private double speed;

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double newSpeed) {
		speed = newSpeed;
	}

	public void displayVehicle() {
		System.out.println("Aktywowano: " + getName());
	}

	public void vehicleSpeed() {
		System.out.println(getName() + " osi¹ga prêdkoœæ " + getSpeed());
	}

}
