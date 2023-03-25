package main;

import model.Comment;
import proxies.EmailCommentNotificationProxy;
import repositories.DbCommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var commentRepository =
                new DbCommentRepository();
        var commentNotificationProxy =
                new EmailCommentNotificationProxy();
        var comment = new Comment();
        comment.setText("I really liked your proposal");
        comment.setAuthor("Neven Gerencir");
        var commentService = new CommentService(commentRepository,commentNotificationProxy);
        commentService.publishComment(comment);

    }
}