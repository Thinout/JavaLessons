package lesson150430.enums;

public enum Apple {
	
	Jonathan(10), GoldenDel(100), RedDel(50), Winesap(5), Cortland(60);
	
	private int price;
	
	Apple(final int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
}
