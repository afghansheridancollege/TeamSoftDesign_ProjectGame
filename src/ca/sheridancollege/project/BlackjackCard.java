
package ca.sheridancollege.project;

public class BlackjackCard extends Card { // BlackjackCard extends the base Card class
    private String suit; // The suit of the card (e.g., Hearts, Diamonds)
    private String rank; // The rank of the card (e.g., Ace, 2, 3, ..., King)

    public BlackjackCard(String suit, String rank) { // Constructor for BlackjackCard
        this.suit = suit;
        this.rank = rank;
    }

    public int getValue()
    {
        switch(rank)
        {
            case "Ace":
                return 11; //Ace can be 1 or 11
               
            case "2":
                return 2;
                
            case "3":
                return 3;
                
            case "4":
                return 4;
                
            case "5":
                return 5;
                
            case "6":
                return 6;
                
            case "7":
                return 7;
                
            case "8":
                return 8;
               
            case "9":
                return 9;
                
            case "10":
            case "Jack":
            case "Queen":
            case "King":
                return 10;
                
            default: 
                throw new IllegalArgumentException("Invalid card rank: " + rank);
                    
        }
    }
    @Override
    public String toString() { // Override the toString method to return a string representation of the card
        return rank + " of " + suit;
    }
}
