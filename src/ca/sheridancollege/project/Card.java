/**
 * SYST 17796 Project - Blackjack Game
 * This project is developed by Enes, Irtaza, Basil, and Aman.
 * The goal of this project is to create a simple text-based Blackjack game in Java.
 */
package ca.sheridancollege.project;

/**
 * Blackjack is a card game where the goal is to have a hand value as close to 21 as possible, without exceeding it. 
 * The game begins with each player, including the dealer, being dealt two cards. 
 * Players are then given the option to "hit" (draw additional cards) to improve their hand value, or "stand" (not draw any more cards) if they believe their current hand value is sufficient to beat the dealer. 
 * Face cards (King, Queen, Jack) are worth 10 points, Aces are worth either 1 or 11 points (player's choice), and all other cards are worth their face value. 
 * If a player's hand value exceeds 21, they "bust" and automatically lose the round. 
 * Once all players have finished their turns, the dealer reveals their hidden card and may draw additional cards according to predefined rules (usually, the dealer must hit until their hand value is at least 17). 
 * Players who did not bust compare their hand values to the dealer's. If the player's hand value is higher than the dealer's, or if the dealer busts, the player wins the round.
 */

public abstract class Card {
    // This is an abstract class that represents a card in a card game.
    // It should be extended by a more specific card class BlackjackCard).

    // This method should be overridden in the child class to return a string representation of the card.
    @Override
    public abstract String toString();
    
}
