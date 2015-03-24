package solitaire;

class SuitPile extends CardPile {

	SuitPile(final int x, final int y) {
		super(x, y);
	}

	public boolean canTake(final Card aCard) {
		if (empty()) { // если стопка пустая
			return aCard.isAce(); // является ли ранг карты равным 0, т.е. тузом
		}
		Card topCard = top(); // получаем верхнюю карту
		return (aCard.getSuit() == topCard.getSuit()) // если карты имеют одну масть
				&& (aCard.getRank() == 1 + topCard.getRank()); // И ранги карт отличаются на 1
	}
}