package my.djnx.factory;

public class VehicleFactory {
	// This could be used as a static method if we
	// are willing to give up subclassing it

	public Vehicle makeEnemyShip(String newShipType) {

		if (newShipType.equals("P")) {
			return new Car();
		} else if (newShipType.equals("C")) {
			return new Lorry();
		} else if (newShipType.equals("J")) {
			return new Plane();
		} else
			return null;

	}
}
