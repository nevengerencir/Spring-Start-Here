package proxies;

import model.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements CommentProxy {
    private String db;

    @Override
    public void sendComment(Comment comment) {
    System.out.println("Sending email: " + comment.getText());
    }
}
