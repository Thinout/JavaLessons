package lesson150430.enums;

public class UseEnums {
	
	public static void main(final String[] args) {
		
		for (Apple kind : Apple.values()) {
			System.out.println(kind + " price is " + kind.getPrice());
		}
		
		Apple ap = Apple.valueOf(args[0]);
		
		System.out.println(ap.ordinal());
		
		switch (ap) {
		case GoldenDel:
			break;
			
		case Jonathan:
			break;
			
		case Winesap:
			break;
			
		case RedDel:
			break;
			
		}
	}
	
}
