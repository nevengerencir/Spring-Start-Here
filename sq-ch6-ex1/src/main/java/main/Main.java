package main;


import config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;
import model.Comment;

public class Main {



        public static void main(String[] args) {
            var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
            var service = context.getBean(CommentService.class);
            Comment comment = new Comment();
            comment.setText("I am a comment without an author");
            service.publishComment(comment);
        }}