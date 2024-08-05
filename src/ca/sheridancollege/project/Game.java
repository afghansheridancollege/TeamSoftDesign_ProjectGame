
package ca.sheridancollege.project;

import java.util.ArrayList;

public abstract class Game {
    // This is an abstract class that represents a game.
    // It should be extended by a more specific game class BlackjackGame).

    private final String name; // The name of the game
    private ArrayList<Player> players; // The list of players in the game

    public Game(String name) {
        // The constructor for the Game class.
        // It initializes the name of the game and creates an empty list of players.
        this.name = name;
        players = new ArrayList();
        
    }

    // These are getter and setter methods for the name and players properties.
    public String getName() 
    { return name; }
    
    public ArrayList<Player> getPlayers()
    { return players; }
    
    public void setPlayers(ArrayList<Player> players) 
    { this.players = players; }

    // These are abstract methods that should be overridden in the child class.
    // play() should contain the logic for playing the game.
    // declareWinner() should contain the logic for declaring a winner when the game is over.
    public abstract void play();
    public abstract void declareWinner();
}