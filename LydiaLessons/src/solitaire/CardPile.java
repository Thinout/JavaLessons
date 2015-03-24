package solitaire;

import java.awt.Color;
import java.awt.Graphics;

class CardPile {

	private Card firstCard; // ссылка на первую карту, верхнюю

	// coordinates of the card pile
	protected int x;
	protected int y;

	// конструктор
	CardPile(final int xl, final int yl) {
		x = xl;
		y = yl;
		firstCard = null; // стопка пустая
	}

	// the following are sometimes overridden

	public void addCard(final Card aCard) { // добавление карты в стопку
		aCard.link = firstCard;
		firstCard = aCard;
	}

	public boolean canTake(final Card aCard) { // может ли эта стопка принять эту карту 
		return false; // реализация по умолчанию
	}

	public void display(final Graphics g) { // сообщение нарисовать себя на холсте, передается поле
		g.setColor(Color.black); // ставим цвет -- черный 
		if (firstCard == null) {
			g.drawRect(x, y, Card.width, Card.height); // нарисовать прямоугольник, если карт нет
		} else {
			firstCard.draw(g, x, y); // шлем сообщение первой карте, чтобы она себя отрисовала в координатах нашей стопки
		}
	}

	public boolean empty() {
		return firstCard == null;
	}

	public boolean includes(final int tx, final int ty) { // включает ли эта стопка указанные координаты
		return x <= tx && tx <= x + Card.width && y <= ty
				&& ty <= y + Card.height;
	}

	public Card pop() { // извлекаем верхнюю карту
		Card result = null;
		if (firstCard != null) { // если стопка не пустая
			result = firstCard;
			firstCard = firstCard.link;
		}
		return result;
	}

	public void select(final int tx, final int ty) { // на эту стопку кликнули
		// do nothing
	}

	public Card top() { // возвратить ссылку на первую карту
		return firstCard;
	}
}