package services;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import proxies.CommentProxy;
import repositories.CommentRepository;
@Service
public class CommentService {
    private final CommentRepository repository;
    private final CommentProxy proxy;
@Autowired
    public CommentService(CommentRepository repository,@Qualifier("PUSH") CommentProxy proxy) {
        this.repository = repository;
        this.proxy = proxy;
    }

    public void publishComment(Comment comment) {
        repository.storeComment(comment);
        proxy.sendComment(comment);
    }


}
