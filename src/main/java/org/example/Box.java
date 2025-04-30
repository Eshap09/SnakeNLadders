package org.example;

public class Box {
    int num;
    Box destination;
    Box snakeTailDestination;
    Box ladderTopDestionation;

//    public Box(int i) {
//        this.num =0;
//    }

    public int getIndex(){
        return num;
    }

    void applySnakesnLadders(Player player) {
        if (snakeTailDestination != null) {
            player.currentPosition = snakeTailDestination;
        }
        if(ladderTopDestionation !=null){
            player.currentPosition = ladderTopDestionation;
        }
    }


}
