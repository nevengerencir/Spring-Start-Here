package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import components.Parrot;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(config.ProjectConfig.class);
        var p = context.getBean(Parrot.class);
        System.out.println(p.getName());
    }
}