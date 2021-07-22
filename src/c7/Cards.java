package c7;

public class Cards {
	private Rank rank;
	private Suit suit;
	
	public Cards(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public Suit getSuit() {
		return this.suit;
	}
	
	public Rank getRank() {
		return this.rank;
	}
	
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	
    public String toString() {
        return rank + " of " + suit;
    }
}