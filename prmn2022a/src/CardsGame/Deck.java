package CardsGame;

public class Deck {
    private Card[] cards=new Card[52];

    public Deck(){
        String suit;
        for (int i=0; i <cards.length;i++){
            if (i<13){
                suit="heart";
            }
            else if (i<26){
                suit ="spade";
            } else if (i<39) {
                suit ="club";
            }else suit="diamond";

            cards[i]=new Card(suit,i%13+1);
        }
    }

    public void print(){
        for (Card c:cards){
            System.out.println(c.getSuit()+" "+c.getNumber());
        }
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }
}
