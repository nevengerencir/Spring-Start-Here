package main;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var commentService = context.getBean(CommentService.class);
        var commentService2 = context.getBean(CommentService.class);
        System.out.println(commentService2.getCommentRepository() == commentService.getCommentRepository());

    }
}