package org.example;

public class CrossHundredWinningStrategy implements IWinningStrategy{
    @Override
    public boolean checkWinningCondition(Player player) {
        return player.currentPosition.getIndex() >= 99;
    }
}
