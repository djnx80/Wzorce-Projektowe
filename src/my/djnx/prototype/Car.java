package my.djnx.prototype;

public class Car implements Vehicle {

	public Car(){
		
		System.out.println("Stworzono nowy samochód");
		
	}
	
	public Vehicle makeCopy() {
		
		System.out.println("Samochód jest tworzony");
		
		Car carObject = null;
		
		try {
			
			// Calls the Animal super classes clone()
			// Then casts the results to Sheep
			
			carObject = (Car) super.clone();
			
		}
		
		// If Animal didn't extend Cloneable this error is thrown
		
		catch (CloneNotSupportedException e) {
			  
			System.out.println("The Sheep was Turned to Mush");
			
			e.printStackTrace();
			  
		 }
		
		return carObject;
	}
	
	public String toString(){
		
		return "Fiat 126P";
		
	}
	
}