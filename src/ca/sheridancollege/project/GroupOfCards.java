
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

public class GroupOfCards {
    // This class represents a group of cards (like a hand or a deck).
    // It could be used as-is, or it could be extended by a more specific group class BlackjackHand).

    private ArrayList<Card> cards; // The list of cards in the group
    private int size; // The size of the group

    public GroupOfCards(int size) {
        // The constructor for the GroupOfCards class.
        // It initializes the size of the group.
        this.size = size;
        cards= new ArrayList<>(size);
    }

    // These are getter and setter methods for the cards and size properties.
    public ArrayList<Card> getCards()
    { return cards; }
    
    public int getSize() 
    { return size; }
    
    public void setSize(int size) 
    { this.size = size; }

    // This method shuffles the cards in the group.
    public void shuffle() {
        Collections.shuffle(cards);
    }
}
