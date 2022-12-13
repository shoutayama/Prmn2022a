package CardsGame;

import java.util.Random;

public class Shuffle {
    private Card[] cards;

    public Shuffle(Deck deck){
        if (deck!=null) this.cards= deck.getCards();
        else throw new RuntimeException("Deck error");
    }

    public Card[] shuffle(int n){
        Random random=new Random();
        for (int i=0;i<n;i++){
            for (int j=0;j<52;j++){
                int r= random.nextInt(52);
                swap(r,j);
            }
        }
        return cards;
    }
    public Card[] shuffle(){
        Random random=new Random();
            for (int j=0;j<52;j++){
                int r= random.nextInt(52);
                swap(r,j);
            }
        return cards;
    }
    private void swap(int a,int b){
        Card t=cards[a];
        cards[a]=cards[b];
        cards[b]=t;
    }
}
