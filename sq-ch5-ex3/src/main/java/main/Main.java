package main;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context1 = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var context2 = new AnnotationConfigApplicationContext(ProjectConfig.class);
    Boolean b = context2 == context1;
    System.out.println(b);
    }
}