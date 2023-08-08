package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class RolePlay implements Genre{

    @PostConstruct
    public void doMyInit(){
        System.out.println("Start dnd");
    }
    @Override
    public List getGame(){ //создается список игр и возвращает список, но итоговым результатом в GamePlay выводит строку
        List<String> rpgGames = new ArrayList<String>();
        rpgGames.add("Dragon Age");
        rpgGames.add("Dragon Dogma");
        rpgGames.add("Final Fantasy 7");
        return rpgGames;
//        return "Baldurs Gate3";
    }
}
