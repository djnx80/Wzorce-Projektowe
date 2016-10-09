package my.djnx.strategy;

public interface Flys {
	String fly();
}

//Class used if the Animal can fly
class ItFlys implements Flys{
	public String fly() {
		return "I (believe I) can fly...";
	}
}

//Class used if the Animal can't fly
class CantFly implements Flys{
	public String fly() {
		return "No wings, no fly. (Unless it is a rocket)";
	}
}