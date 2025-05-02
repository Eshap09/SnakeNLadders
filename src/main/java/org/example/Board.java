package org.example;

import java.util.List;

public class Board {
    int rowNum;
    int colNum;
    List<Box> boxes;
    List<Snakes> snakes;
    List<Ladder> ladders;
    List<Coin> coins;

    List<IGameEntity> entities;

    public Box getFirstPosition() {
        return boxes.get(0);
    }

    public Box getBoxAt(int index) {
        if (index >= 0 && index < boxes.size()) {
            return boxes.get(index);
        }
        return null;
    }

    public void applySnakesnLadders(Player player) {
//        for(Snakes snake: snakes){
//            if(snake.mouth.equals(player.currentPosition)){
//                player.currentPosition = snake.tail;
//            }
//        }
//
//        for(Ladder ladder: ladders){
//            if(ladder.bottom.equals(player.currentPosition)){
//                player.currentPosition = ladder.top;
//            }
//        }
//
//        for(Coin coin: coins){
//            if(coin.applicablePosition.equals(player.currentPosition)){
//                player.coins += coin.value;
//            }
//        }

        for(IGameEntity entity: entities){
            entity.apply(player);
        }
    }
}
