package lesson150421.patterns.mediator;

public class Parrot {

	private Cat _cat;
	private Dog _dog;
	
	public void setCat(final Cat cat) {
		_cat = cat;
	}

	public void setDog(final Dog dog) {
		_dog = dog;
	}

	
	public void catchHim() {
		// TODO Auto-generated method stub
		
	}
	
	private void play() {
		_dog.дразнит();
		_cat.flyAway();
	}

}
