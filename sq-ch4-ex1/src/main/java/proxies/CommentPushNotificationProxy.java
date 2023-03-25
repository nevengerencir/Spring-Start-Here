package proxies;

import model.Comment;
import org.springframework.stereotype.Component;

@Component
public class CommentPushNotificationProxy implements CommentProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment: " + comment.getText());
    }
}
