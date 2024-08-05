
package ca.sheridancollege.project;

public class BlackjackPlayer extends Player { // BlackjackPlayer extends the base Player class
    private GroupOfCards hand; // The player's hand of cards

    public BlackjackPlayer(String name) { // Constructor for BlackjackPlayer
        super(name); // Call the constructor of the base Player class
        hand = new GroupOfCards(2); // In Blackjack, each player starts with 2 cards
    }
    
    public void addCard(Card card)
    {
        hand.getCards().add(card);
    }
    
    
    public int getHandValue()
    {
        int value =0;
        int aceCount=0;
        for(Card card: hand.getCards())
        {
            BlackjackCard blackjackCard=(BlackjackCard) card;
            
            value += blackjackCard.getValue();
            if(blackjackCard.getValue()==11)
            {
                aceCount++;
            }
        }
        while (value > 21 && aceCount >0)
        {
            value-= 10;
            aceCount--;
        }
        
        return value;
    }
    
    public String getHand()
    {
        return hand.getCards().toString();
    }

    @Override
    public void play() { // Override the play method to define the player's actions during the game
        // Implement the player's actions during the game
    }

}