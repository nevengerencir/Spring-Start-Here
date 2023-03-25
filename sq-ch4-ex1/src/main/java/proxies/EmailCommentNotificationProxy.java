package proxies;

import model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("EMAIL")


public class EmailCommentNotificationProxy implements CommentProxy {
    private String db;

    @Override
    public void sendComment(Comment comment) {
    System.out.println("Sending email: " + comment.getText());
    }
}
