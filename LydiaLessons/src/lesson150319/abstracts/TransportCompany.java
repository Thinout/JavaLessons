package lesson150319.abstracts;

public class TransportCompany {
	public static void main(final String[] args) {
		
		//horse.moveTo(10, 10);
		
		//start(lada);
		//start(audi);
		//start(horse);
		
		Vehicle[] vehicles = new Vehicle[3];
		
		vehicles[0] = new Lada();
		vehicles[1] = new Audi();
		vehicles[2] = new Horse();
		
		for (Vehicle vehicle : vehicles) {
			vehicle.moveTo(100, 100);
		}
		
	}
}
