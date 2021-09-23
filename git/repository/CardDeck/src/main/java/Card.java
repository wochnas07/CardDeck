
public class Card {

	private Integer suit;
	private Integer rank;
	
	public Card(Integer rank, Integer suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public String toString() {
		String[] ranks = {"TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", 
							"NINE", "TEN", "JACK", "QUEEN", "KING", "ACE"};
		String[] suits = {"CLUBS", "DIAMONDS", "HEARTS", "SPADES"};
		String cardLabel = ranks[this.rank] + " of " + suits[this.suit];
		return cardLabel;
	}
		
	public int getRank() {
		return rank;
	}
	
	public int getSuit() {
		return suit;
	}
}
