package main;

import components.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(config.ProjectConfig.class);
        Parrot y = new Parrot();
        y.setName("Kiki");
        Supplier<Parrot> parrotSupplier = () -> y;
        context.registerBean("parrot1",
                Parrot.class, parrotSupplier);
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
    }
}