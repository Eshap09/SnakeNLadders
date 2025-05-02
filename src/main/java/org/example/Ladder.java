package org.example;

public class Ladder implements IGameEntity{
    Box bottom;
    Box top;

    @Override
    public void apply(Player player) {
        if(bottom.equals(player.currentPosition)){
            System.out.println("🪜 at " + player.currentPosition.getIndex());
            player.currentPosition = top;
            System.out.println("moving to " + player.currentPosition.getIndex());
        }
    }
}
