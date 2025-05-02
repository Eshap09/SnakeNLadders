package org.example;

import java.util.List;

public interface INextPlayerPickStrategy {

    int pickNextPlayer(int currentIndex, List<Player> player);
}
