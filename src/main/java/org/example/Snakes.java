package org.example;

public class Snakes implements IGameEntity{
    Box mouth;
    Box tail;

    @Override
    public void apply(Player player) {
        if(mouth.equals(player.currentPosition)){
            System.out.println("snake bite 🐍 at " + player.currentPosition.getIndex());
            player.currentPosition = tail;
            System.out.println("moving to " + player.currentPosition.getIndex());
        }
    }
}
