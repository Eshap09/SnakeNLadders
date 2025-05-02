package org.example;

import java.util.List;

public class TierBasedWinningStrategy  implements IStartPositionStrategy{
    @Override
    public void setStart(List<Player> players, Board board) {
        for(Player player: players){
            if(player.tier == "gold") {
                player.currentPosition = board.getBoxAt(30);
            } else {
                player.currentPosition = board.getBoxAt(0);
            }
        }
    }
}
