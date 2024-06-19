
package ca.sheridancollege.project;

public abstract class Player {
    // This is an abstract class that represents a player in a game.
    // It should be extended by a more specific player class BlackjackPlayer).

    private String name; // The name of the player

    public Player(String name) {
        // The constructor for the Player class.
        // It initializes the name of the player.
        this.name = name;
    }

    // These are getter and setter methods for the name property.
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    // This is an abstract method that should be overridden in the child class.
    // play() should contain the logic for the player's actions during the game.
    public abstract void play();
}

