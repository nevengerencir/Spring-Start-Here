package main;

import config.ProjectConfig;
import objects.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var p = context.getBean("Miki",Parrot.class);
        System.out.println(p.getName());
        var p2 = context.getBean("parrot2",Parrot.class);
        System.out.println(p2.getName());
    }
}