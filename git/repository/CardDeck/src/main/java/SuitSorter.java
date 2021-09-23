import java.util.Comparator;

public class SuitSorter implements Comparator<Card>
{

		public int compare(Card c1, Card c2) {
			return c1.getSuit() - c2.getSuit();
		}
}
