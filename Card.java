class Card{
	//Fields
	private String suit;
	private boolean faceCard;
	private String face;
	private int value;
	private int order;
	//Static fields
	public static String HEART = "heart";
	public static String DIAMOND = "diamond";
	public static String CLUB = "club";
	public static String SPADE = "spade";
	//-------------------
	
	//Constructors
	public Card(){
	}
	public Card(String s, int v){
		suit = s;
		order = v;
		if(v==1){
			faceCard = false;
			value = 1;
			face = "A";
		}
		else if(v==11 || v==12 || v==13){
			faceCard = true;
			value = 10;
			if(v == 13) {face = "K";}
			if(v == 12) {face = "Q";}
			if(v == 11) {face = "J";}
		}
		else{
			faceCard = false;
			value = v;
			face = "num";
		}
	}
	public Card(String s, String f){
		suit = s;
		if(f.equals("K") || f.equals("Q") || f.equals("J")){
			faceCard = true;}
		value = 10;
		face = f;
		switch (f){
			case "K": order = 13;
			case "Q": order = 12;
			case "J": order = 11;
			case "A": order = 1;
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
