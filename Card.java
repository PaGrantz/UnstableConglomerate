class Card{
	//Fields
	String suit;
	boolean faceCard;
	String face;
	int value;
	int order;
	//Static fields
	String HEART = heart;
	String DIAMOND = diamond;
	String CLUB = club;
	String SPADE = spade;
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
						//Other Cases
		}
	}
	//--------------------
	
	//Getters
	public int getValue() { return value; }
	public String getSuit() { return suit; }
	public boolean isFaceCard() { return faceCard; }
	public String getFace() { return face; }
	//-------------------
	
	//Methods
	public boolean isSuit(String s){
		return this.suit.equals(s);
	}
	public int compareValue(Card other){
		if(this.value//FINISH COMPARE
	}

	//-------------------
	






}
