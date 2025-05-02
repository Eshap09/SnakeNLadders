package org.example;

public class CrossPointsWinningStrategy implements IWinningStrategy{

    int value;

    public CrossPointsWinningStrategy(int value) {
        this.value = value;
    }

    @Override
    public boolean checkWinningCondition(Player player) {
        return player.coins >= value;
    }
}
