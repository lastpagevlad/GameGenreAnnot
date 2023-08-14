package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class GameStation {
    private int id;
    private GamePlay gamePlay;

    public GameStation(GamePlay gamePlay) {
        this.gamePlay = gamePlay;
    }

    @Override
    public String toString(){
        return "GameStation " + id + " " + gamePlay.playGame();
    }
}
