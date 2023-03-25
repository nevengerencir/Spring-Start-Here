package services;

import model.Comment;
import proxies.CommentProxy;
import repositories.CommentRepository;

public class CommentService {
    private final CommentRepository repository;
    private final CommentProxy proxy;

    public CommentService(CommentRepository repository, CommentProxy proxy) {
        this.repository = repository;
        this.proxy = proxy;
    }

    public void publishComment(Comment comment) {
        repository.storeComment(comment);
        proxy.sendComment(comment);
    }


}
