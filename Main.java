public class Main {
    public static void main(String[] args){
        System.out.println("---Running Gin---");
        Deck deck = new Deck(13);
        Deck discard = new Deck();
        Deck playerHand = new Deck();
        deck.shuffle();
        for(int x = 0; x<10;x++){
            playerHand.add(deck.deal());
        }
        System.out.println(playerHand);
    }
}
