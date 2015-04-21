package lesson150421.patterns.observer;

public class Termometer {
	
	private static final int MAX_TEMP = 3;
	private FirePreventionSystem _system;

	public Termometer(final FirePreventionSystem system) {
		_system = system;
	}
	
	int _currentTemperature;
	
	public void increase() {
		_currentTemperature++;
		if(_currentTemperature > MAX_TEMP) {
			_system.turnSignalOn();
		}
	}
	
	public void decrease() {
		_currentTemperature--;
	}
	
}
