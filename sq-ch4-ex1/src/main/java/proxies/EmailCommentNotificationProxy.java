package proxies;

import model.Comment;

public class EmailCommentNotificationProxy implements CommentProxy {
    private String db;

    @Override
    public void sendComment(Comment comment) {
    System.out.println("Sending email: " + comment.getText());
    }
}
