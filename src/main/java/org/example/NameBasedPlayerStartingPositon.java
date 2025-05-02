package org.example;

import java.util.List;

public class NameBasedPlayerStartingPositon implements IStartPositionStrategy{

    @Override
    public void setStart(List<Player> players, Board board) {
        for(Player player: players){
            player.currentPosition = board.getBoxAt((int)(Math.random() * 20) + 1);
        }
    }
}
