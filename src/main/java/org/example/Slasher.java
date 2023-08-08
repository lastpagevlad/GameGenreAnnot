package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component("slasherBean")
public class Slasher implements Genre{

    @PreDestroy
    public void crashSlash(){
        System.out.println("Light off");
    }
    @Override
    public List getGame(){
        List<String> slasherGames = new ArrayList<String>();
        slasherGames.add("Dragon Age");
        slasherGames.add("Dragon Dogma");
        slasherGames.add("Final Fantasy 7");
        return slasherGames;
//        return "Devil May Cry 3";
    }
}
