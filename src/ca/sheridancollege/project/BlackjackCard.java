
package ca.sheridancollege.project;

public class BlackjackCard extends Card { // BlackjackCard extends the base Card class
    private String suit; // The suit of the card (e.g., Hearts, Diamonds)
    private String rank; // The rank of the card (e.g., Ace, 2, 3, ..., King)

    public BlackjackCard(String suit, String rank) { // Constructor for BlackjackCard
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() { // Override the toString method to return a string representation of the card
        return rank + " of " + suit;
    }
}
