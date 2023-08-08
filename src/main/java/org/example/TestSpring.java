package org.example;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Genre rolePlay = context.getBean("roleBean", Genre.class);
//        GamePlay gamePlay = new GamePlay(rolePlay);
//        gamePlay.playGame();
//
//
//        Genre slasherPlay = context.getBean("slasherBean", Genre.class);
//        GamePlay gamePlaySlash = new GamePlay(slasherPlay);
//        gamePlaySlash.playGame();

//        GamePlay gamePlay = context.getBean("gamePlay", GamePlay.class);
//        gamePlay.playGame();
        GameStation gameStation = context.getBean("gameStation", GameStation.class);
        System.out.println(gameStation);
        context.close();
    }
}
