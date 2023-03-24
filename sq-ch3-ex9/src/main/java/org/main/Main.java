package org.main;

import beans.Person;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person neven = context.getBean(Person.class);
        neven.setName("neven");
        System.out.println(neven);
    }
}