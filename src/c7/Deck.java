package c7;

import java.util.ArrayList;

public class Deck {
	private ArrayList<Cards> myDeck;
	
	public Deck() {
		this.myDeck = new ArrayList<Cards>();
		
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				myDeck.add(new Cards(rank, suit));
			}
		}
	}
	
	public ArrayList<Cards> getDeck() {
		return myDeck;
	}

	public static void main(String[] args) {
		Deck onePack = new Deck();
		
		for (Cards item : onePack.getDeck()) {
			System.out.println(item.getRank() + " " + item.getSuit());
		}
	}
}
