/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author basil
 */
public class Deck extends GroupOfCards{
    
    public Deck()
    {
        super(52);// A deck has 52 cards
        String[] suits={"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks={"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        for(String suit: suits)
        {
            for(String rank: ranks)
            {
                getCards().add(new BlackjackCard(suit,rank));
                
            }
        }
    }
    
    public Card drawCard()
    {
        return getCards().remove(0);
    }
    
}
