/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author basil
 */
public class BlackjackMain {
    public static void main(String[] args) {
    BlackjackGame game= new BlackjackGame("Blackjack");
    ArrayList<Player> players= new ArrayList<>();
    players.add(new BlackjackPlayer("Player 1"));
    game.setPlayers(players);
    game.play();
            
    }
}
