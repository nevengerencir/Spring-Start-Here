package main;


import aspects.LoggingAspect;
import config.ProjectConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;
import model.Comment;

public class Main {



        public static void main(String[] args) {
             Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
            var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
            var service = context.getBean(CommentService.class);
            Comment comment = new Comment();
            comment.setText("I am a comment without an author");
            String value = service.publishComment(comment);
            logger.info(value);
        }}