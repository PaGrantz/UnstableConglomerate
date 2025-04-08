class Card{
	//Fields
	private String suit;
	private boolean faceCard;
	private String face;
	private int value;
	private int order;
	//Static fields
	public String HEART = heart;
	public String DIAMOND = diamond;
	public String CLUB = club;
	public String SPADE = spade;
	//-------------------
	
	//Constructors
	public Card(){
		suit = null;
		face=null;
		faceCard=false;
		value=null;
		order = null;
	}
	public Card(String s, int v){
		suit = s;
		faceCard = false;
		value = v;
		face = "num";
		order = v;
	}
	public Card(String s, String f){
		suit = s;
		faceCard = true;
		value = 10;
		face = f;
		switch (f){
			case K: order = 13;
			case Q: order = 12;
			case J: order = 11;
			case A: order = 1;
		}
	}
	//--------------------
	
	//Getters
	public int getValue() { return value; }
	public int getOrder() { return order; }
	public String getSuit() { return suit; }
	public boolean isFaceCard() { return faceCard; }
	public String getFace() { return face; }
	//-------------------
	
	//Methods
	public boolean isSuit(String s){
		return this.suit.equals(s);
	}
	public int compareValue(Card other){
		return this.order-other.getOrder();
	}
	public boolean compareSuit(Card other){
		return this.suit.equals(other.getSuit());
	}
	public String toString(){
		if(faceCard || face.equals("A")){
			return face + " of " + suit;
		}
		return "" + value + " of " +suit;
	}
	//-------------------

}
