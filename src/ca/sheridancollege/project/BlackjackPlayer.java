
package ca.sheridancollege.project;

public class BlackjackPlayer extends Player { // BlackjackPlayer extends the base Player class
    private GroupOfCards hand; // The player's hand of cards

    public BlackjackPlayer(String name) { // Constructor for BlackjackPlayer
        super(name); // Call the constructor of the base Player class
        hand = new GroupOfCards(2); // In Blackjack, each player starts with 2 cards
    }

    @Override
    public void play() { // Override the play method to define the player's actions during the game
        // Implement the player's actions during the game
    }
}
