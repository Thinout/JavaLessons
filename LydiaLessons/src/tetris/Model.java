package tetris;

import java.util.ArrayList;
import java.util.List;

public class Model {
	// Logic + State
	// Listener/Observer
	
	Logic _logic;
	
	public Model() {
		Field field = new Field(10, 20);
		State state = new State();
		state.setField(field);
		state.setFigure(Figure.randomFigure());
		_logic = new Logic(state);
	}
	
	List<ModelListener> _listeners = new ArrayList<>();
	
	public void addListener (final ModelListener listener) { 
		_listeners.add(listener);
	}
	
	public void removeListener (final ModelListener listener) {
		_listeners.remove(listener);
	}
	
	void fireChangedEvent() {
		for (ModelListener modelListener : _listeners) {
			modelListener.onChange(_logic.getState());
		}
	}
	
	public void moveLeft() {
		if (_logic.moveLeft()) {
			fireChangedEvent();
		}
	}
	
	public void moveRight() {
		if (_logic.moveRight()) {
			fireChangedEvent();
		}
	}
	
	public void moveDown() {
		if (_logic.moveDown()) {
			fireChangedEvent();
		}
	}
	
	public void dropDown() {
		if (_logic.dropDown()) {
			fireChangedEvent();
		}
	}
	
}
