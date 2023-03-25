package main;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import proxies.EmailCommentNotificationProxy;
import repositories.DbCommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var commentService = context.getBean(CommentService.class);
        var comment = new Comment();
        comment.setText("I really liked your idea.");
        comment.setAuthor("Neven Gerencir");
      commentService.publishComment(comment);

    }
}