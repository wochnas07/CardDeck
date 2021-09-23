import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Card> deckOfCards = new ArrayList<Card>();
		
			for (int suit = 0; suit <= 3; suit++) {
				for (int rank =0; rank <=12; rank++) {
					deckOfCards.add(new Card(rank, suit));
				}
			}
			
			
		// Print # of cards in the deck	
		System.out.println("There are " + deckOfCards.size() + " cards in the deck.");	
			
		Collections.shuffle(deckOfCards);
		
		
		// Print shuffled deck
			System.out.println("\nShuffled Deck:");
			
				for (Card aCard : deckOfCards) {
					System.out.println(aCard);
				}
				
				
		// Print cards sorted by rank		
			System.out.println("\nSorted by Rank:");
			
				deckOfCards.sort(new RankSorter());
				
					for (Card aCard : deckOfCards) {
						System.out.println(aCard);
					}
					
					
		// Print cards sorted by suit and rank
			System.out.println("\nSorted by Suit and Rank:");
			
				deckOfCards.sort(new SuitSorter());
				
					for (Card aCard : deckOfCards) {
						System.out.println(aCard);
					}
	}

}
