package ca.sheridancollege.project;
import java.util.ArrayList;
import java.util.List;

public class Dealer {
    private List<Card> hand;
    private Deck deck;
    // Constructor for the Dealer class
    
    
    public Dealer() {
        this.deck = new Deck();
    
        this.deck.shuffle();
    }
}