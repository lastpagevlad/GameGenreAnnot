package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class GamePlay {


    @Qualifier("rolePlay")
    private Genre genre;
    private Genre genre1;

    public GamePlay(@Qualifier("rolePlay") Genre genre, @Qualifier("slasherBean") Genre genre1) {
        this.genre = genre;
        this.genre1 = genre1;
    }

    public String playGame(){
        return "Playing " + genre.getGame() + " " + genre1.getGame();

    }
}
