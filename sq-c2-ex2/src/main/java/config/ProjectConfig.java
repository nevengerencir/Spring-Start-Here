package config;

import classes.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class ProjectConfig {
    @Bean
    Parrot parrot(){
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }
    @Bean
    String hello(){
        return "hello";
    }
    @Bean
    Integer randomNumber(){
        Random random = new Random();
        return random.nextInt();
    }
}
