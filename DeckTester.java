/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String [] Suits = {"Heart", "Spade", "Club", "Diamond"};
		String [] Ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		int [] Values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck bick = new Deck(Ranks ,Suits, Values);
		bick.isEmpty();
		bick.deal();
		System.out.print(bick.deal());
		System.out.println(bick.size());

	}
}
