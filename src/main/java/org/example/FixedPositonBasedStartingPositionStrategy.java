package org.example;

import java.util.List;

public class FixedPositonBasedStartingPositionStrategy implements IStartPositionStrategy{
    Box playerStartingPosition;

    public FixedPositonBasedStartingPositionStrategy(Box playerStartingPosition) {
        this.playerStartingPosition = playerStartingPosition;
    }

    @Override
    public void setStart(List<Player> players, Board board) {
        for(Player player: players){
            player.currentPosition = playerStartingPosition;
        }
    }
}
