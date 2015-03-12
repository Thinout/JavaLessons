package lesson150310;

public class Somebody { // Refactoring -- alt + command + R
	
	public Somebody() {	
	}
	
	public Somebody(String name) {
		this.name = name;
	}

	private String name;
	

	public void ping() {
		System.out.println("Pong from " + name);
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Somebody personA = new Somebody("Pete");
		personA.setName("John");
		personA.ping();
		
		Somebody personB = personA; // при присваивании происходит лишь копирование ссылки, но не объекта
		personB.ping();
		
	}

}
