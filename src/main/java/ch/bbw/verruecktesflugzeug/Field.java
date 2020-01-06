package ch.bbw.verruecktesflugzeug;

import java.util.HashMap;

public class Field {

	Card[][] cards = new Card[3][3];
	 HashMap<String , Card> history = new HashMap<>();
	private int x =0;
	private int y = 0;

	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}
	public Object getLastCard() {
		// TODO Auto-generated method stub
		return null;
	}
	public Field addedIfFits(Card card) {
		

		if(x == 0 && y == 0) {
			this.cards[x][y] = card;
		}
		return null;
	}

		
}
