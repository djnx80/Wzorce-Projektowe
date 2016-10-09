package my.djnx.strategy;

public class Vehicle {
	
	private String name;
	private double topSpeed;
	private String sound;
	
	// dziêki kompozycji mo¿emy zmieniaæ w³aœciwoœci obiektów w 'locie'
	
	public Flys flyingType;
	
	public void setName(String newName){ name = newName; }
	public String getName(){ return name; }
	
	public void setTopSpeed(double newSpeed){ topSpeed = newSpeed; }
	public double getTopSpeed(){ return topSpeed; }
	
	public void setSound(String newSound){ sound = newSound; }
	public String getSound(){ return sound; }
	
	// odpowiedzialnoœæ za latanie bierze interfejs
	public String tryToFly(){
		return flyingType.fly();
	}
	
	// mo¿na zmienic mo¿liwoœci obiektu
	public void setFlyingAbility(Flys newFlyType){
		flyingType = newFlyType;
	}
	
}