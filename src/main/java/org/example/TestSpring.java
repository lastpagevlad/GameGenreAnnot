package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        GameStation gameStation = context.getBean("gameStation", GameStation.class);
        System.out.println(gameStation);
        context.close();








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
    }
}
