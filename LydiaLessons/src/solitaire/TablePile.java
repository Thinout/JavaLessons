package solitaire;

import java.awt.Graphics;

class TablePile extends CardPile {

	TablePile(final int x, final int y, final int c) {
		// initialize the parent class
		super(x, y);
		// then initialize our pile of cards
		for (int i = 0; i < c; i++) {
			addCard(Solitaire.deckPile.pop());
		}
		// flip topmost card face up
		top().flip();
	}

	public boolean canTake(final Card aCard) {
		if (empty()) {
			return aCard.isKing(); // на пустую можно положить только короля
		}
		Card topCard = top();
		return (aCard.color() != topCard.color()) // карты разного цвета
				&& (aCard.getRank() == topCard.getRank() - 1); // И разница их рангов равна 1
	}

	public void display(final Graphics g) {
		stackDisplay(g, top());
	}
	// ************ ДЗ *************
	public boolean includes(final int tx, final int ty) {
		// don't test bottom of card
		return x <= tx && tx <= x + Card.width && y <= ty; // если у нас есть стопка, 
	}

	public void select(final int tx, final int ty) { // кликнули мышкой
		if (empty()) { // если стопка пустая, то ничего не делаем
			return;
		}

		// if face down, then flip
		Card topCard = top();
		if (!topCard.isFaceUp()) { // если верхняя карта  лицом вниз
			topCard.flip(); // то переворачиваем
			return; // и выходим
		}
		// *********** ДЗ *************
		// избавиться от дублирования
		// else see if any suit pile can take card
		topCard = pop(); // забираем карту из стопки
		for (int i = 0; i < 4; i++) { // и прикладываем ко всем стопкам, вдруг куда подойдет
			if (Solitaire.suitPile[i].canTake(topCard)) { // сначала все стопки с мастям
				Solitaire.suitPile[i].addCard(topCard);
				return;
			}
		}
		// else see if any other table pile can take card
		for (int i = 0; i < 7; i++) { // потом перебираем все стопки на столе
			if (Solitaire.tableau[i].canTake(topCard)) {
				Solitaire.tableau[i].addCard(topCard);
				return;
			}
		}
		// else put it back on our pile
		addCard(topCard);
	}

	private int stackDisplay(final Graphics g, final Card aCard) {
		int localy;
		if (aCard == null) {
			return y;
		}
		localy = stackDisplay(g, aCard.link);
		aCard.draw(g, x, localy);
		return localy + 35;
	}

}