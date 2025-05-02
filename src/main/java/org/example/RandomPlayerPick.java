package org.example;

import java.util.List;

public class RandomPlayerPick implements INextPlayerPickStrategy{
    @Override
    public int pickNextPlayer(int currentIndex, List<Player> player) {
        return (int)(Math.random() *  player.size());
    }
}
