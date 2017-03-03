package pkgPokerBLL;

import java.util.ArrayList;
import java.util.UUID;

import pkgPokerEnum.eRank;

public class Deck {

	private UUID DeckID;
	private ArrayList<Card> DeckCards = new ArrayList<Card>();
	
	public Deck()
	{
		this.DeckID = DeckID;
		this.DeckCards = DeckCards;
		
		//TODO: Implement This Constructor (no-arg Deck should build up a deck with 52 cards)
		
		//	This method will do a for/each, returning each rank in the enum.
		for (eRank Rank : eRank.values()) {
			System.out.println(Rank.getiRankNbr());
		}
	}
	
	public Card DrawCard()
	{
		int[] deck = new int[52];
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4","5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		// Initialize the cards
		for (int i = 0; i < deck.length; i ++)
			deck[i] = i;
		
		// Shuffle the cards
		for (int i = 0; i < deck.length; i++){
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		
		// Display the five cards
		for (int i = 0; i < 5; i++){
				String suit = suits[deck[i] / 13];
				String rank = ranks[deck[i] % 13];
				System.out.println("Card" + deck[i] + ":" + rank + "of" + suit);
			
			}
		//	TODO: Implement this method... should draw a card from the deck.
		
		return null;
	}
}
