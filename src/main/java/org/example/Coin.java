package org.example;

public class Coin implements IGameEntity{
    Box applicablePosition;
    int value;

    @Override
    public void apply(Player player) {
        if(applicablePosition.equals(player.currentPosition)){
            player.coins += value;
        }
    }
}
