package solitaire;

class DeckPile extends CardPile {  // стопка -- колода

	DeckPile(final int x, final int y) {
		// first initialize parent
		super(x, y);
		// then create the new deck
		// first put them into a local pile
		CardPile pileOne = new CardPile(0, 0);
		CardPile pileTwo = new CardPile(0, 0);
		int count = 0;
		for (int i = 0; i < 4; i++) { // идет по мастям
			for (int j = 0; j <= 12; j++) { // и по рангам
				pileOne.addCard(new Card(i, j)); // помещая в первую стопку все карты по мастям и рангам
				count++; // количество карт = 52
			}
		}
		// then pull them out randomly
		for (; count > 0; count--) { // перемешиваем
			int limit = ((int) (Math.random() * 1000)) % count; // сдвигаем колоду
			// move down to a random location
			for (int i = 0; i < limit; i++) {
				pileTwo.addCard(pileOne.pop());
			}
			// then add the card found there
			addCard(pileOne.pop()); // кладем верхнюю карту в нашу новую колоду после сдвига
			// then put the decks back together
			while (!pileTwo.empty()) {
				pileOne.addCard(pileTwo.pop()); // все карты, до этого разделенные, собираем вместе
			}
		}
	}

	public void select(final int tx, final int ty) { // вызываем, когда по стопке кликнули мышкой
		if (empty()) {
			return;
		}
		Card topCard = pop(); // забираем карту
		Solitaire.discardPile.addCard(topCard); // добавляем ее в стопку сброса
		// или не создавать временную переменную, как принято заказчиком или начальником
	}
}