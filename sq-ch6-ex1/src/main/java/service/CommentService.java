package service;

import model.Comment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private Logger logger = LoggerFactory.getLogger(CommentService.class);

    public void publishComment(Comment comment){
logger.info("Publishing comment: " + comment.getText());
    }
}
