package org.example;

import classes.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(config.ProjectConfig.class);
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
        var randomNumber = context.getBean(Integer.class);
        System.out.println(randomNumber);
        var hello = context.getBean(String.class);
        System.out.println(hello);
    }
}