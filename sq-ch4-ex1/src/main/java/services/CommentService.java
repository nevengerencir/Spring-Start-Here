package services;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import proxies.CommentProxy;
import repositories.CommentRepository;
@Component
public class CommentService {
    private final CommentRepository repository;
    private final CommentProxy proxy;
@Autowired
    public CommentService(CommentRepository repository, CommentProxy commentPushNotificationProxy) {
        this.repository = repository;
        this.proxy = commentPushNotificationProxy;
    }

    public void publishComment(Comment comment) {
        repository.storeComment(comment);
        proxy.sendComment(comment);
    }


}
