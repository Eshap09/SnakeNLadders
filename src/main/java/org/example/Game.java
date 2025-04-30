package org.example;

import java.util.List;

public class Game {
    Board board;
    List<Player> players;
    Dice dice;
    Player currentPlayer;

    public void play(){
//        starts
        for(Player player: players){
            player.currentPosition = board.getFirstPosition();
        }
        while(true) {
            for (Player player : players) {
                int diceNum = dice.rollDice();
                int currentIndex = player.currentPosition.getIndex() + diceNum;
                player.currentPosition = board.getBoxAt(currentIndex);
                board.applySnakesnLadders(player);

                System.out.println("Player with color " + player.color + "at " + player.currentPosition.getIndex());
                if (player.currentPosition.getIndex() >= 99) {
                    System.out.println("Hurrah Player with color " +  player.color);
                    return;
                }
            }
        }
//        continues till someone wins
//        once someone wins it returns
    }
}

// now analyze the design using OCP


