package tetris;

public class Controller implements ModelListener {

	private View _view;
	private Model _model;

	@Override
	public void onChange(final State state) {
		_view.draw(state);
	}

	public void setView(final View view) {
		_view = view;
	}
	
	public void setModel(final Model model) {
		_model = model;		
	}
	
	//Делегируем сообщения в модель
	//Здесь может быть дополнительная обработка,
	//поэтому не надо пугаться
	public void moveLeft() {
		_model.moveLeft();
		System.out.println("Left");
	}

	public void moveRight() {
		_model.moveRight();
		System.out.println("Right");
	}

	public void moveDown() {
		_model.moveDown();		
	}
	
	public void dropDown() {
		_model.dropDown();
		System.out.println("Drop");
	}

}
