package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

            Game game = new Game();

            // Step 1: Create Board
            Board board = new Board();
            board.rowNum = 10;
            board.colNum = 10;
            board.boxes = new ArrayList<>();
            board.snakes = new ArrayList<>();
            board.ladders = new ArrayList<>();

            // Step 2: Create 100 Boxes (numbered 1–100)
            for (int i = 1; i <= 106; i++) {
                Box box = new Box();
                box.num = i;
                board.boxes.add(box);
            }

            // Step 3: Add some Ladders
            Ladder ladder1 = new Ladder();
            ladder1.bottom = board.boxes.get(2);   // box 3
            ladder1.top = board.boxes.get(21);     // box 22
            board.boxes.get(2).ladderTopDestionation = ladder1.top;

            Ladder ladder2 = new Ladder();
            ladder2.bottom = board.boxes.get(10);  // box 11
            ladder2.top = board.boxes.get(29);     // box 30
            board.boxes.get(10).ladderTopDestionation = ladder2.top;

            board.ladders.add(ladder1);
            board.ladders.add(ladder2);

            // Step 4: Add some Snakes
            Snakes snake1 = new Snakes();
            snake1.mouth = board.boxes.get(97);   // box 98
            snake1.tail = board.boxes.get(78);    // box 79
            board.boxes.get(97).snakeTailDestination = snake1.tail;

            Snakes snake2 = new Snakes();
            snake2.mouth = board.boxes.get(89);   // box 90
            snake2.tail = board.boxes.get(69);    // box 70
            board.boxes.get(89).snakeTailDestination = snake2.tail;

            board.snakes.add(snake1);
            board.snakes.add(snake2);

            // Step 5: Create Players
            List<Player> players = new ArrayList<>();

            Player player1 = new Player();
            player1.color = "Red";
            player1.currentPosition = board.boxes.get(0); // Start at box 1

            Player player2 = new Player();
            player2.color = "Blue";
            player2.currentPosition = board.boxes.get(0); // Start at box 1

            players.add(player1);
            players.add(player2);

            // Step 6: Create Dice
            Dice dice = new Dice(6); // assuming Dice class returns 1–6

            // Step 7: Set up Game
            game.board = board;
            game.players = players;
            game.dice = dice;
            game.currentPlayer = players.get(0); // Red starts

            game.play();

        };
}