package solitaire;

/*
 Simple Solitaire Card Game in Java
 Written by Tim Budd, Oregon State University, 1996
 */
// это программа -- апплет, которые сильнейшим образом ограничивают
import java.awt.*;
import java.applet.*;

public class Solitaire extends Applet { // унаследовались от класса Приложеньице .)
	//глобальные переменные
	static CardPile allPiles[]; // массив всех колод
	static DeckPile deckPile; // колода колоды
	static DiscardPile discardPile; // колода сброса
	static SuitPile suitPile[]; // 4 колоды мастей
	static TablePile tableau[]; // массив стопок на столе, 7 штук

	public void init() { // браузер создает экземпляр класса и вызывает метод init
		// first allocate the arrays, создаем все массивы
		allPiles = new CardPile[13];
		suitPile = new SuitPile[4];
		tableau = new TablePile[7];
		// then fill them in, заполняем их
		allPiles[0] = deckPile = new DeckPile(335, 5);
		allPiles[1] = discardPile = new DiscardPile(268, 5);
		for (int i = 0; i < 4; i++) {
			allPiles[2 + i] = suitPile[i] = new SuitPile(15 + 60 * i, 5);
		}
		for (int i = 0; i < 7; i++) {
			allPiles[6 + i] = tableau[i] = new TablePile(5 + 55 * i, 80, i + 1);
		}
	}

	public boolean mouseDown(final Event evt, final int x, final int y) { // реакция на нажатие мышки
		for (int i = 0; i < 13; i++) {
			if (allPiles[i].includes(x, y)) {
				allPiles[i].select(x, y);
				repaint(); // системный метод, вызовет метод paint
				return true;
			}
		}
		return true;
	}

	public void paint(final Graphics g) { // вызывается системой для отрисовки
		for (int i = 0; i < 13; i++) {
			allPiles[i].display(g); // просит каждую колоду отрисоваться
		}
	}
}