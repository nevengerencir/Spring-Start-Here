package proxies;

import model.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class EmailCommentNotificationProxy implements CommentProxy {
    private String db;

    @Override
    public void sendComment(Comment comment) {
    System.out.println("Sending email: " + comment.getText());
    }
}
