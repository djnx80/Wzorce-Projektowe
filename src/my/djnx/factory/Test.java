package my.djnx.factory;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// Create the factory object
		VehicleFactory vehicleFactory = new VehicleFactory();

		// Enemy ship object
		Vehicle vehicle = null;
		Scanner inputTypeOfVehicle = new Scanner(System.in);
		System.out.print("Wybierz transport? (Polonez / Ciê¿arówka / JumboJet) (P / C / J)");

		if (inputTypeOfVehicle.hasNextLine()) {
			String typeOfVehicle = inputTypeOfVehicle.nextLine();
			vehicle = vehicleFactory.makeEnemyShip(typeOfVehicle);
			if (vehicle != null) {
				displayVehicleValues(vehicle);
			} else
				System.out.print("Wybierz prawid³owo!");
		}
		inputTypeOfVehicle.close();
	}

	// Executes methods of the super class
	public static void displayVehicleValues(Vehicle vehicle) {
		vehicle.displayVehicle();
		vehicle.vehicleSpeed();
	}
}
