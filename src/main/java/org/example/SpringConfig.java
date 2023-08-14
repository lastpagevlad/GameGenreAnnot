package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:gamePlay.properties")
public class SpringConfig {
    @Bean
    public RolePlay rolePlay(){
        return new RolePlay();
    }

    @Bean
    public Slasher slasherBean(){
        return new Slasher();
    }

    @Bean
    public GamePlay gamePlay(){
        return new GamePlay(rolePlay(), slasherBean());
    }

    @Bean
    public GameStation gameStation(){
        return new GameStation(gamePlay());
    }
}
