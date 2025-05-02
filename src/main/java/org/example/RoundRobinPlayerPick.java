package org.example;

import java.util.List;

public class RoundRobinPlayerPick implements INextPlayerPickStrategy{
    @Override
    public int pickNextPlayer(int currentIndex, List<Player> player) {
        return  (currentIndex + 1) % player.size();
    }
}
