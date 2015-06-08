package tetris;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StateTest {

	private State _state;
	private Logic _logic;

	@Before
	public void setup() {
		_state = new State();
		_logic = new Logic(_state);
		Field field = new Field(10, 20);
		Figure figure = new Figure();
		_state.setField(field);
		_state.setFigure(figure);
	}
	
	@Test
	public void testSetFigure() {
		assertEquals(3, _state.col);
		assertEquals(0, _state.row);
	}
	
	@Test
	public void testMoveLeft() {
		int col = _state.col;
		_logic.moveLeft();
		assertEquals(col - 1, _state.col);
	}
	
	@Test
	public void testMoveRight() {
		int col = _state.col;
		_logic.moveRight();
		assertEquals(col + 1, _state.col);
	}
	
	@Test
	public void testMoveDown() {
		_state._figure = Figure.FOUR_HORIZONTAL;
		int row = _state.row;
		_logic.moveDown();
		assertEquals(row + 1, _state.row);
	}
	
	@Test
	public void testMoveLeftTooFar() throws Exception {
		_state._figure = Figure.FOUR_HORIZONTAL;
		_state.col = 0;
		_logic.moveLeft();
		assertEquals(0, _state.col);		
	}
	
	@Test
	public void testMoveRigntTooFar() throws Exception {
		_state._figure = Figure.FOUR_HORIZONTAL;
		int col = _state.col = _state._field.getWidth() - 4;
		_logic.moveRight();
		assertEquals(col, _state.col);
	}
	
	@Test
	public void testFigureDoesntFitField() throws Exception {
		_state._figure = Figure.FOUR_HORIZONTAL;
		_state.col = -1;
		assertEquals(false, _logic.isFigureFitsField());
		_state.col = 0;
		assertEquals(true, _logic.isFigureFitsField());
	}
	
	@Test
	public void testMoveDownTooFar() throws Exception {
		_state._figure = Figure.FOUR_HORIZONTAL;
		_state.row = _state._field.getHeight() - 3;
		assertTrue(_logic.isFigureFitsField());
		_logic.moveDown();
		assertTrue(_logic.isFigureFitsField());
		assertEquals(_state._field.getHeight() - 3, _state.row);
	}
	
	@Test
	public void testFigureOverlapsFieldContent() throws Exception {
		_state._figure = Figure.FOUR_HORIZONTAL;
		_state._field._data[3][_state.col] = 2;
		_logic.moveDown();
		assertTrue(_logic.isFigureFitsField());
		assertEquals(0, _state.row);
		
		
	}
}
