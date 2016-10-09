package my.djnx.strategy;

public class Vehicle {
	
	private String name;
	private double topSpeed;
	private String sound;
	
	// dzi�ki kompozycji mo�emy zmienia� w�a�ciwo�ci obiekt�w w 'locie'
	
	public Flys flyingType;
	
	public void setName(String newName){ name = newName; }
	public String getName(){ return name; }
	
	public void setTopSpeed(double newSpeed){ topSpeed = newSpeed; }
	public double getTopSpeed(){ return topSpeed; }
	
	public void setSound(String newSound){ sound = newSound; }
	public String getSound(){ return sound; }
	
	// odpowiedzialno�� za latanie bierze interfejs
	public String tryToFly(){
		return flyingType.fly();
	}
	
	// mo�na zmienic mo�liwo�ci obiektu
	public void setFlyingAbility(Flys newFlyType){
		flyingType = newFlyType;
	}
	
}