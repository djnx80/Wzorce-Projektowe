package my.djnx.prototype;

public class CloneFactory {
	
	// Receives any Animal, or Animal subclass and
	// makes a copy of it and stores it in its own
	// location in memory
	
	// CloneFactory has no idea what these objects are
	// except that they are subclasses of Animal
	
	public Vehicle getClone(Vehicle vehicleSample) {
		
		// Because of Polymorphism the Sheeps makeCopy()
		// is called here instead of Animals
		
		return vehicleSample.makeCopy();
		
	}
	
}