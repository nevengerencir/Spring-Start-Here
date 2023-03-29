package service;

import model.Comment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private Logger logger = LoggerFactory.getLogger(CommentService.class);

    public String publishComment(Comment comment){
logger.info("Publishing comment: " + comment.getText());
return "Sucess";

    }
    @ToLog
    public void deleteComment(Comment comment) {
        logger.info("Deleting comment:" + comment.getText());
    }


}
