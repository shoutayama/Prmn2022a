package CardsGame;

import java.util.Scanner;

public class Card {
    private String suit;
    private int number;

    public Card(String suit){
        this(suit,0);
    }
    public Card(String suit,int number){
        switch (suit){
            case "heart":
            case "spade":
            case "club":
            case "diamond":
                this.suit=suit;
                if (number>0&&number<14) {
                    this.number = number;
                }
                else throw new RuntimeException("error");
                break;
            case "joker":
                this.suit=suit;
                break;
            default:
                throw new RuntimeException("error");
        }
    }

    public int getNumber() {
        return number;
    }

    public String getSuit() {
        return suit;
    }
}
