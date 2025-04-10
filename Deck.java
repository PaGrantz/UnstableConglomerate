import java.util.ArrayList;
import java.util.Collections;

class Deck{
	//fields
	int numCards;
	ArrayList<Card> deck;
	//---------
	

	public Deck(){
		numCards = 0;
		deck = new ArrayList<Card>();
	}
	public Deck(int n){//n is how many of each suit, standard is 13 
		numCards = n*4;
		deck = new ArrayList<Card>();
		for(int i=0;i<n;i++){
				deck.add(new Card(Card.HEART, i+1));
				deck.add(new Card(Card.DIAMOND, i+1));
				deck.add(new Card(Card.SPADE, i+1));
				deck.add(new Card(Card.CLUB, i+1));
		}
	}

	//methods
	public String toString(){
		String result = "";
		for(int i=0;i<deck.size();i++){
			result+=deck.get(i).toString()+ ", ";
		}
		return result;
	}
	//----------

	public static void main(String[] args){
		Deck deck = new Deck(13);
		System.out.println(deck);
	}


}
