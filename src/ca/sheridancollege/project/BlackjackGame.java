
package ca.sheridancollege.project;

public class BlackjackGame extends Game { // BlackjackGame extends the base Game class
    private Deck deck; //The deck of the cards for the game
    public BlackjackGame(String name) { // Constructor for BlackjackGame
        super(name); // Call the constructor of the base Game class
        deck=new Deck();
    }

    @Override
    public void play() { // Override the play method to control the flow of the game
        // Control the flow of the game
    }

    @Override
    public void declareWinner() { // Override the declareWinner method to determine the winner of the game
        // Determine the winner of the game
    }
}

