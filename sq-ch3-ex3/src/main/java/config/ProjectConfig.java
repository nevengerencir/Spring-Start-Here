package config;

import classes.Parrot;
import classes.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("koko");
        return p;
    }
    @Bean
    public Person person(Parrot parrot){
    Person person = new Person();
    person.setName("Johan");
    person.setParrot(parrot);
    return person;
    }
}
