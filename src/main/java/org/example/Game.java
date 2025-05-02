package org.example;

import java.util.List;

public class Game {
    Board board;
    List<Player> players;
    Dice dice;

    public Game(Board board, List<Player> players, Dice dice, int currentPlayerIndex, INextPlayerPickStrategy nextPlayerPickStrategy, IStartPositionStrategy startPositionStrategy, IWinningStrategy winningStrategy) {
        this.board = board;
        this.players = players;
        this.dice = dice;
        this.currentPlayerIndex = currentPlayerIndex;
//        this.currentPlayer = currentPlayer;
        this.nextPlayerPickStrategy = nextPlayerPickStrategy;
        this.startPositionStrategy = startPositionStrategy;
        this.winningStrategy = winningStrategy;
    }

    int currentPlayerIndex;
//    Player currentPlayer;
    INextPlayerPickStrategy nextPlayerPickStrategy;
    IStartPositionStrategy startPositionStrategy;
    IWinningStrategy winningStrategy;

    public void play(){
//        starts
//        for(Player player: players){
//            player.currentPosition = board.getFirstPosition();
//        }
        startPositionStrategy.setStart(players,board);
        while(true) {
            Player player = players.get(currentPlayerIndex);
            System.out.println("Player with color " + player.color + " turn " + "currently at " + player.currentPosition.getIndex());
            int diceNum = dice.rollDice();
            System.out.println("Dice gave: " + diceNum);
            int currentIndex = player.currentPosition.getIndex() + diceNum;
            System.out.println("Current index: "+ currentIndex);
            player.currentPosition = board.getBoxAt(currentIndex);
            board.applySnakesnLadders(player);

            System.out.println("Player with color " + player.color + " at " + player.currentPosition.getIndex());
            if (winningStrategy.checkWinningCondition(player)) {
                System.out.println("Hurrah Player with color " + player.color);
                return;
            }
            currentPlayerIndex = nextPlayerPickStrategy.pickNextPlayer(currentPlayerIndex, players);
        }
//        continues till someone wins
//        once someone wins it returns
    }
}
//

// now analyze the design using OCP

// dice size > 6 or 2 dices
//  - if 6 another chance

// Another other entity like dragon making player died
// skip your turn
// coins or XP on some box -> if player with some coins greater than a value wins
// number of player more than 2
// ordering of player -> roundrobin

//OCP:
//	* When new requirements come in, you should be able to extend your design without modifying your existing classes.
//	* When new requirements come in, you should be able to incorporate those in your design without modifying your existing classes.

//    New requirements:
//
//        * Number of players more than 2.  -> No Change in current design as we Accept a list
//        * Other than snake & ladder
//        * Board has coins now. or Xp.
//        Coins - 2 class changes(1 in Board i.e List<Coins> and in apply method also need to change to incorporate coins and player to add 1 more poroperty and 1 Coin class to add and 1 addition. -> 2 changes reduced to 1.
//        * Dragon - make you die
//        * Butterfly -> fly you to 0.
//        * Snake has more than one mouth.
//        * You dont need ladder/snake/coins.
//        * Ordering of players - other than round robin. -> 1 -> 0
//        * Skipping died players.
//        * Winning by moving to 100 and min 10 coins.
//        * Instead of 0, start with some other position. ->
//              ----* Variable for different players.
//
//        * More dimensions to the board.
//        * Dice size can be more than 6. Or instead of 1 dice, you throw 2 dices.
//        * More rules for dice, if get 6, another chance.
//        * Skip your turn.