package CardsGame;

public class GameServise {
    public static void gameStart(){
        Deck deck=new Deck();
        deck.print();
        System.out.println(" ");
        deck.setCards(new Shuffle(deck).shuffle());
        deck.print();
    }
}
